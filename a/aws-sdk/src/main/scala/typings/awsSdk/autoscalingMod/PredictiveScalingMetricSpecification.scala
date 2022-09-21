package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictiveScalingMetricSpecification extends StObject {
  
  /**
    * The customized capacity metric specification.
    */
  var CustomizedCapacityMetricSpecification: js.UndefOr[PredictiveScalingCustomizedCapacityMetric] = js.undefined
  
  /**
    * The customized load metric specification.
    */
  var CustomizedLoadMetricSpecification: js.UndefOr[PredictiveScalingCustomizedLoadMetric] = js.undefined
  
  /**
    * The customized scaling metric specification.
    */
  var CustomizedScalingMetricSpecification: js.UndefOr[PredictiveScalingCustomizedScalingMetric] = js.undefined
  
  /**
    * The predefined load metric specification.
    */
  var PredefinedLoadMetricSpecification: js.UndefOr[PredictiveScalingPredefinedLoadMetric] = js.undefined
  
  /**
    * The predefined metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
    */
  var PredefinedMetricPairSpecification: js.UndefOr[PredictiveScalingPredefinedMetricPair] = js.undefined
  
  /**
    * The predefined scaling metric specification.
    */
  var PredefinedScalingMetricSpecification: js.UndefOr[PredictiveScalingPredefinedScalingMetric] = js.undefined
  
  /**
    * Specifies the target utilization.  Some metrics are based on a count instead of a percentage, such as the request count for an Application Load Balancer or the number of messages in an SQS queue. If the scaling policy specifies one of these metrics, specify the target utilization as the optimal average request or message count per instance during any one-minute interval.  
    */
  var TargetValue: MetricScale
}
object PredictiveScalingMetricSpecification {
  
  inline def apply(TargetValue: MetricScale): PredictiveScalingMetricSpecification = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictiveScalingMetricSpecification]
  }
  
  extension [Self <: PredictiveScalingMetricSpecification](x: Self) {
    
    inline def setCustomizedCapacityMetricSpecification(value: PredictiveScalingCustomizedCapacityMetric): Self = StObject.set(x, "CustomizedCapacityMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setCustomizedCapacityMetricSpecificationUndefined: Self = StObject.set(x, "CustomizedCapacityMetricSpecification", js.undefined)
    
    inline def setCustomizedLoadMetricSpecification(value: PredictiveScalingCustomizedLoadMetric): Self = StObject.set(x, "CustomizedLoadMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setCustomizedLoadMetricSpecificationUndefined: Self = StObject.set(x, "CustomizedLoadMetricSpecification", js.undefined)
    
    inline def setCustomizedScalingMetricSpecification(value: PredictiveScalingCustomizedScalingMetric): Self = StObject.set(x, "CustomizedScalingMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setCustomizedScalingMetricSpecificationUndefined: Self = StObject.set(x, "CustomizedScalingMetricSpecification", js.undefined)
    
    inline def setPredefinedLoadMetricSpecification(value: PredictiveScalingPredefinedLoadMetric): Self = StObject.set(x, "PredefinedLoadMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setPredefinedLoadMetricSpecificationUndefined: Self = StObject.set(x, "PredefinedLoadMetricSpecification", js.undefined)
    
    inline def setPredefinedMetricPairSpecification(value: PredictiveScalingPredefinedMetricPair): Self = StObject.set(x, "PredefinedMetricPairSpecification", value.asInstanceOf[js.Any])
    
    inline def setPredefinedMetricPairSpecificationUndefined: Self = StObject.set(x, "PredefinedMetricPairSpecification", js.undefined)
    
    inline def setPredefinedScalingMetricSpecification(value: PredictiveScalingPredefinedScalingMetric): Self = StObject.set(x, "PredefinedScalingMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setPredefinedScalingMetricSpecificationUndefined: Self = StObject.set(x, "PredefinedScalingMetricSpecification", js.undefined)
    
    inline def setTargetValue(value: MetricScale): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
  }
}
