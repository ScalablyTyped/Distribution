package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingTargetTrackingScalingPolicyConfigurationUpdate extends js.Object {
  /**
    * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
    */
  var DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately. 
    */
  var ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined
  /**
    * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
    */
  var ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined
  /**
    * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
    */
  var TargetValue: Double
}

object AutoScalingTargetTrackingScalingPolicyConfigurationUpdate {
  @scala.inline
  def apply(
    TargetValue: Double,
    DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined,
    ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined,
    ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined
  ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue)
    if (!js.isUndefined(DisableScaleIn)) __obj.updateDynamic("DisableScaleIn")(DisableScaleIn)
    if (!js.isUndefined(ScaleInCooldown)) __obj.updateDynamic("ScaleInCooldown")(ScaleInCooldown)
    if (!js.isUndefined(ScaleOutCooldown)) __obj.updateDynamic("ScaleOutCooldown")(ScaleOutCooldown)
    __obj.asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
  }
}

