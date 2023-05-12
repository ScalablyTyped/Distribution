package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelVariantConfigSummary extends StObject {
  
  /**
    * The configuration of the infrastructure that the model has been deployed to.
    */
  var InfrastructureConfig: ModelInfrastructureConfig
  
  /**
    * The name of the Amazon SageMaker Model entity.
    */
  var ModelName: typings.awsSdk.clientsSagemakerMod.ModelName
  
  /**
    * The status of deployment for the model variant on the hosted inference endpoint.    Creating - Amazon SageMaker is preparing the model variant on the hosted inference endpoint.     InService - The model variant is running on the hosted inference endpoint.     Updating - Amazon SageMaker is updating the model variant on the hosted inference endpoint.     Deleting - Amazon SageMaker is deleting the model variant on the hosted inference endpoint.     Deleted - The model variant has been deleted on the hosted inference endpoint. This can only happen after stopping the experiment.   
    */
  var Status: ModelVariantStatus
  
  /**
    * The name of the variant.
    */
  var VariantName: ModelVariantName
}
object ModelVariantConfigSummary {
  
  inline def apply(
    InfrastructureConfig: ModelInfrastructureConfig,
    ModelName: ModelName,
    Status: ModelVariantStatus,
    VariantName: ModelVariantName
  ): ModelVariantConfigSummary = {
    val __obj = js.Dynamic.literal(InfrastructureConfig = InfrastructureConfig.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVariantConfigSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelVariantConfigSummary] (val x: Self) extends AnyVal {
    
    inline def setInfrastructureConfig(value: ModelInfrastructureConfig): Self = StObject.set(x, "InfrastructureConfig", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ModelVariantStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setVariantName(value: ModelVariantName): Self = StObject.set(x, "VariantName", value.asInstanceOf[js.Any])
  }
}
