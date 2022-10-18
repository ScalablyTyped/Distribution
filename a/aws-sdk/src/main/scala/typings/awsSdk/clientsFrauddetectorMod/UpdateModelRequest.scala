package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelRequest extends StObject {
  
  /**
    * The new model description.
    */
  var description: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.description] = js.undefined
  
  /**
    * The model ID.
    */
  var modelId: modelIdentifier
  
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum
}
object UpdateModelRequest {
  
  inline def apply(modelId: modelIdentifier, modelType: ModelTypeEnum): UpdateModelRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelRequest]
  }
  
  extension [Self <: UpdateModelRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
  }
}
