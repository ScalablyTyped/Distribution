package typings.actionsOnGoogle.distServiceDialogflowApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2Intent extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var defaultResponsePlatforms: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms]] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var events: js.UndefOr[js.Array[String]] = js.undefined
  
  var followupIntentInfo: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo]] = js.undefined
  
  var inputContextNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var isFallback: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.undefined
  
  var mlDisabled: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.undefined
  
  var parameters: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentParameter]] = js.undefined
  
  var parentFollowupIntentName: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var resetContexts: js.UndefOr[Boolean] = js.undefined
  
  var rootFollowupIntentName: js.UndefOr[String] = js.undefined
  
  var trainingPhrases: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase]] = js.undefined
  
  var webhookState: js.UndefOr[GoogleCloudDialogflowV2IntentWebhookState] = js.undefined
}
object GoogleCloudDialogflowV2Intent {
  
  inline def apply(): GoogleCloudDialogflowV2Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Intent]
  }
  
  extension [Self <: GoogleCloudDialogflowV2Intent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDefaultResponsePlatforms(value: js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms]): Self = StObject.set(x, "defaultResponsePlatforms", value.asInstanceOf[js.Any])
    
    inline def setDefaultResponsePlatformsUndefined: Self = StObject.set(x, "defaultResponsePlatforms", js.undefined)
    
    inline def setDefaultResponsePlatformsVarargs(value: GoogleCloudDialogflowV2IntentDefaultResponsePlatforms*): Self = StObject.set(x, "defaultResponsePlatforms", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFollowupIntentInfo(value: js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo]): Self = StObject.set(x, "followupIntentInfo", value.asInstanceOf[js.Any])
    
    inline def setFollowupIntentInfoUndefined: Self = StObject.set(x, "followupIntentInfo", js.undefined)
    
    inline def setFollowupIntentInfoVarargs(value: GoogleCloudDialogflowV2IntentFollowupIntentInfo*): Self = StObject.set(x, "followupIntentInfo", js.Array(value*))
    
    inline def setInputContextNames(value: js.Array[String]): Self = StObject.set(x, "inputContextNames", value.asInstanceOf[js.Any])
    
    inline def setInputContextNamesUndefined: Self = StObject.set(x, "inputContextNames", js.undefined)
    
    inline def setInputContextNamesVarargs(value: String*): Self = StObject.set(x, "inputContextNames", js.Array(value*))
    
    inline def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    inline def setIsFallbackUndefined: Self = StObject.set(x, "isFallback", js.undefined)
    
    inline def setMessages(value: js.Array[GoogleCloudDialogflowV2IntentMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: GoogleCloudDialogflowV2IntentMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMlDisabled(value: Boolean): Self = StObject.set(x, "mlDisabled", value.asInstanceOf[js.Any])
    
    inline def setMlDisabledUndefined: Self = StObject.set(x, "mlDisabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParameters(value: js.Array[GoogleCloudDialogflowV2IntentParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: GoogleCloudDialogflowV2IntentParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    inline def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    inline def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    inline def setRootFollowupIntentName(value: String): Self = StObject.set(x, "rootFollowupIntentName", value.asInstanceOf[js.Any])
    
    inline def setRootFollowupIntentNameUndefined: Self = StObject.set(x, "rootFollowupIntentName", js.undefined)
    
    inline def setTrainingPhrases(value: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase]): Self = StObject.set(x, "trainingPhrases", value.asInstanceOf[js.Any])
    
    inline def setTrainingPhrasesUndefined: Self = StObject.set(x, "trainingPhrases", js.undefined)
    
    inline def setTrainingPhrasesVarargs(value: GoogleCloudDialogflowV2IntentTrainingPhrase*): Self = StObject.set(x, "trainingPhrases", js.Array(value*))
    
    inline def setWebhookState(value: GoogleCloudDialogflowV2IntentWebhookState): Self = StObject.set(x, "webhookState", value.asInstanceOf[js.Any])
    
    inline def setWebhookStateUndefined: Self = StObject.set(x, "webhookState", js.undefined)
  }
}
