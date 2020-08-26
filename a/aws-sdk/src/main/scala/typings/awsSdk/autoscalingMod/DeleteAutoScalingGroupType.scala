package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAutoScalingGroupType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * Specifies that the group is to be deleted along with all instances associated with the group, without waiting for all instances to be terminated. This parameter also deletes any lifecycle actions associated with the group.
    */
  var ForceDelete: js.UndefOr[typings.awsSdk.autoscalingMod.ForceDelete] = js.native
}

object DeleteAutoScalingGroupType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): DeleteAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAutoScalingGroupType]
  }
  @scala.inline
  implicit class DeleteAutoScalingGroupTypeOps[Self <: DeleteAutoScalingGroupType] (val x: Self) extends AnyVal {
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
    def setForceDelete(value: ForceDelete): Self = this.set("ForceDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDelete: Self = this.set("ForceDelete", js.undefined)
  }
  
}

