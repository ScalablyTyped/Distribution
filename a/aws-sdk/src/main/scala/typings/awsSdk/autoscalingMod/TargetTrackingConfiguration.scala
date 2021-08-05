package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTrackingConfiguration extends StObject {
  
  /**
    * A customized metric. You must specify either a predefined metric or a customized metric.
    */
  var CustomizedMetricSpecification: js.UndefOr[typings.awsSdk.autoscalingMod.CustomizedMetricSpecification] = js.undefined
  
  /**
    * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances from the Auto Scaling group. The default is false.
    */
  var DisableScaleIn: js.UndefOr[typings.awsSdk.autoscalingMod.DisableScaleIn] = js.undefined
  
  /**
    * A predefined metric. You must specify either a predefined metric or a customized metric.
    */
  var PredefinedMetricSpecification: js.UndefOr[typings.awsSdk.autoscalingMod.PredefinedMetricSpecification] = js.undefined
  
  /**
    * The target value for the metric.
    */
  var TargetValue: MetricScale
}
object TargetTrackingConfiguration {
  
  inline def apply(TargetValue: MetricScale): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
  
  extension [Self <: TargetTrackingConfiguration](x: Self) {
    
    inline def setCustomizedMetricSpecification(value: CustomizedMetricSpecification): Self = StObject.set(x, "CustomizedMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setCustomizedMetricSpecificationUndefined: Self = StObject.set(x, "CustomizedMetricSpecification", js.undefined)
    
    inline def setDisableScaleIn(value: DisableScaleIn): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
    
    inline def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
    
    inline def setPredefinedMetricSpecification(value: PredefinedMetricSpecification): Self = StObject.set(x, "PredefinedMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setPredefinedMetricSpecificationUndefined: Self = StObject.set(x, "PredefinedMetricSpecification", js.undefined)
    
    inline def setTargetValue(value: MetricScale): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
  }
}
