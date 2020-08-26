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

@js.native
trait MonthPicker[DateType] extends js.Object {
  var MonthPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ], 
    _
  ] = js.native
  var QuarterPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ], 
    _
  ] = js.native
  var RangePicker: ComponentClass[RangePickerProps[DateType], ComponentState] = js.native
  var TimePicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ], 
    _
  ] = js.native
  var WeekPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ], 
    _
  ] = js.native
  var YearPicker: ComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ], 
    _
  ] = js.native
}

object MonthPicker {
  @scala.inline
  def apply[DateType](
    MonthPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ], 
      _
    ],
    QuarterPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerTimeProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ], 
      _
    ],
    RangePicker: ComponentClass[RangePickerProps[DateType], ComponentState],
    TimePicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerTimeProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ], 
      _
    ],
    WeekPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ], 
      _
    ],
    YearPicker: ComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ], 
      _
    ]
  ): MonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], QuarterPicker = QuarterPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthPicker[DateType]]
  }
  @scala.inline
  implicit class MonthPickerOps[Self <: MonthPicker[_], DateType] (val x: Self with MonthPicker[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMonthPicker(
      value: ComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("MonthPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuarterPicker(
      value: ComponentClass[
          Pick[
            InjectDefaultProps[PickerTimeProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("QuarterPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangePicker(value: ComponentClass[RangePickerProps[DateType], ComponentState]): Self = this.set("RangePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimePicker(
      value: ComponentClass[
          Pick[
            InjectDefaultProps[PickerTimeProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("TimePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekPicker(
      value: ComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("WeekPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearPicker(
      value: ComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("YearPicker", value.asInstanceOf[js.Any])
  }
  
}

