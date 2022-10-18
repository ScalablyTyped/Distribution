package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelRequest extends StObject {
  
  /**
    * The model ID of the model to delete.
    */
  var modelId: modelIdentifier
  
  /**
    * The model type of the model to delete.
    */
  var modelType: ModelTypeEnum
}
object DeleteModelRequest {
  
  inline def apply(modelId: modelIdentifier, modelType: ModelTypeEnum): DeleteModelRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelRequest]
  }
  
  extension [Self <: DeleteModelRequest](x: Self) {
    
    inline def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
  }
}
