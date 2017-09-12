package com.example.hywoman.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public void onClick(View v){

        EditText aa = (EditText) findViewById(R.id.editText2);
        //aa.getText():

        TextView bb = (TextView) findViewById(R.id.textView2);
        bb.setText(aa.getText());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
