package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingPolicy extends js.Object {
  /**
    * The adjustment type, which specifies how ScalingAdjustment is interpreted. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The CloudWatch alarms related to the policy.
    */
  var Alarms: js.UndefOr[Alarms] = js.undefined
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The amount of time, in seconds, after a scaling activity completes before any further dynamic scaling activities can start.
    */
  var Cooldown: js.UndefOr[Cooldown] = js.undefined
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
    */
  var EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined
  /**
    * The minimum number of instances to scale. If the value of AdjustmentType is PercentChangeInCapacity, the scaling policy changes the DesiredCapacity of the Auto Scaling group by at least this many instances. Otherwise, the error is ValidationError.
    */
  var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.undefined
  /**
    * The name of the scaling policy.
    */
  var PolicyName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The policy type. The valid values are SimpleScaling and StepScaling.
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity.
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach.
    */
  var StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined
  /**
    * A target tracking scaling policy.
    */
  var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
}

object ScalingPolicy {
  @scala.inline
  def apply(
    AdjustmentType: XmlStringMaxLen255 = null,
    Alarms: Alarms = null,
    AutoScalingGroupName: XmlStringMaxLen255 = null,
    Cooldown: js.UndefOr[Cooldown] = js.undefined,
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
    if (AdjustmentType != null) __obj.updateDynamic("AdjustmentType")(AdjustmentType)
    if (Alarms != null) __obj.updateDynamic("Alarms")(Alarms)
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName)
    if (!js.isUndefined(Cooldown)) __obj.updateDynamic("Cooldown")(Cooldown)
    if (!js.isUndefined(EstimatedInstanceWarmup)) __obj.updateDynamic("EstimatedInstanceWarmup")(EstimatedInstanceWarmup)
    if (MetricAggregationType != null) __obj.updateDynamic("MetricAggregationType")(MetricAggregationType)
    if (!js.isUndefined(MinAdjustmentMagnitude)) __obj.updateDynamic("MinAdjustmentMagnitude")(MinAdjustmentMagnitude)
    if (!js.isUndefined(MinAdjustmentStep)) __obj.updateDynamic("MinAdjustmentStep")(MinAdjustmentStep)
    if (PolicyARN != null) __obj.updateDynamic("PolicyARN")(PolicyARN)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType)
    if (!js.isUndefined(ScalingAdjustment)) __obj.updateDynamic("ScalingAdjustment")(ScalingAdjustment)
    if (StepAdjustments != null) __obj.updateDynamic("StepAdjustments")(StepAdjustments)
    if (TargetTrackingConfiguration != null) __obj.updateDynamic("TargetTrackingConfiguration")(TargetTrackingConfiguration)
    __obj.asInstanceOf[ScalingPolicy]
  }
}

