package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointOutputConfiguration extends StObject {
  
  /**
    * The name of the endpoint made during a recommendation job.
    */
  var EndpointName: String
  
  /**
    * The number of instances recommended to launch initially.
    */
  var InitialInstanceCount: Integer
  
  /**
    * The instance type recommended by Amazon SageMaker Inference Recommender.
    */
  var InstanceType: ProductionVariantInstanceType
  
  /**
    * The name of the production variant (deployed model) made during a recommendation job.
    */
  var VariantName: String
}
object EndpointOutputConfiguration {
  
  inline def apply(
    EndpointName: String,
    InitialInstanceCount: Integer,
    InstanceType: ProductionVariantInstanceType,
    VariantName: String
  ): EndpointOutputConfiguration = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any], InitialInstanceCount = InitialInstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointOutputConfiguration]
  }
  
  extension [Self <: EndpointOutputConfiguration](x: Self) {
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setInitialInstanceCount(value: Integer): Self = StObject.set(x, "InitialInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: ProductionVariantInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setVariantName(value: String): Self = StObject.set(x, "VariantName", value.asInstanceOf[js.Any])
  }
}
