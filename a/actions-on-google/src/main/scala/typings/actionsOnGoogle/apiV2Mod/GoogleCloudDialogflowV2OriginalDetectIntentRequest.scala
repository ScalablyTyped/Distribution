package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2OriginalDetectIntentRequest extends StObject {
  
  var payload: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2OriginalDetectIntentRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2OriginalDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2OriginalDetectIntentRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2OriginalDetectIntentRequestMutableBuilder[Self <: GoogleCloudDialogflowV2OriginalDetectIntentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
