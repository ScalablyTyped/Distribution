package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelVersionResult extends StObject {
  
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[modelIdentifier] = js.undefined
  
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.undefined
  
  /**
    * The model version number of the model version updated.
    */
  var modelVersionNumber: js.UndefOr[floatVersionString] = js.undefined
  
  /**
    * The status of the updated model version.
    */
  var status: js.UndefOr[String] = js.undefined
}
object UpdateModelVersionResult {
  
  inline def apply(): UpdateModelVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModelVersionResult]
  }
  
  extension [Self <: UpdateModelVersionResult](x: Self) {
    
    inline def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
    
    inline def setModelVersionNumber(value: floatVersionString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setModelVersionNumberUndefined: Self = StObject.set(x, "modelVersionNumber", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
