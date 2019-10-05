package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

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
  var AutoScalingRoleArn: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.AutoScalingRoleArn
  ] = js.undefined
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
    AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined,
    AutoScalingRoleArn: AutoScalingRoleArn = null,
    MaximumUnits: Int | scala.Double = null,
    MinimumUnits: Int | scala.Double = null,
    ScalingPolicyUpdate: AutoScalingPolicyUpdate = null
  ): AutoScalingSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingDisabled)) __obj.updateDynamic("AutoScalingDisabled")(AutoScalingDisabled)
    if (AutoScalingRoleArn != null) __obj.updateDynamic("AutoScalingRoleArn")(AutoScalingRoleArn)
    if (MaximumUnits != null) __obj.updateDynamic("MaximumUnits")(MaximumUnits.asInstanceOf[js.Any])
    if (MinimumUnits != null) __obj.updateDynamic("MinimumUnits")(MinimumUnits.asInstanceOf[js.Any])
    if (ScalingPolicyUpdate != null) __obj.updateDynamic("ScalingPolicyUpdate")(ScalingPolicyUpdate)
    __obj.asInstanceOf[AutoScalingSettingsUpdate]
  }
}

