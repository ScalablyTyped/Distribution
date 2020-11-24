package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2QueryResult extends js.Object {
  
  var action: js.UndefOr[String] = js.native
  
  var allRequiredParamsPresent: js.UndefOr[Boolean] = js.native
  
  var diagnosticInfo: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.native
  
  var fulfillmentText: js.UndefOr[String] = js.native
  
  var intent: js.UndefOr[GoogleCloudDialogflowV2Intent] = js.native
  
  var intentDetectionConfidence: js.UndefOr[Double] = js.native
  
  var languageCode: js.UndefOr[String] = js.native
  
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.native
  
  var parameters: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var queryText: js.UndefOr[String] = js.native
  
  var speechRecognitionConfidence: js.UndefOr[Double] = js.native
  
  var webhookPayload: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var webhookSource: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2QueryResult {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2QueryResult]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2QueryResultOps[Self <: GoogleCloudDialogflowV2QueryResult] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAllRequiredParamsPresent(value: Boolean): Self = this.set("allRequiredParamsPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllRequiredParamsPresent: Self = this.set("allRequiredParamsPresent", js.undefined)
    
    @scala.inline
    def setDiagnosticInfo(value: ApiClientObjectMap[_]): Self = this.set("diagnosticInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnosticInfo: Self = this.set("diagnosticInfo", js.undefined)
    
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
    def setIntent(value: GoogleCloudDialogflowV2Intent): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    
    @scala.inline
    def setIntentDetectionConfidence(value: Double): Self = this.set("intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntentDetectionConfidence: Self = this.set("intentDetectionConfidence", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = this.set("outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = this.set("outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputContexts: Self = this.set("outputContexts", js.undefined)
    
    @scala.inline
    def setParameters(value: ApiClientObjectMap[_]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setQueryText(value: String): Self = this.set("queryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryText: Self = this.set("queryText", js.undefined)
    
    @scala.inline
    def setSpeechRecognitionConfidence(value: Double): Self = this.set("speechRecognitionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechRecognitionConfidence: Self = this.set("speechRecognitionConfidence", js.undefined)
    
    @scala.inline
    def setWebhookPayload(value: ApiClientObjectMap[_]): Self = this.set("webhookPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookPayload: Self = this.set("webhookPayload", js.undefined)
    
    @scala.inline
    def setWebhookSource(value: String): Self = this.set("webhookSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookSource: Self = this.set("webhookSource", js.undefined)
  }
}
