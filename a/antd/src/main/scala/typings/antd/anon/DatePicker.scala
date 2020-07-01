package typings.antd.anon

import typings.antd.generatePickerMod.PickerProps
import typings.rcPicker.pickerMod.PickerDateProps
import typings.rcPicker.pickerMod.PickerTimeProps
import typings.react.mod.ComponentClass
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePicker[DateType] extends js.Object {
  var DatePicker: ComponentClass[PickerProps[DateType], _]
  var MonthPicker: ComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 99 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
    ], 
    _
  ]
  var TimePicker: ComponentClass[
    Pick[
      (Pick[
        PickerTimeProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 108 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 110 */ js.Any
    ], 
    _
  ]
  var WeekPicker: ComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 99 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
    ], 
    _
  ]
  var YearPicker: ComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 99 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
    ], 
    _
  ]
}

object DatePicker {
  @scala.inline
  def apply[DateType](
    DatePicker: ComponentClass[PickerProps[DateType], _],
    MonthPicker: ComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 99 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
      ], 
      _
    ],
    TimePicker: ComponentClass[
      Pick[
        (Pick[
          PickerTimeProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 108 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 110 */ js.Any
      ], 
      _
    ],
    WeekPicker: ComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 99 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
      ], 
      _
    ],
    YearPicker: ComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 99 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
      ], 
      _
    ]
  ): DatePicker[DateType] = {
    val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], MonthPicker = MonthPicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker[DateType]]
  }
}

