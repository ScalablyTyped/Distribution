package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<antd-mobile.antd-mobile/es/components/date-picker/date-picker-utils.Precision, (val : number, extend : {  date :std.Date}): boolean>> */
trait PartialRecordPrecisionval extends StObject {
  
  var day: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
  
  var hour: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
  
  var minute: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
  
  var month: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
  
  var second: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
  
  var week: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
  
  var `week-day`: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
  
  var year: js.UndefOr[js.Function2[/* val */ Double, /* extend */ Date, Boolean]] = js.undefined
}
object PartialRecordPrecisionval {
  
  inline def apply(): PartialRecordPrecisionval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordPrecisionval]
  }
  
  extension [Self <: PartialRecordPrecisionval](x: Self) {
    
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
