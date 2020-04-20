package typings.antd

import typings.antd.generatePickerMod.InjectDefaultProps
import typings.antd.generatePickerMod.RangePickerProps
import typings.rcPicker.pickerMod.PickerDateProps
import typings.rcPicker.pickerMod.PickerTimeProps
import typings.react.mod.ComponentClass
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMonthPicker[DateType] extends js.Object {
  var MonthPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ], 
    _
  ]
  var RangePicker: ComponentClass[RangePickerProps[DateType], _]
  var TimePicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
    ], 
    _
  ]
  var WeekPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ], 
    _
  ]
  var YearPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ], 
    _
  ]
}

object AnonMonthPicker {
  @scala.inline
  def apply[DateType](
    MonthPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ], 
      _
    ],
    RangePicker: ComponentClass[RangePickerProps[DateType], _],
    TimePicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerTimeProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
      ], 
      _
    ],
    WeekPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ], 
      _
    ],
    YearPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ], 
      _
    ]
  ): AnonMonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMonthPicker[DateType]]
  }
}

