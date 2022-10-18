package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelVersionRequest extends StObject {
  
  /**
    * The model ID of the model version to delete.
    */
  var modelId: modelIdentifier
  
  /**
    * The model type of the model version to delete.
    */
  var modelType: ModelTypeEnum
  
  /**
    * The model version number of the model version to delete.
    */
  var modelVersionNumber: floatVersionString
}
object DeleteModelVersionRequest {
  
  inline def apply(modelId: modelIdentifier, modelType: ModelTypeEnum, modelVersionNumber: floatVersionString): DeleteModelVersionRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelVersionRequest]
  }
  
  extension [Self <: DeleteModelVersionRequest](x: Self) {
    
    inline def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelVersionNumber(value: floatVersionString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
  }
}
