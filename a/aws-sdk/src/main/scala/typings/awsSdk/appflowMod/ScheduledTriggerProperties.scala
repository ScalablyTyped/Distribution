package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledTriggerProperties extends js.Object {
  
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
  implicit class ScheduledTriggerPropertiesOps[Self <: ScheduledTriggerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScheduleExpression(value: ScheduleExpression): Self = this.set("scheduleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPullMode(value: DataPullMode): Self = this.set("dataPullMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPullMode: Self = this.set("dataPullMode", js.undefined)
    
    @scala.inline
    def setScheduleEndTime(value: Date): Self = this.set("scheduleEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleEndTime: Self = this.set("scheduleEndTime", js.undefined)
    
    @scala.inline
    def setScheduleStartTime(value: Date): Self = this.set("scheduleStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleStartTime: Self = this.set("scheduleStartTime", js.undefined)
    
    @scala.inline
    def setTimezone(value: Timezone): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
}
