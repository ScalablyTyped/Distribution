package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledTriggerProperties extends StObject {
  
  /**
    *  Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow run. 
    */
  var dataPullMode: js.UndefOr[DataPullMode] = js.native
  
  /**
    *  Specifies the scheduled end time for a schedule-triggered flow. 
    */
  var scheduleEndTime: js.UndefOr[Date] = js.native
  
  /**
    *  The scheduling expression that determines when and how often the rule runs. 
    */
  var scheduleExpression: ScheduleExpression = js.native
  
  /**
    *  Specifies the scheduled start time for a schedule-triggered flow. 
    */
  var scheduleStartTime: js.UndefOr[Date] = js.native
  
  /**
    *  Specifies the time zone used when referring to the date and time of a scheduled-triggered flow. 
    */
  var timezone: js.UndefOr[Timezone] = js.native
}
object ScheduledTriggerProperties {
  
  @scala.inline
  def apply(scheduleExpression: ScheduleExpression): ScheduledTriggerProperties = {
    val __obj = js.Dynamic.literal(scheduleExpression = scheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledTriggerProperties]
  }
  
  @scala.inline
  implicit class ScheduledTriggerPropertiesMutableBuilder[Self <: ScheduledTriggerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataPullMode(value: DataPullMode): Self = StObject.set(x, "dataPullMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPullModeUndefined: Self = StObject.set(x, "dataPullMode", js.undefined)
    
    @scala.inline
    def setScheduleEndTime(value: Date): Self = StObject.set(x, "scheduleEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleEndTimeUndefined: Self = StObject.set(x, "scheduleEndTime", js.undefined)
    
    @scala.inline
    def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "scheduleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleStartTime(value: Date): Self = StObject.set(x, "scheduleStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleStartTimeUndefined: Self = StObject.set(x, "scheduleStartTime", js.undefined)
    
    @scala.inline
    def setTimezone(value: Timezone): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
