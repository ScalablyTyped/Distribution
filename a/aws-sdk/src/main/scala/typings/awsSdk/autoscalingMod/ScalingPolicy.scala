package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingPolicy extends js.Object {
  /**
    * The adjustment type, which specifies how ScalingAdjustment is interpreted. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
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
    * The amount of time, in seconds, after a scaling activity completes before any further dynamic scaling activities can start.
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
    * The minimum number of instances to scale. If the value of AdjustmentType is PercentChangeInCapacity, the scaling policy changes the DesiredCapacity of the Auto Scaling group by at least this many instances. Otherwise, the error is ValidationError.
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
    * The policy type. The valid values are SimpleScaling, StepScaling, and TargetTrackingScaling.
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
    Cooldown: Int | Double = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    EstimatedInstanceWarmup: Int | Double = null,
    MetricAggregationType: XmlStringMaxLen32 = null,
    MinAdjustmentMagnitude: Int | Double = null,
    MinAdjustmentStep: Int | Double = null,
    PolicyARN: ResourceName = null,
    PolicyName: XmlStringMaxLen255 = null,
    PolicyType: XmlStringMaxLen64 = null,
    ScalingAdjustment: Int | Double = null,
    StepAdjustments: StepAdjustments = null,
    TargetTrackingConfiguration: TargetTrackingConfiguration = null
  ): ScalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (AdjustmentType != null) __obj.updateDynamic("AdjustmentType")(AdjustmentType.asInstanceOf[js.Any])
    if (Alarms != null) __obj.updateDynamic("Alarms")(Alarms.asInstanceOf[js.Any])
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName.asInstanceOf[js.Any])
    if (Cooldown != null) __obj.updateDynamic("Cooldown")(Cooldown.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (EstimatedInstanceWarmup != null) __obj.updateDynamic("EstimatedInstanceWarmup")(EstimatedInstanceWarmup.asInstanceOf[js.Any])
    if (MetricAggregationType != null) __obj.updateDynamic("MetricAggregationType")(MetricAggregationType.asInstanceOf[js.Any])
    if (MinAdjustmentMagnitude != null) __obj.updateDynamic("MinAdjustmentMagnitude")(MinAdjustmentMagnitude.asInstanceOf[js.Any])
    if (MinAdjustmentStep != null) __obj.updateDynamic("MinAdjustmentStep")(MinAdjustmentStep.asInstanceOf[js.Any])
    if (PolicyARN != null) __obj.updateDynamic("PolicyARN")(PolicyARN.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    if (ScalingAdjustment != null) __obj.updateDynamic("ScalingAdjustment")(ScalingAdjustment.asInstanceOf[js.Any])
    if (StepAdjustments != null) __obj.updateDynamic("StepAdjustments")(StepAdjustments.asInstanceOf[js.Any])
    if (TargetTrackingConfiguration != null) __obj.updateDynamic("TargetTrackingConfiguration")(TargetTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPolicy]
  }
}

