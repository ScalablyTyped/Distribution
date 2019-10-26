package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2Intent extends js.Object {
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
  def apply(
    action: String = null,
    defaultResponsePlatforms: js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms] = null,
    displayName: String = null,
    events: js.Array[String] = null,
    followupIntentInfo: js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo] = null,
    inputContextNames: js.Array[String] = null,
    isFallback: js.UndefOr[Boolean] = js.undefined,
    messages: js.Array[GoogleCloudDialogflowV2IntentMessage] = null,
    mlDisabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outputContexts: js.Array[GoogleCloudDialogflowV2Context] = null,
    parameters: js.Array[GoogleCloudDialogflowV2IntentParameter] = null,
    parentFollowupIntentName: String = null,
    priority: Int | Double = null,
    resetContexts: js.UndefOr[Boolean] = js.undefined,
    rootFollowupIntentName: String = null,
    trainingPhrases: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase] = null,
    webhookState: GoogleCloudDialogflowV2IntentWebhookState = null
  ): GoogleCloudDialogflowV2Intent = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (defaultResponsePlatforms != null) __obj.updateDynamic("defaultResponsePlatforms")(defaultResponsePlatforms)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (events != null) __obj.updateDynamic("events")(events)
    if (followupIntentInfo != null) __obj.updateDynamic("followupIntentInfo")(followupIntentInfo)
    if (inputContextNames != null) __obj.updateDynamic("inputContextNames")(inputContextNames)
    if (!js.isUndefined(isFallback)) __obj.updateDynamic("isFallback")(isFallback)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(mlDisabled)) __obj.updateDynamic("mlDisabled")(mlDisabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (parentFollowupIntentName != null) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(resetContexts)) __obj.updateDynamic("resetContexts")(resetContexts)
    if (rootFollowupIntentName != null) __obj.updateDynamic("rootFollowupIntentName")(rootFollowupIntentName)
    if (trainingPhrases != null) __obj.updateDynamic("trainingPhrases")(trainingPhrases)
    if (webhookState != null) __obj.updateDynamic("webhookState")(webhookState)
    __obj.asInstanceOf[GoogleCloudDialogflowV2Intent]
  }
}

