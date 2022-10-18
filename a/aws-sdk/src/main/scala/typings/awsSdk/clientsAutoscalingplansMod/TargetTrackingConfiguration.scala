package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTrackingConfiguration extends StObject {
  
  /**
    * A customized metric. You can specify either a predefined metric or a customized metric. 
    */
  var CustomizedScalingMetricSpecification: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.CustomizedScalingMetricSpecification] = js.undefined
  
  /**
    * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is true, scale in is disabled and the target tracking scaling policy doesn't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable resource.  The default value is false.
    */
  var DisableScaleIn: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.DisableScaleIn] = js.undefined
  
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This value is used only if the resource is an Auto Scaling group.
    */
  var EstimatedInstanceWarmup: js.UndefOr[Cooldown] = js.undefined
  
  /**
    * A predefined metric. You can specify either a predefined metric or a customized metric.
    */
  var PredefinedScalingMetricSpecification: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.PredefinedScalingMetricSpecification] = js.undefined
  
  /**
    * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start. This property is not used if the scalable resource is an Auto Scaling group. With the scale-in cooldown period, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the scale-in cooldown period, Auto Scaling scales out the target immediately. In this case, the scale-in cooldown period stops and doesn't complete.
    */
  var ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined
  
  /**
    * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. This property is not used if the scalable resource is an Auto Scaling group. With the scale-out cooldown period, the intention is to continuously (but not excessively) scale out. After Auto Scaling successfully scales out using a target tracking scaling policy, it starts to calculate the cooldown time. The scaling policy won't increase the desired capacity again unless either a larger scale out is triggered or the cooldown period ends.
    */
  var ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined
  
  /**
    * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values that are either too small or too large. Values must be in the range of -2^360 to 2^360.
    */
  var TargetValue: MetricScale
}
object TargetTrackingConfiguration {
  
  inline def apply(TargetValue: MetricScale): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
  
  extension [Self <: TargetTrackingConfiguration](x: Self) {
    
    inline def setCustomizedScalingMetricSpecification(value: CustomizedScalingMetricSpecification): Self = StObject.set(x, "CustomizedScalingMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setCustomizedScalingMetricSpecificationUndefined: Self = StObject.set(x, "CustomizedScalingMetricSpecification", js.undefined)
    
    inline def setDisableScaleIn(value: DisableScaleIn): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
    
    inline def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
    
    inline def setEstimatedInstanceWarmup(value: Cooldown): Self = StObject.set(x, "EstimatedInstanceWarmup", value.asInstanceOf[js.Any])
    
    inline def setEstimatedInstanceWarmupUndefined: Self = StObject.set(x, "EstimatedInstanceWarmup", js.undefined)
    
    inline def setPredefinedScalingMetricSpecification(value: PredefinedScalingMetricSpecification): Self = StObject.set(x, "PredefinedScalingMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setPredefinedScalingMetricSpecificationUndefined: Self = StObject.set(x, "PredefinedScalingMetricSpecification", js.undefined)
    
    inline def setScaleInCooldown(value: Cooldown): Self = StObject.set(x, "ScaleInCooldown", value.asInstanceOf[js.Any])
    
    inline def setScaleInCooldownUndefined: Self = StObject.set(x, "ScaleInCooldown", js.undefined)
    
    inline def setScaleOutCooldown(value: Cooldown): Self = StObject.set(x, "ScaleOutCooldown", value.asInstanceOf[js.Any])
    
    inline def setScaleOutCooldownUndefined: Self = StObject.set(x, "ScaleOutCooldown", js.undefined)
    
    inline def setTargetValue(value: MetricScale): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
  }
}
