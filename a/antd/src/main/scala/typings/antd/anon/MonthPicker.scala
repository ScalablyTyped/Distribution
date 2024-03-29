package typings.antd.anon

import typings.antd.antdStrings.components
import typings.antd.antdStrings.generateConfig
import typings.antd.antdStrings.hideHeader
import typings.antd.antdStrings.locale
import typings.antd.antdStrings.picker
import typings.antd.libDatePickerGeneratePickerInterfaceMod.PickerComponentClass
import typings.antd.libDatePickerGeneratePickerMod.PickerProps
import typings.antd.libDatePickerGeneratePickerMod.RangePickerProps
import typings.rcPicker.esPickerMod.PickerTimeProps
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonthPicker[DateType] extends StObject {
  
  var MonthPicker: PickerComponentClass[Omit[PickerProps[DateType] & PopupClassName, picker], Any]
  
  var QuarterPicker: PickerComponentClass[
    Omit[
      Placement & (Omit[PickerTimeProps[DateType], locale | generateConfig | hideHeader | components]), 
      picker
    ], 
    Any
  ]
  
  var RangePicker: PickerComponentClass[RangePickerProps[DateType] & DropdownClassName, Any]
  
  var TimePicker: PickerComponentClass[
    Omit[
      Placement & (Omit[PickerTimeProps[DateType], locale | generateConfig | hideHeader | components]), 
      picker
    ], 
    Any
  ]
  
  var WeekPicker: PickerComponentClass[Omit[PickerProps[DateType] & PopupClassName, picker], Any]
  
  var YearPicker: PickerComponentClass[Omit[PickerProps[DateType] & PopupClassName, picker], Any]
}
object MonthPicker {
  
  inline def apply[DateType](
    MonthPicker: PickerComponentClass[Omit[PickerProps[DateType] & PopupClassName, picker], Any],
    QuarterPicker: PickerComponentClass[
      Omit[
        Placement & (Omit[PickerTimeProps[DateType], locale | generateConfig | hideHeader | components]), 
        picker
      ], 
      Any
    ],
    RangePicker: PickerComponentClass[RangePickerProps[DateType] & DropdownClassName, Any],
    TimePicker: PickerComponentClass[
      Omit[
        Placement & (Omit[PickerTimeProps[DateType], locale | generateConfig | hideHeader | components]), 
        picker
      ], 
      Any
    ],
    WeekPicker: PickerComponentClass[Omit[PickerProps[DateType] & PopupClassName, picker], Any],
    YearPicker: PickerComponentClass[Omit[PickerProps[DateType] & PopupClassName, picker], Any]
  ): MonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], QuarterPicker = QuarterPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthPicker[DateType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonthPicker[?], DateType] (val x: Self & MonthPicker[DateType]) extends AnyVal {
    
    inline def setMonthPicker(value: PickerComponentClass[Omit[PickerProps[DateType] & PopupClassName, picker], Any]): Self = StObject.set(x, "MonthPicker", value.asInstanceOf[js.Any])
    
    inline def setQuarterPicker(
      value: PickerComponentClass[
          Omit[
            Placement & (Omit[PickerTimeProps[DateType], locale | generateConfig | hideHeader | components]), 
            picker
          ], 
          Any
        ]
    ): Self = StObject.set(x, "QuarterPicker", value.asInstanceOf[js.Any])
    
    inline def setRangePicker(value: PickerComponentClass[RangePickerProps[DateType] & DropdownClassName, Any]): Self = StObject.set(x, "RangePicker", value.asInstanceOf[js.Any])
    
    inline def setTimePicker(
      value: PickerComponentClass[
          Omit[
            Placement & (Omit[PickerTimeProps[DateType], locale | generateConfig | hideHeader | components]), 
            picker
          ], 
          Any
        ]
    ): Self = StObject.set(x, "TimePicker", value.asInstanceOf[js.Any])
    
    inline def setWeekPicker(value: PickerComponentClass[Omit[PickerProps[DateType] & PopupClassName, picker], Any]): Self = StObject.set(x, "WeekPicker", value.asInstanceOf[js.Any])
    
    inline def setYearPicker(value: PickerComponentClass[Omit[PickerProps[DateType] & PopupClassName, picker], Any]): Self = StObject.set(x, "YearPicker", value.asInstanceOf[js.Any])
  }
}
