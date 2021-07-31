package typings.actionsOnGoogle.apiV2Mod

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
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Intent]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMutableBuilder[Self <: GoogleCloudDialogflowV2Intent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDefaultResponsePlatforms(value: js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms]): Self = StObject.set(x, "defaultResponsePlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResponsePlatformsUndefined: Self = StObject.set(x, "defaultResponsePlatforms", js.undefined)
    
    @scala.inline
    def setDefaultResponsePlatformsVarargs(value: GoogleCloudDialogflowV2IntentDefaultResponsePlatforms*): Self = StObject.set(x, "defaultResponsePlatforms", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setFollowupIntentInfo(value: js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo]): Self = StObject.set(x, "followupIntentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowupIntentInfoUndefined: Self = StObject.set(x, "followupIntentInfo", js.undefined)
    
    @scala.inline
    def setFollowupIntentInfoVarargs(value: GoogleCloudDialogflowV2IntentFollowupIntentInfo*): Self = StObject.set(x, "followupIntentInfo", js.Array(value :_*))
    
    @scala.inline
    def setInputContextNames(value: js.Array[String]): Self = StObject.set(x, "inputContextNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContextNamesUndefined: Self = StObject.set(x, "inputContextNames", js.undefined)
    
    @scala.inline
    def setInputContextNamesVarargs(value: String*): Self = StObject.set(x, "inputContextNames", js.Array(value :_*))
    
    @scala.inline
    def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFallbackUndefined: Self = StObject.set(x, "isFallback", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[GoogleCloudDialogflowV2IntentMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GoogleCloudDialogflowV2IntentMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setMlDisabled(value: Boolean): Self = StObject.set(x, "mlDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMlDisabledUndefined: Self = StObject.set(x, "mlDisabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[GoogleCloudDialogflowV2IntentParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: GoogleCloudDialogflowV2IntentParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    @scala.inline
    def setRootFollowupIntentName(value: String): Self = StObject.set(x, "rootFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFollowupIntentNameUndefined: Self = StObject.set(x, "rootFollowupIntentName", js.undefined)
    
    @scala.inline
    def setTrainingPhrases(value: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase]): Self = StObject.set(x, "trainingPhrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingPhrasesUndefined: Self = StObject.set(x, "trainingPhrases", js.undefined)
    
    @scala.inline
    def setTrainingPhrasesVarargs(value: GoogleCloudDialogflowV2IntentTrainingPhrase*): Self = StObject.set(x, "trainingPhrases", js.Array(value :_*))
    
    @scala.inline
    def setWebhookState(value: GoogleCloudDialogflowV2IntentWebhookState): Self = StObject.set(x, "webhookState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookStateUndefined: Self = StObject.set(x, "webhookState", js.undefined)
  }
}
