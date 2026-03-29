package com.example.demo_13;
/**
 * @author      Yaara Lugasi.yl7717@bs.amalnet.k12.il
 * @version     1.0
 * @since		29/3/2026
 */

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    public Switch sw;
    public RadioGroup rg;
    public ConstraintLayout myLayout;

    /**
     * @param.sw.שולט בעם שזה נלחץ ישתנה הצבע במידיות שנלחץ על רכיב מקבוצת rg
     * @param.rg.שולט בבחירת הצבע
     * @param.myLayout.רכיב המסך שמשתנה לו הצבע
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLayout = findViewById(R.id.main);
        sw = findViewById(R.id.sw);
        rg = findViewById(R.id.rg);
    }
    public void radioClicked(View view) {
        if (sw.isChecked()) {
            updateBackground();
        }
    }
    public void clicked(View view) {
        if (!sw.isChecked()) {
            updateBackground();
        }
    }
    public void switchClick(View view) {
    }
    public void updateBackground() {
        int checkedId = rg.getCheckedRadioButtonId();

        if (checkedId == R.id.rB1) {
            myLayout.setBackgroundColor(Color.YELLOW);
        } else if (checkedId == R.id.rB2) {
            myLayout.setBackgroundColor(Color.RED);
        } else if (checkedId == R.id.rB3) {
            myLayout.setBackgroundColor(Color.BLUE);
        } else if (checkedId == R.id.rB4) {
            myLayout.setBackgroundColor(Color.GREEN);
        }
    }
}