package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelResponse extends StObject {
  
  /**
    * The response from a call to CreateModel.
    */
  var ModelMetadata: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ModelMetadata] = js.undefined
}
object CreateModelResponse {
  
  inline def apply(): CreateModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelResponse] (val x: Self) extends AnyVal {
    
    inline def setModelMetadata(value: ModelMetadata): Self = StObject.set(x, "ModelMetadata", value.asInstanceOf[js.Any])
    
    inline def setModelMetadataUndefined: Self = StObject.set(x, "ModelMetadata", js.undefined)
  }
}
