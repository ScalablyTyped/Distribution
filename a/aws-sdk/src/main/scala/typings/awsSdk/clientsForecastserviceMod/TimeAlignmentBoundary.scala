package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeAlignmentBoundary extends StObject {
  
  /**
    * The day of the month to use for time alignment during aggregation.
    */
  var DayOfMonth: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.DayOfMonth] = js.undefined
  
  /**
    * The day of week to use for time alignment during aggregation. The day must be in uppercase.
    */
  var DayOfWeek: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.DayOfWeek] = js.undefined
  
  /**
    * The hour of day to use for time alignment during aggregation.
    */
  var Hour: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Hour] = js.undefined
  
  /**
    * The month to use for time alignment during aggregation. The month must be in uppercase.
    */
  var Month: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Month] = js.undefined
}
object TimeAlignmentBoundary {
  
  inline def apply(): TimeAlignmentBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeAlignmentBoundary]
  }
  
  extension [Self <: TimeAlignmentBoundary](x: Self) {
    
    inline def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "DayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "DayOfMonth", js.undefined)
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "DayOfWeek", js.undefined)
    
    inline def setHour(value: Hour): Self = StObject.set(x, "Hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "Hour", js.undefined)
    
    inline def setMonth(value: Month): Self = StObject.set(x, "Month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "Month", js.undefined)
  }
}
