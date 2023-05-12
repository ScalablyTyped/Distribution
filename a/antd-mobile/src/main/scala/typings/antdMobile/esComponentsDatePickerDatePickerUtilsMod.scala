package typings.antdMobile

import typings.antdMobile.anon.Date
import typings.antdMobile.esComponentsDatePickerViewDatePickerViewMod.RenderLabel
import typings.antdMobile.esComponentsPickerViewPickerViewMod.PickerColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsDatePickerDatePickerUtilsMod {
  
  @JSImport("antd-mobile/es/components/date-picker/date-picker-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDateToStringArray(date: js.Date, precision: Precision): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")(date.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def convertDateToStringArray(date: Null, precision: Precision): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")(date.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def convertDateToStringArray(date: Unit, precision: Precision): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")(date.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def convertStringArrayToDate[T /* <: js.UndefOr[String | Double | Null] */](value: js.Array[T], precision: Precision): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStringArrayToDate")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: Precision,
    renderLabel: RenderLabel
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: Precision,
    renderLabel: RenderLabel,
    filter: Unit,
    tillNow: Boolean
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], tillNow.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: Precision,
    renderLabel: RenderLabel,
    filter: DatePickerFilter
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: Precision,
    renderLabel: RenderLabel,
    filter: DatePickerFilter,
    tillNow: Boolean
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], tillNow.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  
  /* Inlined std.Partial<std.Record<antd-mobile.antd-mobile/es/components/date-picker/date-picker-utils.Precision, (val : number, extend : {  date :std.Date}): boolean>> */
  trait DatePickerFilter extends StObject {
    
    var day: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
    
    var hour: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
    
    var minute: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
    
    var month: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
    
    var second: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
    
    var week: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
    
    var `week-day`: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
    
    var year: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
  }
  object DatePickerFilter {
    
    inline def apply(): DatePickerFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerFilter] (val x: Self) extends AnyVal {
      
      inline def setDay(value: (/* val */ Double, /* extend */ Date) => Boolean): Self = StObject.set(x, "day", js.Any.fromFunction2(value))
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setHour(value: (/* val */ Double, /* extend */ Date) => Boolean): Self = StObject.set(x, "hour", js.Any.fromFunction2(value))
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMinute(value: (/* val */ Double, /* extend */ Date) => Boolean): Self = StObject.set(x, "minute", js.Any.fromFunction2(value))
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: (/* val */ Double, /* extend */ Date) => Boolean): Self = StObject.set(x, "month", js.Any.fromFunction2(value))
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setSecond(value: (/* val */ Double, /* extend */ Date) => Boolean): Self = StObject.set(x, "second", js.Any.fromFunction2(value))
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setWeek(value: (/* val */ Double, /* extend */ Date) => Boolean): Self = StObject.set(x, "week", js.Any.fromFunction2(value))
      
      inline def `setWeek-day`(value: (/* val */ Double, /* extend */ Date) => Boolean): Self = StObject.set(x, "week-day", js.Any.fromFunction2(value))
      
      inline def `setWeek-dayUndefined`: Self = StObject.set(x, "week-day", js.undefined)
      
      inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      inline def setYear(value: (/* val */ Double, /* extend */ Date) => Boolean): Self = StObject.set(x, "year", js.Any.fromFunction2(value))
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.year
    - typings.antdMobile.antdMobileStrings.month
    - typings.antdMobile.antdMobileStrings.day
    - typings.antdMobile.antdMobileStrings.hour
    - typings.antdMobile.antdMobileStrings.minute
    - typings.antdMobile.antdMobileStrings.second
    - typings.antdMobile.antdMobileStrings.week
    - typings.antdMobile.antdMobileStrings.`week-day`
  */
  trait Precision extends StObject
  object Precision {
    
    inline def day: typings.antdMobile.antdMobileStrings.day = "day".asInstanceOf[typings.antdMobile.antdMobileStrings.day]
    
    inline def hour: typings.antdMobile.antdMobileStrings.hour = "hour".asInstanceOf[typings.antdMobile.antdMobileStrings.hour]
    
    inline def minute: typings.antdMobile.antdMobileStrings.minute = "minute".asInstanceOf[typings.antdMobile.antdMobileStrings.minute]
    
    inline def month: typings.antdMobile.antdMobileStrings.month = "month".asInstanceOf[typings.antdMobile.antdMobileStrings.month]
    
    inline def second: typings.antdMobile.antdMobileStrings.second = "second".asInstanceOf[typings.antdMobile.antdMobileStrings.second]
    
    inline def week: typings.antdMobile.antdMobileStrings.week = "week".asInstanceOf[typings.antdMobile.antdMobileStrings.week]
    
    inline def `week-day`: typings.antdMobile.antdMobileStrings.`week-day` = "week-day".asInstanceOf[typings.antdMobile.antdMobileStrings.`week-day`]
    
    inline def year: typings.antdMobile.antdMobileStrings.year = "year".asInstanceOf[typings.antdMobile.antdMobileStrings.year]
  }
}
