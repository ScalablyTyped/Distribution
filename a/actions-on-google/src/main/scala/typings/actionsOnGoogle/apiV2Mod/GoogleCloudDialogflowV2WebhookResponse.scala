package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2WebhookResponse extends js.Object {
  
  var followupEventInput: js.UndefOr[GoogleCloudDialogflowV2EventInput] = js.native
  
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.native
  
  var fulfillmentText: js.UndefOr[String] = js.native
  
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.native
  
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var source: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2WebhookResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2WebhookResponseOps[Self <: GoogleCloudDialogflowV2WebhookResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFollowupEventInput(value: GoogleCloudDialogflowV2EventInput): Self = this.set("followupEventInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowupEventInput: Self = this.set("followupEventInput", js.undefined)
    
    @scala.inline
    def setFulfillmentMessagesVarargs(value: GoogleCloudDialogflowV2IntentMessage*): Self = this.set("fulfillmentMessages", js.Array(value :_*))
    
    @scala.inline
    def setFulfillmentMessages(value: js.Array[GoogleCloudDialogflowV2IntentMessage]): Self = this.set("fulfillmentMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentMessages: Self = this.set("fulfillmentMessages", js.undefined)
    
    @scala.inline
    def setFulfillmentText(value: String): Self = this.set("fulfillmentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentText: Self = this.set("fulfillmentText", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = this.set("outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = this.set("outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputContexts: Self = this.set("outputContexts", js.undefined)
    
    @scala.inline
    def setPayload(value: ApiClientObjectMap[_]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
