package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepAdjustment extends StObject {
  
  /**
    * The lower bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the lower bound is inclusive (the metric must be greater than or equal to the threshold plus the lower bound). Otherwise, it is exclusive (the metric must be greater than the threshold plus the lower bound). A null value indicates negative infinity.
    */
  var MetricIntervalLowerBound: js.UndefOr[MetricScale] = js.undefined
  
  /**
    * The upper bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the upper bound is exclusive (the metric must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric must be less than or equal to the threshold plus the upper bound). A null value indicates positive infinity. The upper bound must be greater than the lower bound.
    */
  var MetricIntervalUpperBound: js.UndefOr[MetricScale] = js.undefined
  
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity. For exact capacity, you must specify a positive value.
    */
  var ScalingAdjustment: typings.awsSdk.applicationautoscalingMod.ScalingAdjustment
}
object StepAdjustment {
  
  inline def apply(ScalingAdjustment: ScalingAdjustment): StepAdjustment = {
    val __obj = js.Dynamic.literal(ScalingAdjustment = ScalingAdjustment.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepAdjustment]
  }
  
  extension [Self <: StepAdjustment](x: Self) {
    
    inline def setMetricIntervalLowerBound(value: MetricScale): Self = StObject.set(x, "MetricIntervalLowerBound", value.asInstanceOf[js.Any])
    
    inline def setMetricIntervalLowerBoundUndefined: Self = StObject.set(x, "MetricIntervalLowerBound", js.undefined)
    
    inline def setMetricIntervalUpperBound(value: MetricScale): Self = StObject.set(x, "MetricIntervalUpperBound", value.asInstanceOf[js.Any])
    
    inline def setMetricIntervalUpperBoundUndefined: Self = StObject.set(x, "MetricIntervalUpperBound", js.undefined)
    
    inline def setScalingAdjustment(value: ScalingAdjustment): Self = StObject.set(x, "ScalingAdjustment", value.asInstanceOf[js.Any])
  }
}
