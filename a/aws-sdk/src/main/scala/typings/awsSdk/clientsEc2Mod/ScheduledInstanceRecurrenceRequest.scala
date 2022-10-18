package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstanceRecurrenceRequest extends StObject {
  
  /**
    * The frequency (Daily, Weekly, or Monthly).
    */
  var Frequency: js.UndefOr[String] = js.undefined
  
  /**
    * The interval quantity. The interval unit depends on the value of Frequency. For example, every 2 weeks or every 2 months.
    */
  var Interval: js.UndefOr[Integer] = js.undefined
  
  /**
    * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily schedule. If the occurrence is relative to the end of the month, you can specify only a single day.
    */
  var OccurrenceDays: js.UndefOr[OccurrenceDayRequestSet] = js.undefined
  
  /**
    * Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify this value with a daily schedule.
    */
  var OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unit for OccurrenceDays (DayOfWeek or DayOfMonth). This value is required for a monthly schedule. You can't specify DayOfWeek with a weekly schedule. You can't specify this value with a daily schedule.
    */
  var OccurrenceUnit: js.UndefOr[String] = js.undefined
}
object ScheduledInstanceRecurrenceRequest {
  
  inline def apply(): ScheduledInstanceRecurrenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceRecurrenceRequest]
  }
  
  extension [Self <: ScheduledInstanceRecurrenceRequest](x: Self) {
    
    inline def setFrequency(value: String): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    inline def setInterval(value: Integer): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setOccurrenceDays(value: OccurrenceDayRequestSet): Self = StObject.set(x, "OccurrenceDays", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDaysUndefined: Self = StObject.set(x, "OccurrenceDays", js.undefined)
    
    inline def setOccurrenceDaysVarargs(value: Integer*): Self = StObject.set(x, "OccurrenceDays", js.Array(value*))
    
    inline def setOccurrenceRelativeToEnd(value: Boolean): Self = StObject.set(x, "OccurrenceRelativeToEnd", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceRelativeToEndUndefined: Self = StObject.set(x, "OccurrenceRelativeToEnd", js.undefined)
    
    inline def setOccurrenceUnit(value: String): Self = StObject.set(x, "OccurrenceUnit", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceUnitUndefined: Self = StObject.set(x, "OccurrenceUnit", js.undefined)
  }
}
