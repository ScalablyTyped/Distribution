package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTrackingConfiguration extends StObject {
  
  /**
    * A customized metric. You can specify either a predefined metric or a customized metric. 
    */
  var CustomizedScalingMetricSpecification: js.UndefOr[typings.awsSdk.autoscalingplansMod.CustomizedScalingMetricSpecification] = js.native
  
  /**
    * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is true, scale in is disabled and the target tracking scaling policy doesn't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable resource.  The default value is false.
    */
  var DisableScaleIn: js.UndefOr[typings.awsSdk.autoscalingplansMod.DisableScaleIn] = js.native
  
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This value is used only if the resource is an Auto Scaling group.
    */
  var EstimatedInstanceWarmup: js.UndefOr[Cooldown] = js.native
  
  /**
    * A predefined metric. You can specify either a predefined metric or a customized metric.
    */
  var PredefinedScalingMetricSpecification: js.UndefOr[typings.awsSdk.autoscalingplansMod.PredefinedScalingMetricSpecification] = js.native
  
  /**
    * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. This value is not used if the scalable resource is an Auto Scaling group. The cooldown period is used to block subsequent scale in requests until it has expired. The intention is to scale in conservatively to protect your application's availability. However, if another alarm triggers a scale-out policy during the cooldown period after a scale-in, AWS Auto Scaling scales out your scalable target immediately.
    */
  var ScaleInCooldown: js.UndefOr[Cooldown] = js.native
  
  /**
    * The amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start. This value is not used if the scalable resource is an Auto Scaling group. While the cooldown period is in effect, the capacity that has been added by the previous scale-out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. The intention is to continuously (but not excessively) scale out.
    */
  var ScaleOutCooldown: js.UndefOr[Cooldown] = js.native
  
  /**
    * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
    */
  var TargetValue: MetricScale = js.native
}
object TargetTrackingConfiguration {
  
  @scala.inline
  def apply(TargetValue: MetricScale): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
  
  @scala.inline
  implicit class TargetTrackingConfigurationMutableBuilder[Self <: TargetTrackingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomizedScalingMetricSpecification(value: CustomizedScalingMetricSpecification): Self = StObject.set(x, "CustomizedScalingMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizedScalingMetricSpecificationUndefined: Self = StObject.set(x, "CustomizedScalingMetricSpecification", js.undefined)
    
    @scala.inline
    def setDisableScaleIn(value: DisableScaleIn): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
    
    @scala.inline
    def setEstimatedInstanceWarmup(value: Cooldown): Self = StObject.set(x, "EstimatedInstanceWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedInstanceWarmupUndefined: Self = StObject.set(x, "EstimatedInstanceWarmup", js.undefined)
    
    @scala.inline
    def setPredefinedScalingMetricSpecification(value: PredefinedScalingMetricSpecification): Self = StObject.set(x, "PredefinedScalingMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedScalingMetricSpecificationUndefined: Self = StObject.set(x, "PredefinedScalingMetricSpecification", js.undefined)
    
    @scala.inline
    def setScaleInCooldown(value: Cooldown): Self = StObject.set(x, "ScaleInCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleInCooldownUndefined: Self = StObject.set(x, "ScaleInCooldown", js.undefined)
    
    @scala.inline
    def setScaleOutCooldown(value: Cooldown): Self = StObject.set(x, "ScaleOutCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleOutCooldownUndefined: Self = StObject.set(x, "ScaleOutCooldown", js.undefined)
    
    @scala.inline
    def setTargetValue(value: MetricScale): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
  }
}
