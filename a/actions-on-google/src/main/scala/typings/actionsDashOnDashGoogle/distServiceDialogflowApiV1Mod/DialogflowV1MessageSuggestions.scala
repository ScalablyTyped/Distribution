package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.google
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.suggestion_chips
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageSuggestions
  extends DialogflowV1BaseGoogleMessage[suggestion_chips]
     with DialogflowV1Message {
  var suggestions: js.UndefOr[js.Array[DialogflowV1MessageSuggestion]] = js.undefined
}

object DialogflowV1MessageSuggestions {
  @scala.inline
  def apply(
    platform: google,
    suggestions: js.Array[DialogflowV1MessageSuggestion] = null,
    `type`: suggestion_chips = null
  ): DialogflowV1MessageSuggestions = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageSuggestions]
  }
}

