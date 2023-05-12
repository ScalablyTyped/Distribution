package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandwidthRateLimitInterval extends StObject {
  
  /**
    * The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This field does not appear in the response if the upload rate limit is not set.  For Backup Gateway, the minimum value is (Value). 
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[AverageUploadRateLimit] = js.undefined
  
  /**
    * The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0 to 6, where 0 represents Sunday and 6 represents Saturday.
    */
  var DaysOfWeek: typings.awsSdk.clientsBackupgatewayMod.DaysOfWeek
  
  /**
    * The hour of the day to end the bandwidth rate limit interval.
    */
  var EndHourOfDay: HourOfDay
  
  /**
    * The minute of the hour to end the bandwidth rate limit interval.  The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an hour, use the value 59. 
    */
  var EndMinuteOfHour: MinuteOfHour
  
  /**
    * The hour of the day to start the bandwidth rate limit interval.
    */
  var StartHourOfDay: HourOfDay
  
  /**
    * The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of that minute. To begin an interval exactly at the start of the hour, use the value 0.
    */
  var StartMinuteOfHour: MinuteOfHour
}
object BandwidthRateLimitInterval {
  
  inline def apply(
    DaysOfWeek: DaysOfWeek,
    EndHourOfDay: HourOfDay,
    EndMinuteOfHour: MinuteOfHour,
    StartHourOfDay: HourOfDay,
    StartMinuteOfHour: MinuteOfHour
  ): BandwidthRateLimitInterval = {
    val __obj = js.Dynamic.literal(DaysOfWeek = DaysOfWeek.asInstanceOf[js.Any], EndHourOfDay = EndHourOfDay.asInstanceOf[js.Any], EndMinuteOfHour = EndMinuteOfHour.asInstanceOf[js.Any], StartHourOfDay = StartHourOfDay.asInstanceOf[js.Any], StartMinuteOfHour = StartMinuteOfHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandwidthRateLimitInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BandwidthRateLimitInterval] (val x: Self) extends AnyVal {
    
    inline def setAverageUploadRateLimitInBitsPerSec(value: AverageUploadRateLimit): Self = StObject.set(x, "AverageUploadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    inline def setAverageUploadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "AverageUploadRateLimitInBitsPerSec", js.undefined)
    
    inline def setDaysOfWeek(value: DaysOfWeek): Self = StObject.set(x, "DaysOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekVarargs(value: DayOfWeek*): Self = StObject.set(x, "DaysOfWeek", js.Array(value*))
    
    inline def setEndHourOfDay(value: HourOfDay): Self = StObject.set(x, "EndHourOfDay", value.asInstanceOf[js.Any])
    
    inline def setEndMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "EndMinuteOfHour", value.asInstanceOf[js.Any])
    
    inline def setStartHourOfDay(value: HourOfDay): Self = StObject.set(x, "StartHourOfDay", value.asInstanceOf[js.Any])
    
    inline def setStartMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "StartMinuteOfHour", value.asInstanceOf[js.Any])
  }
}
