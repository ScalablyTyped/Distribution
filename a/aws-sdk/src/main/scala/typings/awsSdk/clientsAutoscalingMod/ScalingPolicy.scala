package typings.awsSdk.clientsAutoscalingMod

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
  var Alarms: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Alarms] = js.undefined
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The duration of the policy's cooldown period, in seconds.
    */
  var Cooldown: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Cooldown] = js.undefined
  
  /**
    * Indicates whether the policy is enabled (true) or disabled (false).
    */
  var Enabled: js.UndefOr[ScalingPolicyEnabled] = js.undefined
  
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
    */
  var EstimatedInstanceWarmup: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.EstimatedInstanceWarmup] = js.undefined
  
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined
  
  /**
    * The minimum value to scale by when the adjustment type is PercentChangeInCapacity. 
    */
  var MinAdjustmentMagnitude: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MinAdjustmentMagnitude] = js.undefined
  
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MinAdjustmentStep] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the scaling policy.
    */
  var PolicyName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * One of the following policy types:     TargetTrackingScaling     StepScaling     SimpleScaling (default)    PredictiveScaling    For more information, see Target tracking scaling policies and Step and simple scaling policies in the Amazon EC2 Auto Scaling User Guide.
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined
  
  /**
    * A predictive scaling policy.
    */
  var PredictiveScalingConfiguration: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.PredictiveScalingConfiguration] = js.undefined
  
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity.
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined
  
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach.
    */
  var StepAdjustments: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.StepAdjustments] = js.undefined
  
  /**
    * A target tracking scaling policy.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.TargetTrackingConfiguration] = js.undefined
}
object ScalingPolicy {
  
  inline def apply(): ScalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalingPolicy] (val x: Self) extends AnyVal {
    
    inline def setAdjustmentType(value: XmlStringMaxLen255): Self = StObject.set(x, "AdjustmentType", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentTypeUndefined: Self = StObject.set(x, "AdjustmentType", js.undefined)
    
    inline def setAlarms(value: Alarms): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsUndefined: Self = StObject.set(x, "Alarms", js.undefined)
    
    inline def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value*))
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
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
    
    inline def setPolicyARN(value: ResourceName): Self = StObject.set(x, "PolicyARN", value.asInstanceOf[js.Any])
    
    inline def setPolicyARNUndefined: Self = StObject.set(x, "PolicyARN", js.undefined)
    
    inline def setPolicyName(value: XmlStringMaxLen255): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
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
