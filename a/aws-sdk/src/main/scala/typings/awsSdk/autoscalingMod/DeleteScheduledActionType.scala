package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScheduledActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The name of the action to delete.
    */
  var ScheduledActionName: ResourceName = js.native
}

object DeleteScheduledActionType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScheduledActionName: ResourceName): DeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduledActionType]
  }
  @scala.inline
  implicit class DeleteScheduledActionTypeOps[Self <: DeleteScheduledActionType] (val x: Self) extends AnyVal {
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
    def setScheduledActionName(value: ResourceName): Self = this.set("ScheduledActionName", value.asInstanceOf[js.Any])
  }
  
}

