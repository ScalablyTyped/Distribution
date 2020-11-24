package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutScalingPolicyType extends js.Object {
  
  /**
    * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity. Required if the policy type is StepScaling or SimpleScaling. For more information, see Scaling adjustment types in the Amazon EC2 Auto Scaling User Guide.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * The duration of the policy's cooldown period, in seconds. When a cooldown period is specified here, it overrides the default cooldown period defined for the Auto Scaling group. Valid only if the policy type is SimpleScaling. For more information, see Scaling cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var Cooldown: js.UndefOr[typings.awsSdk.autoscalingMod.Cooldown] = js.native
  
  /**
    * Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information, see Disabling a scaling policy for an Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
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
    * The minimum value to scale by when the adjustment type is PercentChangeInCapacity. For example, suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent and you specify a MinAdjustmentMagnitude of 2. If the group has 4 instances and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a MinAdjustmentMagnitude of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances. Valid only if the policy type is StepScaling or SimpleScaling. For more information, see Scaling adjustment types in the Amazon EC2 Auto Scaling User Guide.  Some Auto Scaling groups use instance weights. In this case, set the MinAdjustmentMagnitude to a value that is at least as large as your largest instance weight. 
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
  def apply(AutoScalingGroupName: ResourceName, PolicyName: XmlStringMaxLen255): PutScalingPolicyType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyType]
  }
  
  @scala.inline
  implicit class PutScalingPolicyTypeOps[Self <: PutScalingPolicyType] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: XmlStringMaxLen255): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustmentType(value: XmlStringMaxLen255): Self = this.set("AdjustmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustmentType: Self = this.set("AdjustmentType", js.undefined)
    
    @scala.inline
    def setCooldown(value: Cooldown): Self = this.set("Cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCooldown: Self = this.set("Cooldown", js.undefined)
    
    @scala.inline
    def setEnabled(value: ScalingPolicyEnabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setEstimatedInstanceWarmup(value: EstimatedInstanceWarmup): Self = this.set("EstimatedInstanceWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedInstanceWarmup: Self = this.set("EstimatedInstanceWarmup", js.undefined)
    
    @scala.inline
    def setMetricAggregationType(value: XmlStringMaxLen32): Self = this.set("MetricAggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricAggregationType: Self = this.set("MetricAggregationType", js.undefined)
    
    @scala.inline
    def setMinAdjustmentMagnitude(value: MinAdjustmentMagnitude): Self = this.set("MinAdjustmentMagnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAdjustmentMagnitude: Self = this.set("MinAdjustmentMagnitude", js.undefined)
    
    @scala.inline
    def setMinAdjustmentStep(value: MinAdjustmentStep): Self = this.set("MinAdjustmentStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAdjustmentStep: Self = this.set("MinAdjustmentStep", js.undefined)
    
    @scala.inline
    def setPolicyType(value: XmlStringMaxLen64): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyType: Self = this.set("PolicyType", js.undefined)
    
    @scala.inline
    def setScalingAdjustment(value: PolicyIncrement): Self = this.set("ScalingAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingAdjustment: Self = this.set("ScalingAdjustment", js.undefined)
    
    @scala.inline
    def setStepAdjustmentsVarargs(value: StepAdjustment*): Self = this.set("StepAdjustments", js.Array(value :_*))
    
    @scala.inline
    def setStepAdjustments(value: StepAdjustments): Self = this.set("StepAdjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepAdjustments: Self = this.set("StepAdjustments", js.undefined)
    
    @scala.inline
    def setTargetTrackingConfiguration(value: TargetTrackingConfiguration): Self = this.set("TargetTrackingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTrackingConfiguration: Self = this.set("TargetTrackingConfiguration", js.undefined)
  }
}
