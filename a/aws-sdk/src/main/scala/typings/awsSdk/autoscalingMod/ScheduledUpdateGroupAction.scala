package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledUpdateGroupAction extends js.Object {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs and the capacity it attempts to maintain.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.native
  
  /**
    * The date and time in UTC for the recurring schedule to end. For example, "2019-06-01T00:00:00Z". 
    */
  var EndTime: js.UndefOr[TimestampType] = js.native
  
  /**
    * The maximum size of the Auto Scaling group.
    */
  var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.native
  
  /**
    * The minimum size of the Auto Scaling group.
    */
  var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.native
  
  /**
    * The recurring schedule for the action, in Unix cron syntax format. When StartTime and EndTime are specified with Recurrence, they form the boundaries of when the recurring action starts and stops.
    */
  var Recurrence: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the scheduled action.
    */
  var ScheduledActionARN: js.UndefOr[ResourceName] = js.native
  
  /**
    * The name of the scheduled action.
    */
  var ScheduledActionName: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The date and time in UTC for this action to start. For example, "2019-06-01T00:00:00Z". 
    */
  var StartTime: js.UndefOr[TimestampType] = js.native
  
  /**
    * This parameter is no longer used.
    */
  var Time: js.UndefOr[TimestampType] = js.native
}
object ScheduledUpdateGroupAction {
  
  @scala.inline
  def apply(): ScheduledUpdateGroupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledUpdateGroupAction]
  }
  
  @scala.inline
  implicit class ScheduledUpdateGroupActionOps[Self <: ScheduledUpdateGroupAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroupName: Self = this.set("AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = this.set("DesiredCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredCapacity: Self = this.set("DesiredCapacity", js.undefined)
    
    @scala.inline
    def setEndTime(value: TimestampType): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setMaxSize(value: AutoScalingGroupMaxSize): Self = this.set("MaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("MaxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: AutoScalingGroupMinSize): Self = this.set("MinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("MinSize", js.undefined)
    
    @scala.inline
    def setRecurrence(value: XmlStringMaxLen255): Self = this.set("Recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrence: Self = this.set("Recurrence", js.undefined)
    
    @scala.inline
    def setScheduledActionARN(value: ResourceName): Self = this.set("ScheduledActionARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledActionARN: Self = this.set("ScheduledActionARN", js.undefined)
    
    @scala.inline
    def setScheduledActionName(value: XmlStringMaxLen255): Self = this.set("ScheduledActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledActionName: Self = this.set("ScheduledActionName", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimestampType): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setTime(value: TimestampType): Self = this.set("Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("Time", js.undefined)
  }
}
