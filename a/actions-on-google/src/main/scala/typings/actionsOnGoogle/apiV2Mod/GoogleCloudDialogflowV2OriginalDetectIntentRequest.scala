package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2OriginalDetectIntentRequest extends StObject {
  
  var payload: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2OriginalDetectIntentRequest {
  
  inline def apply(): GoogleCloudDialogflowV2OriginalDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2OriginalDetectIntentRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowV2OriginalDetectIntentRequest](x: Self) {
    
    inline def setPayload(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
