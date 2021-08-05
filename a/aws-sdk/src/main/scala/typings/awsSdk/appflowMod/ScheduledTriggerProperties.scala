package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledTriggerProperties extends StObject {
  
  /**
    *  Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow run. 
    */
  var dataPullMode: js.UndefOr[DataPullMode] = js.undefined
  
  /**
    *  Specifies the scheduled end time for a schedule-triggered flow. 
    */
  var scheduleEndTime: js.UndefOr[Date] = js.undefined
  
  /**
    *  The scheduling expression that determines when and how often the rule runs. 
    */
  var scheduleExpression: ScheduleExpression
  
  /**
    *  Specifies the scheduled start time for a schedule-triggered flow. 
    */
  var scheduleStartTime: js.UndefOr[Date] = js.undefined
  
  /**
    *  Specifies the time zone used when referring to the date and time of a scheduled-triggered flow. 
    */
  var timezone: js.UndefOr[Timezone] = js.undefined
}
object ScheduledTriggerProperties {
  
  inline def apply(scheduleExpression: ScheduleExpression): ScheduledTriggerProperties = {
    val __obj = js.Dynamic.literal(scheduleExpression = scheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledTriggerProperties]
  }
  
  extension [Self <: ScheduledTriggerProperties](x: Self) {
    
    inline def setDataPullMode(value: DataPullMode): Self = StObject.set(x, "dataPullMode", value.asInstanceOf[js.Any])
    
    inline def setDataPullModeUndefined: Self = StObject.set(x, "dataPullMode", js.undefined)
    
    inline def setScheduleEndTime(value: Date): Self = StObject.set(x, "scheduleEndTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleEndTimeUndefined: Self = StObject.set(x, "scheduleEndTime", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "scheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleStartTime(value: Date): Self = StObject.set(x, "scheduleStartTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleStartTimeUndefined: Self = StObject.set(x, "scheduleStartTime", js.undefined)
    
    inline def setTimezone(value: Timezone): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
