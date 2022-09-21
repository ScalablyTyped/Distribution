package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTrackingScalingPolicyConfiguration extends StObject {
  
  /**
    * A customized metric. You can specify either a predefined metric or a customized metric.
    */
  var CustomizedMetricSpecification: js.UndefOr[typings.awsSdk.applicationautoscalingMod.CustomizedMetricSpecification] = js.undefined
  
  /**
    * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is true, scale in is disabled and the target tracking scaling policy won't remove capacity from the scalable target. Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable target. The default value is false.
    */
  var DisableScaleIn: js.UndefOr[typings.awsSdk.applicationautoscalingMod.DisableScaleIn] = js.undefined
  
  /**
    * A predefined metric. You can specify either a predefined metric or a customized metric.
    */
  var PredefinedMetricSpecification: js.UndefOr[typings.awsSdk.applicationautoscalingMod.PredefinedMetricSpecification] = js.undefined
  
  /**
    * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start. With the scale-in cooldown period, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the scale-in cooldown period, Application Auto Scaling scales out the target immediately. In this case, the scale-in cooldown period stops and doesn't complete. Application Auto Scaling provides a default value of 600 for Amazon ElastiCache replication groups and a default value of 300 for the following scalable targets:   AppStream 2.0 fleets   Aurora DB clusters   ECS services   EMR clusters    Neptune clusters   SageMaker endpoint variants   Spot Fleets   Custom resources   For all other scalable targets, the default value is 0:   Amazon Comprehend document classification and entity recognizer endpoints   DynamoDB tables and global secondary indexes   Amazon Keyspaces tables   Lambda provisioned concurrency   Amazon MSK broker storage  
    */
  var ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined
  
  /**
    * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. With the scale-out cooldown period, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a target tracking scaling policy, it starts to calculate the cooldown time. The scaling policy won't increase the desired capacity again unless either a larger scale out is triggered or the cooldown period ends. While the cooldown period is in effect, the capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. Application Auto Scaling provides a default value of 600 for Amazon ElastiCache replication groups and a default value of 300 for the following scalable targets:   AppStream 2.0 fleets   Aurora DB clusters   ECS services   EMR clusters    Neptune clusters   SageMaker endpoint variants   Spot Fleets   Custom resources   For all other scalable targets, the default value is 0:   Amazon Comprehend document classification and entity recognizer endpoints   DynamoDB tables and global secondary indexes   Amazon Keyspaces tables   Lambda provisioned concurrency   Amazon MSK broker storage  
    */
  var ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined
  
  /**
    * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values that are either too small or too large. Values must be in the range of -2^360 to 2^360. The value must be a valid number based on the choice of metric. For example, if the metric is CPU utilization, then the target value is a percent value that represents how much of the CPU can be used before scaling out. 
    */
  var TargetValue: MetricScale
}
object TargetTrackingScalingPolicyConfiguration {
  
  inline def apply(TargetValue: MetricScale): TargetTrackingScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingScalingPolicyConfiguration]
  }
  
  extension [Self <: TargetTrackingScalingPolicyConfiguration](x: Self) {
    
    inline def setCustomizedMetricSpecification(value: CustomizedMetricSpecification): Self = StObject.set(x, "CustomizedMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setCustomizedMetricSpecificationUndefined: Self = StObject.set(x, "CustomizedMetricSpecification", js.undefined)
    
    inline def setDisableScaleIn(value: DisableScaleIn): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
    
    inline def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
    
    inline def setPredefinedMetricSpecification(value: PredefinedMetricSpecification): Self = StObject.set(x, "PredefinedMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setPredefinedMetricSpecificationUndefined: Self = StObject.set(x, "PredefinedMetricSpecification", js.undefined)
    
    inline def setScaleInCooldown(value: Cooldown): Self = StObject.set(x, "ScaleInCooldown", value.asInstanceOf[js.Any])
    
    inline def setScaleInCooldownUndefined: Self = StObject.set(x, "ScaleInCooldown", js.undefined)
    
    inline def setScaleOutCooldown(value: Cooldown): Self = StObject.set(x, "ScaleOutCooldown", value.asInstanceOf[js.Any])
    
    inline def setScaleOutCooldownUndefined: Self = StObject.set(x, "ScaleOutCooldown", js.undefined)
    
    inline def setTargetValue(value: MetricScale): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
  }
}
