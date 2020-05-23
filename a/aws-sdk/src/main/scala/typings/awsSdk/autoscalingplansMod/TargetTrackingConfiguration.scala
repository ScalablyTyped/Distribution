package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTrackingConfiguration extends js.Object {
  /**
    * A customized metric. You can specify either a predefined metric or a customized metric. 
    */
  var CustomizedScalingMetricSpecification: js.UndefOr[typings.awsSdk.autoscalingplansMod.CustomizedScalingMetricSpecification] = js.native
  /**
    * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is true, scale in is disabled and the target tracking scaling policy doesn't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable resource.  The default value is false.
    */
  var DisableScaleIn: js.UndefOr[typings.awsSdk.autoscalingplansMod.DisableScaleIn] = js.native
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This value is used only if the resource is an Auto Scaling group.
    */
  var EstimatedInstanceWarmup: js.UndefOr[Cooldown] = js.native
  /**
    * A predefined metric. You can specify either a predefined metric or a customized metric.
    */
  var PredefinedScalingMetricSpecification: js.UndefOr[typings.awsSdk.autoscalingplansMod.PredefinedScalingMetricSpecification] = js.native
  /**
    * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. This value is not used if the scalable resource is an Auto Scaling group. The cooldown period is used to block subsequent scale in requests until it has expired. The intention is to scale in conservatively to protect your application's availability. However, if another alarm triggers a scale-out policy during the cooldown period after a scale-in, AWS Auto Scaling scales out your scalable target immediately.
    */
  var ScaleInCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start. This value is not used if the scalable resource is an Auto Scaling group. While the cooldown period is in effect, the capacity that has been added by the previous scale-out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. The intention is to continuously (but not excessively) scale out.
    */
  var ScaleOutCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
    */
  var TargetValue: MetricScale = js.native
}

object TargetTrackingConfiguration {
  @scala.inline
  def apply(
    TargetValue: MetricScale,
    CustomizedScalingMetricSpecification: CustomizedScalingMetricSpecification = null,
    DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
    EstimatedInstanceWarmup: js.UndefOr[Cooldown] = js.undefined,
    PredefinedScalingMetricSpecification: PredefinedScalingMetricSpecification = null,
    ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined,
    ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined
  ): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    if (CustomizedScalingMetricSpecification != null) __obj.updateDynamic("CustomizedScalingMetricSpecification")(CustomizedScalingMetricSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableScaleIn)) __obj.updateDynamic("DisableScaleIn")(DisableScaleIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EstimatedInstanceWarmup)) __obj.updateDynamic("EstimatedInstanceWarmup")(EstimatedInstanceWarmup.get.asInstanceOf[js.Any])
    if (PredefinedScalingMetricSpecification != null) __obj.updateDynamic("PredefinedScalingMetricSpecification")(PredefinedScalingMetricSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(ScaleInCooldown)) __obj.updateDynamic("ScaleInCooldown")(ScaleInCooldown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ScaleOutCooldown)) __obj.updateDynamic("ScaleOutCooldown")(ScaleOutCooldown.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
}

