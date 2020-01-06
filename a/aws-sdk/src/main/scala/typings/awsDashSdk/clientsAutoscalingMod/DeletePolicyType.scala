package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePolicyType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the policy.
    */
  var PolicyName: ResourceName = js.native
}

object DeletePolicyType {
  @scala.inline
  def apply(PolicyName: ResourceName, AutoScalingGroupName: ResourceName = null): DeletePolicyType = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyType]
  }
}

