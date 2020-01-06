package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutScalingPolicyType extends js.Object {
  /**
    * Specifies whether the ScalingAdjustment parameter is an absolute number or a percentage of the current capacity. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity. Valid only if the policy type is StepScaling or SimpleScaling. For more information, see Scaling Adjustment Types in the Amazon EC2 Auto Scaling User Guide.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before any further dynamic scaling activities can start. If this parameter is not specified, the default cooldown period for the group applies. Valid only if the policy type is SimpleScaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var Cooldown: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Cooldown] = js.native
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. The default is to use the value specified for the default cooldown period for the group. Valid only if the policy type is StepScaling or TargetTrackingScaling.
    */
  var EstimatedInstanceWarmup: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.EstimatedInstanceWarmup] = js.native
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average. If the aggregation type is null, the value is treated as Average. Valid only if the policy type is StepScaling.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.native
  /**
    * The minimum number of instances to scale. If the value of AdjustmentType is PercentChangeInCapacity, the scaling policy changes the DesiredCapacity of the Auto Scaling group by at least this many instances. Otherwise, the error is ValidationError. This property replaces the MinAdjustmentStep property. For example, suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent and you specify a MinAdjustmentMagnitude of 2. If the group has 4 instances and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a MinAdjustmentMagnitude of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances. Valid only if the policy type is SimpleScaling or StepScaling.
    */
  var MinAdjustmentMagnitude: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MinAdjustmentMagnitude] = js.native
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MinAdjustmentStep] = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: XmlStringMaxLen255 = js.native
  /**
    * The policy type. The valid values are SimpleScaling, StepScaling, and TargetTrackingScaling. If the policy type is null, the value is treated as SimpleScaling.
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The amount by which a simple scaling policy scales the Auto Scaling group in response to an alarm breach. The adjustment is based on the value that you specified in the AdjustmentType parameter (either an absolute number or a percentage). A positive value adds to the current capacity and a negative value subtracts from the current capacity. For exact capacity, you must specify a positive value. Conditional: If you specify SimpleScaling for the policy type, you must specify this parameter. (Not used with any other policy type.) 
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.native
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach. Conditional: If you specify StepScaling for the policy type, you must specify this parameter. (Not used with any other policy type.) 
    */
  var StepAdjustments: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.StepAdjustments] = js.native
  /**
    * A target tracking scaling policy. Includes support for predefined or customized metrics. For more information, see TargetTrackingConfiguration in the Amazon EC2 Auto Scaling API Reference. Conditional: If you specify TargetTrackingScaling for the policy type, you must specify this parameter. (Not used with any other policy type.) 
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.TargetTrackingConfiguration] = js.native
}

object PutScalingPolicyType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    PolicyName: XmlStringMaxLen255,
    AdjustmentType: XmlStringMaxLen255 = null,
    Cooldown: Int | Double = null,
    EstimatedInstanceWarmup: Int | Double = null,
    MetricAggregationType: XmlStringMaxLen32 = null,
    MinAdjustmentMagnitude: Int | Double = null,
    MinAdjustmentStep: Int | Double = null,
    PolicyType: XmlStringMaxLen64 = null,
    ScalingAdjustment: Int | Double = null,
    StepAdjustments: StepAdjustments = null,
    TargetTrackingConfiguration: TargetTrackingConfiguration = null
  ): PutScalingPolicyType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    if (AdjustmentType != null) __obj.updateDynamic("AdjustmentType")(AdjustmentType.asInstanceOf[js.Any])
    if (Cooldown != null) __obj.updateDynamic("Cooldown")(Cooldown.asInstanceOf[js.Any])
    if (EstimatedInstanceWarmup != null) __obj.updateDynamic("EstimatedInstanceWarmup")(EstimatedInstanceWarmup.asInstanceOf[js.Any])
    if (MetricAggregationType != null) __obj.updateDynamic("MetricAggregationType")(MetricAggregationType.asInstanceOf[js.Any])
    if (MinAdjustmentMagnitude != null) __obj.updateDynamic("MinAdjustmentMagnitude")(MinAdjustmentMagnitude.asInstanceOf[js.Any])
    if (MinAdjustmentStep != null) __obj.updateDynamic("MinAdjustmentStep")(MinAdjustmentStep.asInstanceOf[js.Any])
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    if (ScalingAdjustment != null) __obj.updateDynamic("ScalingAdjustment")(ScalingAdjustment.asInstanceOf[js.Any])
    if (StepAdjustments != null) __obj.updateDynamic("StepAdjustments")(StepAdjustments.asInstanceOf[js.Any])
    if (TargetTrackingConfiguration != null) __obj.updateDynamic("TargetTrackingConfiguration")(TargetTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyType]
  }
}

