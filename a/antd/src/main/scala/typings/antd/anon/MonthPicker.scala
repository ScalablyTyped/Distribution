package typings.antd.anon

import typings.antd.generatePickerMod.InjectDefaultProps
import typings.antd.generatePickerMod.RangePickerProps
import typings.rcPicker.pickerMod.PickerDateProps
import typings.rcPicker.pickerMod.PickerTimeProps
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthPicker[DateType] extends js.Object {
  var MonthPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
    ], 
    _
  ]
  var RangePicker: ComponentClass[RangePickerProps[DateType], ComponentState]
  var TimePicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 110 */ js.Any
    ], 
    _
  ]
  var WeekPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
    ], 
    _
  ]
  var YearPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
    ], 
    _
  ]
}

object MonthPicker {
  @scala.inline
  def apply[DateType](
    MonthPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
      ], 
      _
    ],
    RangePicker: ComponentClass[RangePickerProps[DateType], ComponentState],
    TimePicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerTimeProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 110 */ js.Any
      ], 
      _
    ],
    WeekPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
      ], 
      _
    ],
    YearPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
      ], 
      _
    ]
  ): MonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthPicker[DateType]]
  }
}

