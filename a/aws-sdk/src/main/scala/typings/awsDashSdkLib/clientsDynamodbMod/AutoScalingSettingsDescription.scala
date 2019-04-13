package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingSettingsDescription extends js.Object {
  /**
    * Disabled autoscaling for this global table or global secondary index.
    */
  var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Role ARN used for configuring autoScaling policy.
    */
  var AutoScalingRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  var MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  var MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * Information about the scaling policies.
    */
  var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.undefined
}

object AutoScalingSettingsDescription {
  @scala.inline
  def apply(
    AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined,
    AutoScalingRoleArn: String = null,
    MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    ScalingPolicies: AutoScalingPolicyDescriptionList = null
  ): AutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled)
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn)
    if (!js.isUndefined(MaximumUnits)) __obj.updateDynamic("MaximumUnits")(MaximumUnits)
    if (!js.isUndefined(MinimumUnits)) __obj.updateDynamic("MinimumUnits")(MinimumUnits)
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies)
    __obj.asInstanceOf[AutoScalingSettingsDescription]
  }
}

