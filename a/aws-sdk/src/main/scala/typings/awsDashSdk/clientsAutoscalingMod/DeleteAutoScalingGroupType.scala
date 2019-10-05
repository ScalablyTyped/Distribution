package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAutoScalingGroupType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * Specifies that the group is to be deleted along with all instances associated with the group, without waiting for all instances to be terminated. This parameter also deletes any lifecycle actions associated with the group.
    */
  var ForceDelete: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.ForceDelete] = js.undefined
}

object DeleteAutoScalingGroupType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ForceDelete: js.UndefOr[Boolean] = js.undefined): DeleteAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName)
    if (!js.isUndefined(ForceDelete)) __obj.updateDynamic("ForceDelete")(ForceDelete)
    __obj.asInstanceOf[DeleteAutoScalingGroupType]
  }
}

