package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutScheduledUpdateGroupActionType extends js.Object {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * One or more scheduled actions. The maximum number allowed is 50.
    */
  var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests = js.native
}
object BatchPutScheduledUpdateGroupActionType {
  
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
  ): BatchPutScheduledUpdateGroupActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledUpdateGroupActions = ScheduledUpdateGroupActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionType]
  }
  
  @scala.inline
  implicit class BatchPutScheduledUpdateGroupActionTypeOps[Self <: BatchPutScheduledUpdateGroupActionType] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledUpdateGroupActionsVarargs(value: ScheduledUpdateGroupActionRequest*): Self = this.set("ScheduledUpdateGroupActions", js.Array(value :_*))
    
    @scala.inline
    def setScheduledUpdateGroupActions(value: ScheduledUpdateGroupActionRequests): Self = this.set("ScheduledUpdateGroupActions", value.asInstanceOf[js.Any])
  }
}
