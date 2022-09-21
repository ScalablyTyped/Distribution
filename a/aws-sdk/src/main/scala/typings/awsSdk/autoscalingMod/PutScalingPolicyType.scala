package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutScalingPolicyType extends StObject {
  
  /**
    * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity. Required if the policy type is StepScaling or SimpleScaling. For more information, see Scaling adjustment types in the Amazon EC2 Auto Scaling User Guide.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * A cooldown period, in seconds, that applies to a specific simple scaling policy. When a cooldown period is specified here, it overrides the default cooldown. Valid only if the policy type is SimpleScaling. For more information, see Scaling cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide. Default: None
    */
  var Cooldown: js.UndefOr[typings.awsSdk.autoscalingMod.Cooldown] = js.undefined
  
  /**
    * Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information, see Disabling a scaling policy for an Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  var Enabled: js.UndefOr[ScalingPolicyEnabled] = js.undefined
  
  /**
    *  Not needed if the default instance warmup is defined for the group.  The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This warm-up period applies to instances launched due to a specific target tracking or step scaling policy. When a warm-up period is specified here, it overrides the default instance warmup. Valid only if the policy type is TargetTrackingScaling or StepScaling.  The default is to use the value for the default instance warmup defined for the group. If default instance warmup is null, then EstimatedInstanceWarmup falls back to the value of default cooldown. 
    */
  var EstimatedInstanceWarmup: js.UndefOr[typings.awsSdk.autoscalingMod.EstimatedInstanceWarmup] = js.undefined
  
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average. If the aggregation type is null, the value is treated as Average. Valid only if the policy type is StepScaling.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined
  
  /**
    * The minimum value to scale by when the adjustment type is PercentChangeInCapacity. For example, suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent and you specify a MinAdjustmentMagnitude of 2. If the group has 4 instances and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a MinAdjustmentMagnitude of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances. Valid only if the policy type is StepScaling or SimpleScaling. For more information, see Scaling adjustment types in the Amazon EC2 Auto Scaling User Guide.  Some Auto Scaling groups use instance weights. In this case, set the MinAdjustmentMagnitude to a value that is at least as large as your largest instance weight. 
    */
  var MinAdjustmentMagnitude: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentMagnitude] = js.undefined
  
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentStep] = js.undefined
  
  /**
    * The name of the policy.
    */
  var PolicyName: XmlStringMaxLen255
  
  /**
    * One of the following policy types:     TargetTrackingScaling     StepScaling     SimpleScaling (default)    PredictiveScaling   
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined
  
  /**
    * A predictive scaling policy. Provides support for predefined and custom metrics. Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer request count. For more information, see PredictiveScalingConfiguration in the Amazon EC2 Auto Scaling API Reference. Required if the policy type is PredictiveScaling.
    */
  var PredictiveScalingConfiguration: js.UndefOr[typings.awsSdk.autoscalingMod.PredictiveScalingConfiguration] = js.undefined
  
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity. For exact capacity, you must specify a positive value. Required if the policy type is SimpleScaling. (Not used with any other policy type.) 
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined
  
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach. Required if the policy type is StepScaling. (Not used with any other policy type.) 
    */
  var StepAdjustments: js.UndefOr[typings.awsSdk.autoscalingMod.StepAdjustments] = js.undefined
  
  /**
    * A target tracking scaling policy. Provides support for predefined or custom metrics. The following predefined metrics are available:    ASGAverageCPUUtilization     ASGAverageNetworkIn     ASGAverageNetworkOut     ALBRequestCountPerTarget    If you specify ALBRequestCountPerTarget for the metric, you must specify the ResourceLabel property with the PredefinedMetricSpecification. For more information, see TargetTrackingConfiguration in the Amazon EC2 Auto Scaling API Reference. Required if the policy type is TargetTrackingScaling.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsSdk.autoscalingMod.TargetTrackingConfiguration] = js.undefined
}
object PutScalingPolicyType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255, PolicyName: XmlStringMaxLen255): PutScalingPolicyType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyType]
  }
  
  extension [Self <: PutScalingPolicyType](x: Self) {
    
    inline def setAdjustmentType(value: XmlStringMaxLen255): Self = StObject.set(x, "AdjustmentType", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentTypeUndefined: Self = StObject.set(x, "AdjustmentType", js.undefined)
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: Cooldown): Self = StObject.set(x, "Cooldown", value.asInstanceOf[js.Any])
    
    inline def setCooldownUndefined: Self = StObject.set(x, "Cooldown", js.undefined)
    
    inline def setEnabled(value: ScalingPolicyEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEstimatedInstanceWarmup(value: EstimatedInstanceWarmup): Self = StObject.set(x, "EstimatedInstanceWarmup", value.asInstanceOf[js.Any])
    
    inline def setEstimatedInstanceWarmupUndefined: Self = StObject.set(x, "EstimatedInstanceWarmup", js.undefined)
    
    inline def setMetricAggregationType(value: XmlStringMaxLen32): Self = StObject.set(x, "MetricAggregationType", value.asInstanceOf[js.Any])
    
    inline def setMetricAggregationTypeUndefined: Self = StObject.set(x, "MetricAggregationType", js.undefined)
    
    inline def setMinAdjustmentMagnitude(value: MinAdjustmentMagnitude): Self = StObject.set(x, "MinAdjustmentMagnitude", value.asInstanceOf[js.Any])
    
    inline def setMinAdjustmentMagnitudeUndefined: Self = StObject.set(x, "MinAdjustmentMagnitude", js.undefined)
    
    inline def setMinAdjustmentStep(value: MinAdjustmentStep): Self = StObject.set(x, "MinAdjustmentStep", value.asInstanceOf[js.Any])
    
    inline def setMinAdjustmentStepUndefined: Self = StObject.set(x, "MinAdjustmentStep", js.undefined)
    
    inline def setPolicyName(value: XmlStringMaxLen255): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyType(value: XmlStringMaxLen64): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
    
    inline def setPredictiveScalingConfiguration(value: PredictiveScalingConfiguration): Self = StObject.set(x, "PredictiveScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPredictiveScalingConfigurationUndefined: Self = StObject.set(x, "PredictiveScalingConfiguration", js.undefined)
    
    inline def setScalingAdjustment(value: PolicyIncrement): Self = StObject.set(x, "ScalingAdjustment", value.asInstanceOf[js.Any])
    
    inline def setScalingAdjustmentUndefined: Self = StObject.set(x, "ScalingAdjustment", js.undefined)
    
    inline def setStepAdjustments(value: StepAdjustments): Self = StObject.set(x, "StepAdjustments", value.asInstanceOf[js.Any])
    
    inline def setStepAdjustmentsUndefined: Self = StObject.set(x, "StepAdjustments", js.undefined)
    
    inline def setStepAdjustmentsVarargs(value: StepAdjustment*): Self = StObject.set(x, "StepAdjustments", js.Array(value*))
    
    inline def setTargetTrackingConfiguration(value: TargetTrackingConfiguration): Self = StObject.set(x, "TargetTrackingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTargetTrackingConfigurationUndefined: Self = StObject.set(x, "TargetTrackingConfiguration", js.undefined)
  }
}
