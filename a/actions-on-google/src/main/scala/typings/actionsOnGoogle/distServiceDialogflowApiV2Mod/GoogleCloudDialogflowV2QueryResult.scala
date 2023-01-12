package typings.actionsOnGoogle.distServiceDialogflowApiV2Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2QueryResult extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var allRequiredParamsPresent: js.UndefOr[Boolean] = js.undefined
  
  var diagnosticInfo: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.undefined
  
  var fulfillmentText: js.UndefOr[String] = js.undefined
  
  var intent: js.UndefOr[GoogleCloudDialogflowV2Intent] = js.undefined
  
  var intentDetectionConfidence: js.UndefOr[Double] = js.undefined
  
  var languageCode: js.UndefOr[String] = js.undefined
  
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.undefined
  
  var parameters: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  var queryText: js.UndefOr[String] = js.undefined
  
  var speechRecognitionConfidence: js.UndefOr[Double] = js.undefined
  
  var webhookPayload: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  var webhookSource: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2QueryResult {
  
  inline def apply(): GoogleCloudDialogflowV2QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2QueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2QueryResult] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAllRequiredParamsPresent(value: Boolean): Self = StObject.set(x, "allRequiredParamsPresent", value.asInstanceOf[js.Any])
    
    inline def setAllRequiredParamsPresentUndefined: Self = StObject.set(x, "allRequiredParamsPresent", js.undefined)
    
    inline def setDiagnosticInfo(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
    inline def setFulfillmentMessages(value: js.Array[GoogleCloudDialogflowV2IntentMessage]): Self = StObject.set(x, "fulfillmentMessages", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentMessagesUndefined: Self = StObject.set(x, "fulfillmentMessages", js.undefined)
    
    inline def setFulfillmentMessagesVarargs(value: GoogleCloudDialogflowV2IntentMessage*): Self = StObject.set(x, "fulfillmentMessages", js.Array(value*))
    
    inline def setFulfillmentText(value: String): Self = StObject.set(x, "fulfillmentText", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentTextUndefined: Self = StObject.set(x, "fulfillmentText", js.undefined)
    
    inline def setIntent(value: GoogleCloudDialogflowV2Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidence(value: Double): Self = StObject.set(x, "intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidenceUndefined: Self = StObject.set(x, "intentDetectionConfidence", js.undefined)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParameters(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    inline def setQueryTextUndefined: Self = StObject.set(x, "queryText", js.undefined)
    
    inline def setSpeechRecognitionConfidence(value: Double): Self = StObject.set(x, "speechRecognitionConfidence", value.asInstanceOf[js.Any])
    
    inline def setSpeechRecognitionConfidenceUndefined: Self = StObject.set(x, "speechRecognitionConfidence", js.undefined)
    
    inline def setWebhookPayload(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "webhookPayload", value.asInstanceOf[js.Any])
    
    inline def setWebhookPayloadUndefined: Self = StObject.set(x, "webhookPayload", js.undefined)
    
    inline def setWebhookSource(value: String): Self = StObject.set(x, "webhookSource", value.asInstanceOf[js.Any])
    
    inline def setWebhookSourceUndefined: Self = StObject.set(x, "webhookSource", js.undefined)
  }
}
