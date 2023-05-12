package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelInfrastructureConfig extends StObject {
  
  /**
    * The inference option to which to deploy your model. Possible values are the following:    RealTime: Deploy to real-time inference.  
    */
  var InfrastructureType: ModelInfrastructureType
  
  /**
    * The infrastructure configuration for deploying the model to real-time inference.
    */
  var RealTimeInferenceConfig: typings.awsSdk.clientsSagemakerMod.RealTimeInferenceConfig
}
object ModelInfrastructureConfig {
  
  inline def apply(InfrastructureType: ModelInfrastructureType, RealTimeInferenceConfig: RealTimeInferenceConfig): ModelInfrastructureConfig = {
    val __obj = js.Dynamic.literal(InfrastructureType = InfrastructureType.asInstanceOf[js.Any], RealTimeInferenceConfig = RealTimeInferenceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInfrastructureConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelInfrastructureConfig] (val x: Self) extends AnyVal {
    
    inline def setInfrastructureType(value: ModelInfrastructureType): Self = StObject.set(x, "InfrastructureType", value.asInstanceOf[js.Any])
    
    inline def setRealTimeInferenceConfig(value: RealTimeInferenceConfig): Self = StObject.set(x, "RealTimeInferenceConfig", value.asInstanceOf[js.Any])
  }
}
