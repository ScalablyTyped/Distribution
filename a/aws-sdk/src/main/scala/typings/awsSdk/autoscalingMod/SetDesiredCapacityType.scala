package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDesiredCapacityType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The number of EC2 instances that should be running in the Auto Scaling group.
    */
  var DesiredCapacity: AutoScalingGroupDesiredCapacity = js.native
  /**
    * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor the cooldown period during manual scaling activities.
    */
  var HonorCooldown: js.UndefOr[typings.awsSdk.autoscalingMod.HonorCooldown] = js.native
}

object SetDesiredCapacityType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    DesiredCapacity: AutoScalingGroupDesiredCapacity,
    HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined
  ): SetDesiredCapacityType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], DesiredCapacity = DesiredCapacity.asInstanceOf[js.Any])
    if (!js.isUndefined(HonorCooldown)) __obj.updateDynamic("HonorCooldown")(HonorCooldown.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDesiredCapacityType]
  }
}

