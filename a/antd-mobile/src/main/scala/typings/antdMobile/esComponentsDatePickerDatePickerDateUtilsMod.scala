package typings.antdMobile

import typings.antdMobile.esComponentsDatePickerDatePickerUtilsMod.DatePickerFilter
import typings.antdMobile.esComponentsPickerViewPickerViewMod.PickerColumn
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsDatePickerDatePickerDateUtilsMod {
  
  @JSImport("antd-mobile/es/components/date-picker/date-picker-date-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDateToStringArray(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")().asInstanceOf[js.Array[String]]
  inline def convertDateToStringArray(date: js.Date): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def convertStringArrayToDate(value: js.Array[js.UndefOr[String | Null]]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("convertStringArrayToDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def defaultRenderLabel(`type`: DatePrecision, data: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultRenderLabel")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: DatePrecision,
    renderLabel: js.Function2[/* type */ DatePrecision, /* data */ Double, ReactNode]
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: DatePrecision,
    renderLabel: js.Function2[/* type */ DatePrecision, /* data */ Double, ReactNode],
    filter: DatePickerFilter
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.year
    - typings.antdMobile.antdMobileStrings.month
    - typings.antdMobile.antdMobileStrings.day
    - typings.antdMobile.antdMobileStrings.hour
    - typings.antdMobile.antdMobileStrings.minute
    - typings.antdMobile.antdMobileStrings.second
  */
  trait DatePrecision extends StObject
  object DatePrecision {
    
    inline def day: typings.antdMobile.antdMobileStrings.day = "day".asInstanceOf[typings.antdMobile.antdMobileStrings.day]
    
    inline def hour: typings.antdMobile.antdMobileStrings.hour = "hour".asInstanceOf[typings.antdMobile.antdMobileStrings.hour]
    
    inline def minute: typings.antdMobile.antdMobileStrings.minute = "minute".asInstanceOf[typings.antdMobile.antdMobileStrings.minute]
    
    inline def month: typings.antdMobile.antdMobileStrings.month = "month".asInstanceOf[typings.antdMobile.antdMobileStrings.month]
    
    inline def second: typings.antdMobile.antdMobileStrings.second = "second".asInstanceOf[typings.antdMobile.antdMobileStrings.second]
    
    inline def year: typings.antdMobile.antdMobileStrings.year = "year".asInstanceOf[typings.antdMobile.antdMobileStrings.year]
  }
}
