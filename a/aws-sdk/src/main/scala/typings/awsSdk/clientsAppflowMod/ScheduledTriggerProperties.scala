package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledTriggerProperties extends StObject {
  
  /**
    *  Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow run. 
    */
  var dataPullMode: js.UndefOr[DataPullMode] = js.undefined
  
  /**
    *  Specifies the date range for the records to import from the connector in the first flow run. 
    */
  var firstExecutionFrom: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Defines how many times a scheduled flow fails consecutively before Amazon AppFlow deactivates it.
    */
  var flowErrorDeactivationThreshold: js.UndefOr[FlowErrorDeactivationThreshold] = js.undefined
  
  /**
    * The time at which the scheduled flow ends. The time is formatted as a timestamp that follows the ISO 8601 standard, such as 2022-04-27T13:00:00-07:00.
    */
  var scheduleEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The scheduling expression that determines the rate at which the schedule will run, for example rate(5minutes). 
    */
  var scheduleExpression: ScheduleExpression
  
  /**
    *  Specifies the optional offset that is added to the time interval for a schedule-triggered flow. 
    */
  var scheduleOffset: js.UndefOr[ScheduleOffset] = js.undefined
  
  /**
    * The time at which the scheduled flow starts. The time is formatted as a timestamp that follows the ISO 8601 standard, such as 2022-04-26T13:00:00-07:00.
    */
  var scheduleStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the time zone used when referring to the dates and times of a scheduled flow, such as America/New_York. This time zone is only a descriptive label. It doesn't affect how Amazon AppFlow interprets the timestamps that you specify to schedule the flow. If you want to schedule a flow by using times in a particular time zone, indicate the time zone as a UTC offset in your timestamps. For example, the UTC offsets for the America/New_York timezone are -04:00 EDT and -05:00 EST.
    */
  var timezone: js.UndefOr[Timezone] = js.undefined
}
object ScheduledTriggerProperties {
  
  inline def apply(scheduleExpression: ScheduleExpression): ScheduledTriggerProperties = {
    val __obj = js.Dynamic.literal(scheduleExpression = scheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledTriggerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledTriggerProperties] (val x: Self) extends AnyVal {
    
    inline def setDataPullMode(value: DataPullMode): Self = StObject.set(x, "dataPullMode", value.asInstanceOf[js.Any])
    
    inline def setDataPullModeUndefined: Self = StObject.set(x, "dataPullMode", js.undefined)
    
    inline def setFirstExecutionFrom(value: js.Date): Self = StObject.set(x, "firstExecutionFrom", value.asInstanceOf[js.Any])
    
    inline def setFirstExecutionFromUndefined: Self = StObject.set(x, "firstExecutionFrom", js.undefined)
    
    inline def setFlowErrorDeactivationThreshold(value: FlowErrorDeactivationThreshold): Self = StObject.set(x, "flowErrorDeactivationThreshold", value.asInstanceOf[js.Any])
    
    inline def setFlowErrorDeactivationThresholdUndefined: Self = StObject.set(x, "flowErrorDeactivationThreshold", js.undefined)
    
    inline def setScheduleEndTime(value: js.Date): Self = StObject.set(x, "scheduleEndTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleEndTimeUndefined: Self = StObject.set(x, "scheduleEndTime", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "scheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleOffset(value: ScheduleOffset): Self = StObject.set(x, "scheduleOffset", value.asInstanceOf[js.Any])
    
    inline def setScheduleOffsetUndefined: Self = StObject.set(x, "scheduleOffset", js.undefined)
    
    inline def setScheduleStartTime(value: js.Date): Self = StObject.set(x, "scheduleStartTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleStartTimeUndefined: Self = StObject.set(x, "scheduleStartTime", js.undefined)
    
    inline def setTimezone(value: Timezone): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
