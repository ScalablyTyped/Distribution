package typings.antdMobile

import typings.antdMobile.esComponentsDatePickerDatePickerUtilsMod.DatePickerFilter
import typings.antdMobile.esComponentsDatePickerViewDatePickerViewMod.RenderLabel
import typings.antdMobile.esComponentsPickerViewPickerViewMod.PickerColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsDatePickerDatePickerDateUtilsMod {
  
  @JSImport("antd-mobile/es/components/date-picker/date-picker-date-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDateToStringArray(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")().asInstanceOf[js.Array[String]]
  inline def convertDateToStringArray(date: js.Date): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def convertStringArrayToDate[T /* <: js.UndefOr[String | Double | Null] */](value: js.Array[T]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("convertStringArrayToDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: DatePrecision,
    renderLabel: RenderLabel
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: DatePrecision,
    renderLabel: RenderLabel,
    filter: Unit,
    tillNow: Boolean
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], tillNow.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: DatePrecision,
    renderLabel: RenderLabel,
    filter: DatePickerFilter
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: DatePrecision,
    renderLabel: RenderLabel,
    filter: DatePickerFilter,
    tillNow: Boolean
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], tillNow.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  
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
