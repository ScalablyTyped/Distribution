package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingPolicy extends js.Object {
  /**
    * Specifies how the scaling adjustment is interpreted (either an absolute number or a percentage). The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The CloudWatch alarms related to the policy.
    */
  var Alarms: js.UndefOr[typings.awsSdk.autoscalingMod.Alarms] = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The duration of the policy's cooldown period, in seconds.
    */
  var Cooldown: js.UndefOr[typings.awsSdk.autoscalingMod.Cooldown] = js.native
  /**
    * Indicates whether the policy is enabled (true) or disabled (false).
    */
  var Enabled: js.UndefOr[ScalingPolicyEnabled] = js.native
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
    */
  var EstimatedInstanceWarmup: js.UndefOr[typings.awsSdk.autoscalingMod.EstimatedInstanceWarmup] = js.native
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.native
  /**
    * The minimum value to scale by when the adjustment type is PercentChangeInCapacity. 
    */
  var MinAdjustmentMagnitude: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentMagnitude] = js.native
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentStep] = js.native
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the scaling policy.
    */
  var PolicyName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * One of the following policy types:     TargetTrackingScaling     StepScaling     SimpleScaling (default)   For more information, see Target Tracking Scaling Policies and Step and Simple Scaling Policies in the Amazon EC2 Auto Scaling User Guide.
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity.
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.native
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach.
    */
  var StepAdjustments: js.UndefOr[typings.awsSdk.autoscalingMod.StepAdjustments] = js.native
  /**
    * A target tracking scaling policy.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsSdk.autoscalingMod.TargetTrackingConfiguration] = js.native
}

object ScalingPolicy {
  @scala.inline
  def apply(
    AdjustmentType: XmlStringMaxLen255 = null,
    Alarms: Alarms = null,
    AutoScalingGroupName: XmlStringMaxLen255 = null,
    Cooldown: js.UndefOr[Cooldown] = js.undefined,
    Enabled: js.UndefOr[ScalingPolicyEnabled] = js.undefined,
    EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined,
    MetricAggregationType: XmlStringMaxLen32 = null,
    MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
    MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined,
    PolicyARN: ResourceName = null,
    PolicyName: XmlStringMaxLen255 = null,
    PolicyType: XmlStringMaxLen64 = null,
    ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined,
    StepAdjustments: StepAdjustments = null,
    TargetTrackingConfiguration: TargetTrackingConfiguration = null
  ): ScalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (AdjustmentType != null) __obj.updateDynamic("AdjustmentType")(AdjustmentType.asInstanceOf[js.Any])
    if (Alarms != null) __obj.updateDynamic("Alarms")(Alarms.asInstanceOf[js.Any])
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(Cooldown)) __obj.updateDynamic("Cooldown")(Cooldown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EstimatedInstanceWarmup)) __obj.updateDynamic("EstimatedInstanceWarmup")(EstimatedInstanceWarmup.get.asInstanceOf[js.Any])
    if (MetricAggregationType != null) __obj.updateDynamic("MetricAggregationType")(MetricAggregationType.asInstanceOf[js.Any])
    if (!js.isUndefined(MinAdjustmentMagnitude)) __obj.updateDynamic("MinAdjustmentMagnitude")(MinAdjustmentMagnitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinAdjustmentStep)) __obj.updateDynamic("MinAdjustmentStep")(MinAdjustmentStep.get.asInstanceOf[js.Any])
    if (PolicyARN != null) __obj.updateDynamic("PolicyARN")(PolicyARN.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    if (!js.isUndefined(ScalingAdjustment)) __obj.updateDynamic("ScalingAdjustment")(ScalingAdjustment.get.asInstanceOf[js.Any])
    if (StepAdjustments != null) __obj.updateDynamic("StepAdjustments")(StepAdjustments.asInstanceOf[js.Any])
    if (TargetTrackingConfiguration != null) __obj.updateDynamic("TargetTrackingConfiguration")(TargetTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPolicy]
  }
}

