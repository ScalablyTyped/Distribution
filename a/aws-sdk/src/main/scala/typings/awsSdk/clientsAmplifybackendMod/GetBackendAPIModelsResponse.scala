package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackendAPIModelsResponse extends StObject {
  
  /**
    * Stringified JSON of the datastore model.
    */
  var Models: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of the request.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.Status] = js.undefined
}
object GetBackendAPIModelsResponse {
  
  inline def apply(): GetBackendAPIModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackendAPIModelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBackendAPIModelsResponse] (val x: Self) extends AnyVal {
    
    inline def setModels(value: string): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "Models", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
