package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2WebhookResponse extends StObject {
  
  var followupEventInput: js.UndefOr[GoogleCloudDialogflowV2EventInput] = js.undefined
  
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.undefined
  
  var fulfillmentText: js.UndefOr[String] = js.undefined
  
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.undefined
  
  var payload: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2WebhookResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2WebhookResponseMutableBuilder[Self <: GoogleCloudDialogflowV2WebhookResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowupEventInput(value: GoogleCloudDialogflowV2EventInput): Self = StObject.set(x, "followupEventInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowupEventInputUndefined: Self = StObject.set(x, "followupEventInput", js.undefined)
    
    @scala.inline
    def setFulfillmentMessages(value: js.Array[GoogleCloudDialogflowV2IntentMessage]): Self = StObject.set(x, "fulfillmentMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentMessagesUndefined: Self = StObject.set(x, "fulfillmentMessages", js.undefined)
    
    @scala.inline
    def setFulfillmentMessagesVarargs(value: GoogleCloudDialogflowV2IntentMessage*): Self = StObject.set(x, "fulfillmentMessages", js.Array(value :_*))
    
    @scala.inline
    def setFulfillmentText(value: String): Self = StObject.set(x, "fulfillmentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentTextUndefined: Self = StObject.set(x, "fulfillmentText", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
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
