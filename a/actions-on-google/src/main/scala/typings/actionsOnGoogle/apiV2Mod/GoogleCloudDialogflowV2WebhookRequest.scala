package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2WebhookRequest extends StObject {
  
  var originalDetectIntentRequest: js.UndefOr[GoogleCloudDialogflowV2OriginalDetectIntentRequest] = js.native
  
  var queryResult: js.UndefOr[GoogleCloudDialogflowV2QueryResult] = js.native
  
  var responseId: js.UndefOr[String] = js.native
  
  var session: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2WebhookRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2WebhookRequestMutableBuilder[Self <: GoogleCloudDialogflowV2WebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalDetectIntentRequest(value: GoogleCloudDialogflowV2OriginalDetectIntentRequest): Self = StObject.set(x, "originalDetectIntentRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDetectIntentRequestUndefined: Self = StObject.set(x, "originalDetectIntentRequest", js.undefined)
    
    @scala.inline
    def setQueryResult(value: GoogleCloudDialogflowV2QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    @scala.inline
    def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    @scala.inline
    def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
