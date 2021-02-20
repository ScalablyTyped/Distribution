package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2QueryResult extends StObject {
  
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
  implicit class GoogleCloudDialogflowV2QueryResultMutableBuilder[Self <: GoogleCloudDialogflowV2QueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAllRequiredParamsPresent(value: Boolean): Self = StObject.set(x, "allRequiredParamsPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllRequiredParamsPresentUndefined: Self = StObject.set(x, "allRequiredParamsPresent", js.undefined)
    
    @scala.inline
    def setDiagnosticInfo(value: ApiClientObjectMap[_]): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
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
    def setIntent(value: GoogleCloudDialogflowV2Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentDetectionConfidence(value: Double): Self = StObject.set(x, "intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentDetectionConfidenceUndefined: Self = StObject.set(x, "intentDetectionConfidence", js.undefined)
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: ApiClientObjectMap[_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTextUndefined: Self = StObject.set(x, "queryText", js.undefined)
    
    @scala.inline
    def setSpeechRecognitionConfidence(value: Double): Self = StObject.set(x, "speechRecognitionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechRecognitionConfidenceUndefined: Self = StObject.set(x, "speechRecognitionConfidence", js.undefined)
    
    @scala.inline
    def setWebhookPayload(value: ApiClientObjectMap[_]): Self = StObject.set(x, "webhookPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookPayloadUndefined: Self = StObject.set(x, "webhookPayload", js.undefined)
    
    @scala.inline
    def setWebhookSource(value: String): Self = StObject.set(x, "webhookSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookSourceUndefined: Self = StObject.set(x, "webhookSource", js.undefined)
  }
}
