package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTrackingScalingPolicyConfiguration extends js.Object {
  /**
    * A customized metric. You can specify either a predefined metric or a customized metric.
    */
  var CustomizedMetricSpecification: js.UndefOr[typings.awsSdk.applicationautoscalingMod.CustomizedMetricSpecification] = js.native
  /**
    * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is true, scale in is disabled and the target tracking scaling policy won't remove capacity from the scalable target. Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable target. The default value is false.
    */
  var DisableScaleIn: js.UndefOr[typings.awsSdk.applicationautoscalingMod.DisableScaleIn] = js.native
  /**
    * A predefined metric. You can specify either a predefined metric or a customized metric.
    */
  var PredefinedMetricSpecification: js.UndefOr[typings.awsSdk.applicationautoscalingMod.PredefinedMetricSpecification] = js.native
  /**
    * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start. With the scale-in cooldown period, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the scale-in cooldown period, Application Auto Scaling scales out the target immediately. In this case, the scale-in cooldown period stops and doesn't complete. Application Auto Scaling provides a default value of 300 for the following scalable targets:   ECS services   Spot Fleet requests   EMR clusters   AppStream 2.0 fleets   Aurora DB clusters   Amazon SageMaker endpoint variants   Custom resources   For all other scalable targets, the default value is 0:   DynamoDB tables   DynamoDB global secondary indexes   Amazon Comprehend document classification endpoints   Lambda provisioned concurrency   Amazon Keyspaces tables  
    */
  var ScaleInCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. With the scale-out cooldown period, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a target tracking scaling policy, it starts to calculate the cooldown time. While the scale-out cooldown period is in effect, the capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. Application Auto Scaling provides a default value of 300 for the following scalable targets:   ECS services   Spot Fleet requests   EMR clusters   AppStream 2.0 fleets   Aurora DB clusters   Amazon SageMaker endpoint variants   Custom resources   For all other scalable targets, the default value is 0:   DynamoDB tables   DynamoDB global secondary indexes   Amazon Comprehend document classification endpoints   Lambda provisioned concurrency   Amazon Keyspaces tables  
    */
  var ScaleOutCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
    */
  var TargetValue: MetricScale = js.native
}

object TargetTrackingScalingPolicyConfiguration {
  @scala.inline
  def apply(
    TargetValue: MetricScale,
    CustomizedMetricSpecification: CustomizedMetricSpecification = null,
    DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
    PredefinedMetricSpecification: PredefinedMetricSpecification = null,
    ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined,
    ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined
  ): TargetTrackingScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    if (CustomizedMetricSpecification != null) __obj.updateDynamic("CustomizedMetricSpecification")(CustomizedMetricSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableScaleIn)) __obj.updateDynamic("DisableScaleIn")(DisableScaleIn.get.asInstanceOf[js.Any])
    if (PredefinedMetricSpecification != null) __obj.updateDynamic("PredefinedMetricSpecification")(PredefinedMetricSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(ScaleInCooldown)) __obj.updateDynamic("ScaleInCooldown")(ScaleInCooldown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ScaleOutCooldown)) __obj.updateDynamic("ScaleOutCooldown")(ScaleOutCooldown.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingScalingPolicyConfiguration]
  }
}

