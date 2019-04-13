package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePolicyType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The name or Amazon Resource Name (ARN) of the policy.
    */
  var PolicyName: ResourceName
}

object DeletePolicyType {
  @scala.inline
  def apply(PolicyName: ResourceName, AutoScalingGroupName: ResourceName = null): DeletePolicyType = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName)
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName)
    __obj.asInstanceOf[DeletePolicyType]
  }
}

