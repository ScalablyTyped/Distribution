package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutScalingPolicyType extends js.Object {
  /**
    * Specifies how the scaling adjustment is interpreted (either an absolute number or a percentage). The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity. Required if the policy type is StepScaling or SimpleScaling. For more information, see Scaling Adjustment Types in the Amazon EC2 Auto Scaling User Guide.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The duration of the policy's cooldown period, in seconds. When a cooldown period is specified here, it overrides the default cooldown period defined for the Auto Scaling group. Valid only if the policy type is SimpleScaling. For more information, see Scaling Cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var Cooldown: js.UndefOr[typings.awsSdk.autoscalingMod.Cooldown] = js.native
  /**
    * Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information, see Disabling a Scaling Policy for an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var Enabled: js.UndefOr[ScalingPolicyEnabled] = js.native
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. If not provided, the default is to use the value from the default cooldown period for the Auto Scaling group. Valid only if the policy type is TargetTrackingScaling or StepScaling.
    */
  var EstimatedInstanceWarmup: js.UndefOr[typings.awsSdk.autoscalingMod.EstimatedInstanceWarmup] = js.native
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average. If the aggregation type is null, the value is treated as Average. Valid only if the policy type is StepScaling.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.native
  /**
    * The minimum value to scale by when the adjustment type is PercentChangeInCapacity. For example, suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent and you specify a MinAdjustmentMagnitude of 2. If the group has 4 instances and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a MinAdjustmentMagnitude of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances. Valid only if the policy type is StepScaling or SimpleScaling. For more information, see Scaling Adjustment Types in the Amazon EC2 Auto Scaling User Guide.  Some Auto Scaling groups use instance weights. In this case, set the MinAdjustmentMagnitude to a value that is at least as large as your largest instance weight. 
    */
  var MinAdjustmentMagnitude: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentMagnitude] = js.native
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentStep] = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: XmlStringMaxLen255 = js.native
  /**
    * One of the following policy types:     TargetTrackingScaling     StepScaling     SimpleScaling (default)  
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity. For exact capacity, you must specify a positive value. Required if the policy type is SimpleScaling. (Not used with any other policy type.) 
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.native
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach. Required if the policy type is StepScaling. (Not used with any other policy type.) 
    */
  var StepAdjustments: js.UndefOr[typings.awsSdk.autoscalingMod.StepAdjustments] = js.native
  /**
    * A target tracking scaling policy. Includes support for predefined or customized metrics. The following predefined metrics are available:    ASGAverageCPUUtilization     ASGAverageNetworkIn     ASGAverageNetworkOut     ALBRequestCountPerTarget    If you specify ALBRequestCountPerTarget for the metric, you must specify the ResourceLabel parameter with the PredefinedMetricSpecification. For more information, see TargetTrackingConfiguration in the Amazon EC2 Auto Scaling API Reference. Required if the policy type is TargetTrackingScaling.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsSdk.autoscalingMod.TargetTrackingConfiguration] = js.native
}

object PutScalingPolicyType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    PolicyName: XmlStringMaxLen255,
    AdjustmentType: XmlStringMaxLen255 = null,
    Cooldown: js.UndefOr[Cooldown] = js.undefined,
    Enabled: js.UndefOr[ScalingPolicyEnabled] = js.undefined,
    EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined,
    MetricAggregationType: XmlStringMaxLen32 = null,
    MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
    MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined,
    PolicyType: XmlStringMaxLen64 = null,
    ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined,
    StepAdjustments: StepAdjustments = null,
    TargetTrackingConfiguration: TargetTrackingConfiguration = null
  ): PutScalingPolicyType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    if (AdjustmentType != null) __obj.updateDynamic("AdjustmentType")(AdjustmentType.asInstanceOf[js.Any])
    if (!js.isUndefined(Cooldown)) __obj.updateDynamic("Cooldown")(Cooldown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EstimatedInstanceWarmup)) __obj.updateDynamic("EstimatedInstanceWarmup")(EstimatedInstanceWarmup.get.asInstanceOf[js.Any])
    if (MetricAggregationType != null) __obj.updateDynamic("MetricAggregationType")(MetricAggregationType.asInstanceOf[js.Any])
    if (!js.isUndefined(MinAdjustmentMagnitude)) __obj.updateDynamic("MinAdjustmentMagnitude")(MinAdjustmentMagnitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinAdjustmentStep)) __obj.updateDynamic("MinAdjustmentStep")(MinAdjustmentStep.get.asInstanceOf[js.Any])
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    if (!js.isUndefined(ScalingAdjustment)) __obj.updateDynamic("ScalingAdjustment")(ScalingAdjustment.get.asInstanceOf[js.Any])
    if (StepAdjustments != null) __obj.updateDynamic("StepAdjustments")(StepAdjustments.asInstanceOf[js.Any])
    if (TargetTrackingConfiguration != null) __obj.updateDynamic("TargetTrackingConfiguration")(TargetTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyType]
  }
}

