package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageSuggestions extends js.Object {
  var suggestions: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageSuggestion]] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageSuggestions {
  @scala.inline
  def apply(suggestions: js.Array[GoogleCloudDialogflowV2IntentMessageSuggestion] = null): GoogleCloudDialogflowV2IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSuggestions]
  }
}

