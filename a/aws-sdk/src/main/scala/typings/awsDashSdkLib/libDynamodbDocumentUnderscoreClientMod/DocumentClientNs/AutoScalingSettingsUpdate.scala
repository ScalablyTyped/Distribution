package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingSettingsUpdate extends js.Object {
  /**
    * Disabled autoscaling for this global table or global secondary index.
    */
  var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Role ARN used for configuring autoscaling policy.
    */
  var AutoScalingRoleArn: js.UndefOr[AutoScalingRoleArn] = js.undefined
  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  var MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  var MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * The scaling policy to apply for scaling target global table or global secondary index capacity units.
    */
  var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate] = js.undefined
}

object AutoScalingSettingsUpdate {
  @scala.inline
  def apply(
    AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined,
    AutoScalingRoleArn: AutoScalingRoleArn = null,
    MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    ScalingPolicyUpdate: AutoScalingPolicyUpdate = null
  ): AutoScalingSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled)
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn)
    if (!js.isUndefined(MaximumUnits)) __obj.updateDynamic("MaximumUnits")(MaximumUnits)
    if (!js.isUndefined(MinimumUnits)) __obj.updateDynamic("MinimumUnits")(MinimumUnits)
    if (ScalingPolicyUpdate != null) __obj.updateDynamic("ScalingPolicyUpdate")(ScalingPolicyUpdate)
    __obj.asInstanceOf[AutoScalingSettingsUpdate]
  }
}

