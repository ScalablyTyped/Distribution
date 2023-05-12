package typings.antdMobile

import typings.antdMobile.esComponentsDatePickerDatePickerUtilsMod.DatePickerFilter
import typings.antdMobile.esComponentsPickerViewPickerViewMod.PickerColumn
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsDatePickerDatePickerWeekUtilsMod {
  
  @JSImport("antd-mobile/es/components/date-picker/date-picker-week-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDateToStringArray(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")().asInstanceOf[js.Array[String]]
  inline def convertDateToStringArray(date: js.Date): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def convertStringArrayToDate[T /* <: js.UndefOr[String | Double | Null] */](value: js.Array[T]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("convertStringArrayToDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: WeekPrecision,
    renderLabel: js.Function2[/* type */ WeekPrecision, /* data */ Double, ReactNode]
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: WeekPrecision,
    renderLabel: js.Function2[/* type */ WeekPrecision, /* data */ Double, ReactNode],
    filter: DatePickerFilter
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.year
    - typings.antdMobile.antdMobileStrings.week
    - typings.antdMobile.antdMobileStrings.`week-day`
  */
  trait WeekPrecision extends StObject
  object WeekPrecision {
    
    inline def week: typings.antdMobile.antdMobileStrings.week = "week".asInstanceOf[typings.antdMobile.antdMobileStrings.week]
    
    inline def `week-day`: typings.antdMobile.antdMobileStrings.`week-day` = "week-day".asInstanceOf[typings.antdMobile.antdMobileStrings.`week-day`]
    
    inline def year: typings.antdMobile.antdMobileStrings.year = "year".asInstanceOf[typings.antdMobile.antdMobileStrings.year]
  }
}
