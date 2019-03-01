package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingPolicyUpdate extends js.Object {
  /**
    * The name of the scaling policy.
    */
  var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined
  /**
    * Represents a target tracking scaling policy configuration.
    */
  var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}

object AutoScalingPolicyUpdate {
  @scala.inline
  def apply(
    TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
    PolicyName: AutoScalingPolicyName = null
  ): AutoScalingPolicyUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TargetTrackingScalingPolicyConfiguration")(TargetTrackingScalingPolicyConfiguration)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    __obj.asInstanceOf[AutoScalingPolicyUpdate]
  }
}

