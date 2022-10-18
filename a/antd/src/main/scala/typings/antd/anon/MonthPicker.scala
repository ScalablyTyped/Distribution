package typings.antd.anon

import typings.antd.antdStrings.picker
import typings.antd.libDatePickerGeneratePickerInterfaceMod.PickerComponentClass
import typings.antd.libDatePickerGeneratePickerMod.PickerDateProps
import typings.antd.libDatePickerGeneratePickerMod.PickerTimeProps
import typings.antd.libDatePickerGeneratePickerMod.RangePickerProps
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonthPicker[DateType] extends StObject {
  
  var MonthPicker: PickerComponentClass[Omit[PickerDateProps[DateType], picker], Any]
  
  var QuarterPicker: PickerComponentClass[Omit[PickerTimeProps[DateType], picker], Any]
  
  var RangePicker: PickerComponentClass[RangePickerProps[DateType], Any]
  
  var TimePicker: PickerComponentClass[Omit[PickerTimeProps[DateType], picker], Any]
  
  var WeekPicker: PickerComponentClass[Omit[PickerDateProps[DateType], picker], Any]
  
  var YearPicker: PickerComponentClass[Omit[PickerDateProps[DateType], picker], Any]
}
object MonthPicker {
  
  inline def apply[DateType](
    MonthPicker: PickerComponentClass[Omit[PickerDateProps[DateType], picker], Any],
    QuarterPicker: PickerComponentClass[Omit[PickerTimeProps[DateType], picker], Any],
    RangePicker: PickerComponentClass[RangePickerProps[DateType], Any],
    TimePicker: PickerComponentClass[Omit[PickerTimeProps[DateType], picker], Any],
    WeekPicker: PickerComponentClass[Omit[PickerDateProps[DateType], picker], Any],
    YearPicker: PickerComponentClass[Omit[PickerDateProps[DateType], picker], Any]
  ): MonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], QuarterPicker = QuarterPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthPicker[DateType]]
  }
  
  extension [Self <: MonthPicker[?], DateType](x: Self & MonthPicker[DateType]) {
    
    inline def setMonthPicker(value: PickerComponentClass[Omit[PickerDateProps[DateType], picker], Any]): Self = StObject.set(x, "MonthPicker", value.asInstanceOf[js.Any])
    
    inline def setQuarterPicker(value: PickerComponentClass[Omit[PickerTimeProps[DateType], picker], Any]): Self = StObject.set(x, "QuarterPicker", value.asInstanceOf[js.Any])
    
    inline def setRangePicker(value: PickerComponentClass[RangePickerProps[DateType], Any]): Self = StObject.set(x, "RangePicker", value.asInstanceOf[js.Any])
    
    inline def setTimePicker(value: PickerComponentClass[Omit[PickerTimeProps[DateType], picker], Any]): Self = StObject.set(x, "TimePicker", value.asInstanceOf[js.Any])
    
    inline def setWeekPicker(value: PickerComponentClass[Omit[PickerDateProps[DateType], picker], Any]): Self = StObject.set(x, "WeekPicker", value.asInstanceOf[js.Any])
    
    inline def setYearPicker(value: PickerComponentClass[Omit[PickerDateProps[DateType], picker], Any]): Self = StObject.set(x, "YearPicker", value.asInstanceOf[js.Any])
  }
}
