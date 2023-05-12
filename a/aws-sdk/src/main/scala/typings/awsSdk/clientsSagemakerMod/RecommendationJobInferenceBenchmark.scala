package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationJobInferenceBenchmark extends StObject {
  
  var EndpointConfiguration: js.UndefOr[EndpointOutputConfiguration] = js.undefined
  
  var EndpointMetrics: js.UndefOr[InferenceMetrics] = js.undefined
  
  /**
    * The reason why a benchmark failed.
    */
  var FailureReason: js.UndefOr[RecommendationFailureReason] = js.undefined
  
  var Metrics: js.UndefOr[RecommendationMetrics] = js.undefined
  
  var ModelConfiguration: typings.awsSdk.clientsSagemakerMod.ModelConfiguration
}
object RecommendationJobInferenceBenchmark {
  
  inline def apply(ModelConfiguration: ModelConfiguration): RecommendationJobInferenceBenchmark = {
    val __obj = js.Dynamic.literal(ModelConfiguration = ModelConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationJobInferenceBenchmark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationJobInferenceBenchmark] (val x: Self) extends AnyVal {
    
    inline def setEndpointConfiguration(value: EndpointOutputConfiguration): Self = StObject.set(x, "EndpointConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigurationUndefined: Self = StObject.set(x, "EndpointConfiguration", js.undefined)
    
    inline def setEndpointMetrics(value: InferenceMetrics): Self = StObject.set(x, "EndpointMetrics", value.asInstanceOf[js.Any])
    
    inline def setEndpointMetricsUndefined: Self = StObject.set(x, "EndpointMetrics", js.undefined)
    
    inline def setFailureReason(value: RecommendationFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setMetrics(value: RecommendationMetrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setModelConfiguration(value: ModelConfiguration): Self = StObject.set(x, "ModelConfiguration", value.asInstanceOf[js.Any])
  }
}
