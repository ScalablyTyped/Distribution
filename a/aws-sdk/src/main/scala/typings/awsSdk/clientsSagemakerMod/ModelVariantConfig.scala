package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelVariantConfig extends StObject {
  
  /**
    * The configuration for the infrastructure that the model will be deployed to.
    */
  var InfrastructureConfig: ModelInfrastructureConfig
  
  /**
    * The name of the Amazon SageMaker Model entity.
    */
  var ModelName: typings.awsSdk.clientsSagemakerMod.ModelName
  
  /**
    * The name of the variant.
    */
  var VariantName: ModelVariantName
}
object ModelVariantConfig {
  
  inline def apply(
    InfrastructureConfig: ModelInfrastructureConfig,
    ModelName: ModelName,
    VariantName: ModelVariantName
  ): ModelVariantConfig = {
    val __obj = js.Dynamic.literal(InfrastructureConfig = InfrastructureConfig.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVariantConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelVariantConfig] (val x: Self) extends AnyVal {
    
    inline def setInfrastructureConfig(value: ModelInfrastructureConfig): Self = StObject.set(x, "InfrastructureConfig", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setVariantName(value: ModelVariantName): Self = StObject.set(x, "VariantName", value.asInstanceOf[js.Any])
  }
}
