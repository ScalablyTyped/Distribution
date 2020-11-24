package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2Intent extends js.Object {
  
  var action: js.UndefOr[String] = js.native
  
  var defaultResponsePlatforms: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var events: js.UndefOr[js.Array[String]] = js.native
  
  var followupIntentInfo: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo]] = js.native
  
  var inputContextNames: js.UndefOr[js.Array[String]] = js.native
  
  var isFallback: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.native
  
  var mlDisabled: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.native
  
  var parameters: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentParameter]] = js.native
  
  var parentFollowupIntentName: js.UndefOr[String] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var resetContexts: js.UndefOr[Boolean] = js.native
  
  var rootFollowupIntentName: js.UndefOr[String] = js.native
  
  var trainingPhrases: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase]] = js.native
  
  var webhookState: js.UndefOr[GoogleCloudDialogflowV2IntentWebhookState] = js.native
}
object GoogleCloudDialogflowV2Intent {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Intent]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentOps[Self <: GoogleCloudDialogflowV2Intent] (val x: Self) extends AnyVal {
    
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
    def setDefaultResponsePlatformsVarargs(value: GoogleCloudDialogflowV2IntentDefaultResponsePlatforms*): Self = this.set("defaultResponsePlatforms", js.Array(value :_*))
    
    @scala.inline
    def setDefaultResponsePlatforms(value: js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms]): Self = this.set("defaultResponsePlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultResponsePlatforms: Self = this.set("defaultResponsePlatforms", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFollowupIntentInfoVarargs(value: GoogleCloudDialogflowV2IntentFollowupIntentInfo*): Self = this.set("followupIntentInfo", js.Array(value :_*))
    
    @scala.inline
    def setFollowupIntentInfo(value: js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo]): Self = this.set("followupIntentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowupIntentInfo: Self = this.set("followupIntentInfo", js.undefined)
    
    @scala.inline
    def setInputContextNamesVarargs(value: String*): Self = this.set("inputContextNames", js.Array(value :_*))
    
    @scala.inline
    def setInputContextNames(value: js.Array[String]): Self = this.set("inputContextNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputContextNames: Self = this.set("inputContextNames", js.undefined)
    
    @scala.inline
    def setIsFallback(value: Boolean): Self = this.set("isFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFallback: Self = this.set("isFallback", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GoogleCloudDialogflowV2IntentMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[GoogleCloudDialogflowV2IntentMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMlDisabled(value: Boolean): Self = this.set("mlDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMlDisabled: Self = this.set("mlDisabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = this.set("outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = this.set("outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputContexts: Self = this.set("outputContexts", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: GoogleCloudDialogflowV2IntentParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[GoogleCloudDialogflowV2IntentParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setParentFollowupIntentName(value: String): Self = this.set("parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFollowupIntentName: Self = this.set("parentFollowupIntentName", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setResetContexts(value: Boolean): Self = this.set("resetContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetContexts: Self = this.set("resetContexts", js.undefined)
    
    @scala.inline
    def setRootFollowupIntentName(value: String): Self = this.set("rootFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootFollowupIntentName: Self = this.set("rootFollowupIntentName", js.undefined)
    
    @scala.inline
    def setTrainingPhrasesVarargs(value: GoogleCloudDialogflowV2IntentTrainingPhrase*): Self = this.set("trainingPhrases", js.Array(value :_*))
    
    @scala.inline
    def setTrainingPhrases(value: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase]): Self = this.set("trainingPhrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingPhrases: Self = this.set("trainingPhrases", js.undefined)
    
    @scala.inline
    def setWebhookState(value: GoogleCloudDialogflowV2IntentWebhookState): Self = this.set("webhookState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookState: Self = this.set("webhookState", js.undefined)
  }
}
