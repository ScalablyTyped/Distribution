package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingPolicy extends StObject {
  
  /**
    * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The CloudWatch alarms related to the policy.
    */
  var Alarms: js.UndefOr[typings.awsSdk.autoscalingMod.Alarms] = js.undefined
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The duration of the policy's cooldown period, in seconds.
    */
  var Cooldown: js.UndefOr[typings.awsSdk.autoscalingMod.Cooldown] = js.undefined
  
  /**
    * Indicates whether the policy is enabled (true) or disabled (false).
    */
  var Enabled: js.UndefOr[ScalingPolicyEnabled] = js.undefined
  
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
    */
  var EstimatedInstanceWarmup: js.UndefOr[typings.awsSdk.autoscalingMod.EstimatedInstanceWarmup] = js.undefined
  
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined
  
  /**
    * The minimum value to scale by when the adjustment type is PercentChangeInCapacity. 
    */
  var MinAdjustmentMagnitude: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentMagnitude] = js.undefined
  
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentStep] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the scaling policy.
    */
  var PolicyName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * One of the following policy types:     TargetTrackingScaling     StepScaling     SimpleScaling (default)   For more information, see Target tracking scaling policies and Step and simple scaling policies in the Amazon EC2 Auto Scaling User Guide.
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined
  
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity.
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined
  
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach.
    */
  var StepAdjustments: js.UndefOr[typings.awsSdk.autoscalingMod.StepAdjustments] = js.undefined
  
  /**
    * A target tracking scaling policy.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsSdk.autoscalingMod.TargetTrackingConfiguration] = js.undefined
}
object ScalingPolicy {
  
  @scala.inline
  def apply(): ScalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingPolicy]
  }
  
  @scala.inline
  implicit class ScalingPolicyMutableBuilder[Self <: ScalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustmentType(value: XmlStringMaxLen255): Self = StObject.set(x, "AdjustmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustmentTypeUndefined: Self = StObject.set(x, "AdjustmentType", js.undefined)
    
    @scala.inline
    def setAlarms(value: Alarms): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmsUndefined: Self = StObject.set(x, "Alarms", js.undefined)
    
    @scala.inline
    def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value :_*))
    
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setCooldown(value: Cooldown): Self = StObject.set(x, "Cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldownUndefined: Self = StObject.set(x, "Cooldown", js.undefined)
    
    @scala.inline
    def setEnabled(value: ScalingPolicyEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setEstimatedInstanceWarmup(value: EstimatedInstanceWarmup): Self = StObject.set(x, "EstimatedInstanceWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedInstanceWarmupUndefined: Self = StObject.set(x, "EstimatedInstanceWarmup", js.undefined)
    
    @scala.inline
    def setMetricAggregationType(value: XmlStringMaxLen32): Self = StObject.set(x, "MetricAggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricAggregationTypeUndefined: Self = StObject.set(x, "MetricAggregationType", js.undefined)
    
    @scala.inline
    def setMinAdjustmentMagnitude(value: MinAdjustmentMagnitude): Self = StObject.set(x, "MinAdjustmentMagnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAdjustmentMagnitudeUndefined: Self = StObject.set(x, "MinAdjustmentMagnitude", js.undefined)
    
    @scala.inline
    def setMinAdjustmentStep(value: MinAdjustmentStep): Self = StObject.set(x, "MinAdjustmentStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAdjustmentStepUndefined: Self = StObject.set(x, "MinAdjustmentStep", js.undefined)
    
    @scala.inline
    def setPolicyARN(value: ResourceName): Self = StObject.set(x, "PolicyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyARNUndefined: Self = StObject.set(x, "PolicyARN", js.undefined)
    
    @scala.inline
    def setPolicyName(value: XmlStringMaxLen255): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    @scala.inline
    def setPolicyType(value: XmlStringMaxLen64): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
    
    @scala.inline
    def setScalingAdjustment(value: PolicyIncrement): Self = StObject.set(x, "ScalingAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingAdjustmentUndefined: Self = StObject.set(x, "ScalingAdjustment", js.undefined)
    
    @scala.inline
    def setStepAdjustments(value: StepAdjustments): Self = StObject.set(x, "StepAdjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepAdjustmentsUndefined: Self = StObject.set(x, "StepAdjustments", js.undefined)
    
    @scala.inline
    def setStepAdjustmentsVarargs(value: StepAdjustment*): Self = StObject.set(x, "StepAdjustments", js.Array(value :_*))
    
    @scala.inline
    def setTargetTrackingConfiguration(value: TargetTrackingConfiguration): Self = StObject.set(x, "TargetTrackingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTrackingConfigurationUndefined: Self = StObject.set(x, "TargetTrackingConfiguration", js.undefined)
  }
}
