package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutScalingPolicyType extends js.Object {
  /**
    * The adjustment type. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity. This parameter is supported if the policy type is SimpleScaling or StepScaling. For more information, see Dynamic Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies. This parameter is supported if the policy type is SimpleScaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var Cooldown: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Cooldown] = js.undefined
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. The default is to use the value specified for the default cooldown period for the group. This parameter is supported if the policy type is StepScaling or TargetTrackingScaling.
    */
  var EstimatedInstanceWarmup: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.EstimatedInstanceWarmup] = js.undefined
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average. If the aggregation type is null, the value is treated as Average. This parameter is supported if the policy type is StepScaling.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined
  /**
    * The minimum number of instances to scale. If the value of AdjustmentType is PercentChangeInCapacity, the scaling policy changes the DesiredCapacity of the Auto Scaling group by at least this many instances. Otherwise, the error is ValidationError. This parameter is supported if the policy type is SimpleScaling or StepScaling.
    */
  var MinAdjustmentMagnitude: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MinAdjustmentMagnitude] = js.undefined
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MinAdjustmentStep] = js.undefined
  /**
    * The name of the policy.
    */
  var PolicyName: XmlStringMaxLen255
  /**
    * The policy type. The valid values are SimpleScaling, StepScaling, and TargetTrackingScaling. If the policy type is null, the value is treated as SimpleScaling.
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity. Conditional: This parameter is required if the policy type is SimpleScaling and not supported otherwise.
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach. Conditional: This parameter is required if the policy type is StepScaling and not supported otherwise.
    */
  var StepAdjustments: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.StepAdjustments] = js.undefined
  /**
    * A target tracking scaling policy. Includes support for predefined or customized metrics. Conditional: This parameter is required if the policy type is TargetTrackingScaling and not supported otherwise.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.TargetTrackingConfiguration] = js.undefined
}

object PutScalingPolicyType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    PolicyName: XmlStringMaxLen255,
    AdjustmentType: XmlStringMaxLen255 = null,
    Cooldown: js.UndefOr[Cooldown] = js.undefined,
    EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined,
    MetricAggregationType: XmlStringMaxLen32 = null,
    MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
    MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined,
    PolicyType: XmlStringMaxLen64 = null,
    ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined,
    StepAdjustments: StepAdjustments = null,
    TargetTrackingConfiguration: TargetTrackingConfiguration = null
  ): PutScalingPolicyType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, PolicyName = PolicyName)
    if (AdjustmentType != null) __obj.updateDynamic("AdjustmentType")(AdjustmentType)
    if (!js.isUndefined(Cooldown)) __obj.updateDynamic("Cooldown")(Cooldown)
    if (!js.isUndefined(EstimatedInstanceWarmup)) __obj.updateDynamic("EstimatedInstanceWarmup")(EstimatedInstanceWarmup)
    if (MetricAggregationType != null) __obj.updateDynamic("MetricAggregationType")(MetricAggregationType)
    if (!js.isUndefined(MinAdjustmentMagnitude)) __obj.updateDynamic("MinAdjustmentMagnitude")(MinAdjustmentMagnitude)
    if (!js.isUndefined(MinAdjustmentStep)) __obj.updateDynamic("MinAdjustmentStep")(MinAdjustmentStep)
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType)
    if (!js.isUndefined(ScalingAdjustment)) __obj.updateDynamic("ScalingAdjustment")(ScalingAdjustment)
    if (StepAdjustments != null) __obj.updateDynamic("StepAdjustments")(StepAdjustments)
    if (TargetTrackingConfiguration != null) __obj.updateDynamic("TargetTrackingConfiguration")(TargetTrackingConfiguration)
    __obj.asInstanceOf[PutScalingPolicyType]
  }
}

