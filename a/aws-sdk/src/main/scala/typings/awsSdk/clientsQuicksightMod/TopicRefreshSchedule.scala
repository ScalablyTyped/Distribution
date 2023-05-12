package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRefreshSchedule extends StObject {
  
  /**
    * A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE dataset.
    */
  var BasedOnSpiceSchedule: Boolean
  
  /**
    * A Boolean value that controls whether to schedule is enabled.
    */
  var IsEnabled: NullableBoolean
  
  /**
    * The time of day when the refresh should run, for example, Monday-Sunday.
    */
  var RepeatAt: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The starting date and time for the refresh schedule.
    */
  var StartingAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timezone that you want the refresh schedule to use.
    */
  var Timezone: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The type of refresh schedule. Valid values for this structure are HOURLY, DAILY, WEEKLY, and MONTHLY.
    */
  var TopicScheduleType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TopicScheduleType] = js.undefined
}
object TopicRefreshSchedule {
  
  inline def apply(BasedOnSpiceSchedule: Boolean, IsEnabled: NullableBoolean): TopicRefreshSchedule = {
    val __obj = js.Dynamic.literal(BasedOnSpiceSchedule = BasedOnSpiceSchedule.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRefreshSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicRefreshSchedule] (val x: Self) extends AnyVal {
    
    inline def setBasedOnSpiceSchedule(value: Boolean): Self = StObject.set(x, "BasedOnSpiceSchedule", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: NullableBoolean): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    inline def setRepeatAt(value: LimitedString): Self = StObject.set(x, "RepeatAt", value.asInstanceOf[js.Any])
    
    inline def setRepeatAtUndefined: Self = StObject.set(x, "RepeatAt", js.undefined)
    
    inline def setStartingAt(value: js.Date): Self = StObject.set(x, "StartingAt", value.asInstanceOf[js.Any])
    
    inline def setStartingAtUndefined: Self = StObject.set(x, "StartingAt", js.undefined)
    
    inline def setTimezone(value: LimitedString): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setTopicScheduleType(value: TopicScheduleType): Self = StObject.set(x, "TopicScheduleType", value.asInstanceOf[js.Any])
    
    inline def setTopicScheduleTypeUndefined: Self = StObject.set(x, "TopicScheduleType", js.undefined)
  }
}
