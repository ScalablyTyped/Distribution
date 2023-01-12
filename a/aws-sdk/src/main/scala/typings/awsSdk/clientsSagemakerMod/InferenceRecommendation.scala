package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceRecommendation extends StObject {
  
  /**
    * Defines the endpoint configuration parameters.
    */
  var EndpointConfiguration: EndpointOutputConfiguration
  
  /**
    * The metrics used to decide what recommendation to make.
    */
  var Metrics: RecommendationMetrics
  
  /**
    * Defines the model configuration.
    */
  var ModelConfiguration: typings.awsSdk.clientsSagemakerMod.ModelConfiguration
}
object InferenceRecommendation {
  
  inline def apply(
    EndpointConfiguration: EndpointOutputConfiguration,
    Metrics: RecommendationMetrics,
    ModelConfiguration: ModelConfiguration
  ): InferenceRecommendation = {
    val __obj = js.Dynamic.literal(EndpointConfiguration = EndpointConfiguration.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any], ModelConfiguration = ModelConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferenceRecommendation] (val x: Self) extends AnyVal {
    
    inline def setEndpointConfiguration(value: EndpointOutputConfiguration): Self = StObject.set(x, "EndpointConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: RecommendationMetrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setModelConfiguration(value: ModelConfiguration): Self = StObject.set(x, "ModelConfiguration", value.asInstanceOf[js.Any])
  }
}
