package typings.antd.anon

import typings.antd.generatePickerMod.PickerProps
import typings.rcPicker.pickerMod.PickerDateProps
import typings.rcPicker.pickerMod.PickerTimeProps
import typings.react.mod.ComponentClass
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePicker[DateType] extends js.Object {
  var DatePicker: ComponentClass[PickerProps[DateType], _] = js.native
  var MonthPicker: ComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ], 
    _
  ] = js.native
  var QuarterPicker: ComponentClass[
    Pick[
      (Pick[
        PickerTimeProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ], 
    _
  ] = js.native
  var TimePicker: ComponentClass[
    Pick[
      (Pick[
        PickerTimeProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ], 
    _
  ] = js.native
  var WeekPicker: ComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ], 
    _
  ] = js.native
  var YearPicker: ComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ], 
    _
  ] = js.native
}

object DatePicker {
  @scala.inline
  def apply[DateType](
    DatePicker: ComponentClass[PickerProps[DateType], _],
    MonthPicker: ComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ], 
      _
    ],
    QuarterPicker: ComponentClass[
      Pick[
        (Pick[
          PickerTimeProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ], 
      _
    ],
    TimePicker: ComponentClass[
      Pick[
        (Pick[
          PickerTimeProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ], 
      _
    ],
    WeekPicker: ComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ], 
      _
    ],
    YearPicker: ComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ], 
      _
    ]
  ): DatePicker[DateType] = {
    val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], MonthPicker = MonthPicker.asInstanceOf[js.Any], QuarterPicker = QuarterPicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker[DateType]]
  }
  @scala.inline
  implicit class DatePickerOps[Self <: DatePicker[_], DateType] (val x: Self with DatePicker[DateType]) extends AnyVal {
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
    def setDatePicker(value: ComponentClass[PickerProps[DateType], _]): Self = this.set("DatePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthPicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerDateProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("MonthPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuarterPicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerTimeProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("QuarterPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimePicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerTimeProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("TimePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekPicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerDateProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("WeekPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearPicker(
      value: ComponentClass[
          Pick[
            (Pick[
              PickerDateProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ], 
          _
        ]
    ): Self = this.set("YearPicker", value.asInstanceOf[js.Any])
  }
  
}

