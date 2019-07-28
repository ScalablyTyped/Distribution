package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingPolicyDescription extends js.Object {
  /**
    * The name of the scaling policy.
    */
  var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined
  /**
    * Represents a target tracking scaling policy configuration.
    */
  var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
}

object AutoScalingPolicyDescription {
  @scala.inline
  def apply(
    PolicyName: AutoScalingPolicyName = null,
    TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationDescription = null
  ): AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    if (TargetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("TargetTrackingScalingPolicyConfiguration")(TargetTrackingScalingPolicyConfiguration)
    __obj.asInstanceOf[AutoScalingPolicyDescription]
  }
}

