package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshFrequency extends StObject {
  
  /**
    * The interval between scheduled refreshes. Valid values are as follows:    MINUTE15: The dataset refreshes every 15 minutes. This value is only supported for incremental refreshes. This interval can only be used for one schedule per dataset.    MINUTE30:The dataset refreshes every 30 minutes. This value is only supported for incremental refreshes. This interval can only be used for one schedule per dataset.    HOURLY: The dataset refreshes every hour. This interval can only be used for one schedule per dataset.    DAILY: The dataset refreshes every day.    WEEKLY: The dataset refreshes every week.    MONTHLY: The dataset refreshes every month.  
    */
  var Interval: RefreshInterval
  
  /**
    * The day of the week that you want to schedule the refresh on. This value is required for weekly and monthly refresh intervals.
    */
  var RefreshOnDay: js.UndefOr[ScheduleRefreshOnEntity] = js.undefined
  
  /**
    * The time of day that you want the datset to refresh. This value is expressed in HH:MM format. This field is not required for schedules that refresh hourly.
    */
  var TimeOfTheDay: js.UndefOr[String] = js.undefined
  
  /**
    * The timezone that you want the refresh schedule to use. The timezone ID must match a corresponding ID found on java.util.time.getAvailableIDs().
    */
  var Timezone: js.UndefOr[String] = js.undefined
}
object RefreshFrequency {
  
  inline def apply(Interval: RefreshInterval): RefreshFrequency = {
    val __obj = js.Dynamic.literal(Interval = Interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshFrequency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshFrequency] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: RefreshInterval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnDay(value: ScheduleRefreshOnEntity): Self = StObject.set(x, "RefreshOnDay", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnDayUndefined: Self = StObject.set(x, "RefreshOnDay", js.undefined)
    
    inline def setTimeOfTheDay(value: String): Self = StObject.set(x, "TimeOfTheDay", value.asInstanceOf[js.Any])
    
    inline def setTimeOfTheDayUndefined: Self = StObject.set(x, "TimeOfTheDay", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
