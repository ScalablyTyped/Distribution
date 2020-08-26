package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepScalingPolicyConfiguration extends js.Object {
  /**
    * Specifies whether the ScalingAdjustment value in a StepAdjustment is an absolute number or a percentage of the current capacity.   AdjustmentType is required if you are adding a new step scaling policy configuration.
    */
  var AdjustmentType: js.UndefOr[typings.awsSdk.applicationautoscalingMod.AdjustmentType] = js.native
  /**
    * The amount of time, in seconds, to wait for a previous scaling activity to take effect. With scale-out policies, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a step scaling policy, it starts to calculate the cooldown time. While the cooldown period is in effect, capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. For example, when an alarm triggers a step scaling policy to increase the capacity by 2, the scaling activity completes successfully, and a cooldown period starts. If the alarm triggers again during the cooldown period but at a more aggressive step adjustment of 3, the previous increase of 2 is considered part of the current capacity. Therefore, only 1 is added to the capacity. With scale-in policies, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the cooldown period after a scale-in activity, Application Auto Scaling scales out the target immediately. In this case, the cooldown period for the scale-in activity stops and doesn't complete. Application Auto Scaling provides a default value of 300 for the following scalable targets:   ECS services   Spot Fleet requests   EMR clusters   AppStream 2.0 fleets   Aurora DB clusters   Amazon SageMaker endpoint variants   Custom resources   For all other scalable targets, the default value is 0:   DynamoDB tables   DynamoDB global secondary indexes   Amazon Comprehend document classification endpoints   Lambda provisioned concurrency   Amazon Keyspaces tables  
    */
  var Cooldown: js.UndefOr[typings.awsSdk.applicationautoscalingMod.Cooldown] = js.native
  /**
    * The aggregation type for the CloudWatch metrics. Valid values are Minimum, Maximum, and Average. If the aggregation type is null, the value is treated as Average.
    */
  var MetricAggregationType: js.UndefOr[typings.awsSdk.applicationautoscalingMod.MetricAggregationType] = js.native
  /**
    * The minimum value to scale by when scaling by percentages. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a MinAdjustmentMagnitude of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a MinAdjustmentMagnitude of 2, Application Auto Scaling scales out the service by 2 tasks. Valid only if the adjustment type is PercentChangeInCapacity. 
    */
  var MinAdjustmentMagnitude: js.UndefOr[typings.awsSdk.applicationautoscalingMod.MinAdjustmentMagnitude] = js.native
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach. At least one step adjustment is required if you are adding a new step scaling policy configuration.
    */
  var StepAdjustments: js.UndefOr[typings.awsSdk.applicationautoscalingMod.StepAdjustments] = js.native
}

object StepScalingPolicyConfiguration {
  @scala.inline
  def apply(): StepScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepScalingPolicyConfiguration]
  }
  @scala.inline
  implicit class StepScalingPolicyConfigurationOps[Self <: StepScalingPolicyConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdjustmentType(value: AdjustmentType): Self = this.set("AdjustmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustmentType: Self = this.set("AdjustmentType", js.undefined)
    @scala.inline
    def setCooldown(value: Cooldown): Self = this.set("Cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCooldown: Self = this.set("Cooldown", js.undefined)
    @scala.inline
    def setMetricAggregationType(value: MetricAggregationType): Self = this.set("MetricAggregationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricAggregationType: Self = this.set("MetricAggregationType", js.undefined)
    @scala.inline
    def setMinAdjustmentMagnitude(value: MinAdjustmentMagnitude): Self = this.set("MinAdjustmentMagnitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinAdjustmentMagnitude: Self = this.set("MinAdjustmentMagnitude", js.undefined)
    @scala.inline
    def setStepAdjustmentsVarargs(value: StepAdjustment*): Self = this.set("StepAdjustments", js.Array(value :_*))
    @scala.inline
    def setStepAdjustments(value: StepAdjustments): Self = this.set("StepAdjustments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepAdjustments: Self = this.set("StepAdjustments", js.undefined)
  }
  
}

