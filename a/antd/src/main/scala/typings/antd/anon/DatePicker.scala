package typings.antd.anon

import typings.antd.generatePickerMod.PickerProps
import typings.rcPicker.pickerMod.PickerDateProps
import typings.rcPicker.pickerMod.PickerTimeProps
import typings.react.mod.ComponentClass
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePicker[DateType] extends StObject {
  
  var DatePicker: ComponentClass[PickerProps[DateType], js.Any]
  
  var MonthPicker: ComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]) & Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ], 
    js.Any
  ]
  
  var QuarterPicker: ComponentClass[
    Pick[
      (Pick[
        PickerTimeProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
      ]) & Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ], 
    js.Any
  ]
  
  var TimePicker: ComponentClass[
    Pick[
      (Pick[
        PickerTimeProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
      ]) & Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ], 
    js.Any
  ]
  
  var WeekPicker: ComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]) & Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ], 
    js.Any
  ]
  
  var YearPicker: ComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]) & Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ], 
    js.Any
  ]
}
object DatePicker {
  
  inline def apply[DateType](
    DatePicker: ComponentClass[PickerProps[DateType], js.Any],
    MonthPicker: ComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
        ]) & Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ], 
      js.Any
    ],
    QuarterPicker: ComponentClass[
      Pick[
        (Pick[
          PickerTimeProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
        ]) & Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ], 
      js.Any
    ],
    TimePicker: ComponentClass[
      Pick[
        (Pick[
          PickerTimeProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
        ]) & Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ], 
      js.Any
    ],
    WeekPicker: ComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
        ]) & Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ], 
      js.Any
    ],
    YearPicker: ComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
        ]) & Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ], 
      js.Any
    ]
  ): DatePicker[DateType] = {
    val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], MonthPicker = MonthPicker.asInstanceOf[js.Any], QuarterPicker = QuarterPicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker[DateType]]
  }
  
  extension [Self <: DatePicker[?], DateType](x: Self & DatePicker[DateType]) {
    
    inline def setDatePicker(value: ComponentClass[PickerProps[DateType], js.Any]): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
    
    inline def setMonthPicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerDateProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
            ]) & Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ], 
          js.Any
        ]
    ): Self = StObject.set(x, "MonthPicker", value.asInstanceOf[js.Any])
    
    inline def setQuarterPicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerTimeProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
            ]) & Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ], 
          js.Any
        ]
    ): Self = StObject.set(x, "QuarterPicker", value.asInstanceOf[js.Any])
    
    inline def setTimePicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerTimeProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
            ]) & Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ], 
          js.Any
        ]
    ): Self = StObject.set(x, "TimePicker", value.asInstanceOf[js.Any])
    
    inline def setWeekPicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerDateProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
            ]) & Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ], 
          js.Any
        ]
    ): Self = StObject.set(x, "WeekPicker", value.asInstanceOf[js.Any])
    
    inline def setYearPicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerDateProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
            ]) & Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ], 
          js.Any
        ]
    ): Self = StObject.set(x, "YearPicker", value.asInstanceOf[js.Any])
  }
}
