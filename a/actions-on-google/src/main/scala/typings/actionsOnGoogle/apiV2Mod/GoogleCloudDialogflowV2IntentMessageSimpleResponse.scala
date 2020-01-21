package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageSimpleResponse extends js.Object {
  var displayText: js.UndefOr[String] = js.undefined
  var ssml: js.UndefOr[String] = js.undefined
  var textToSpeech: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageSimpleResponse {
  @scala.inline
  def apply(displayText: String = null, ssml: String = null, textToSpeech: String = null): GoogleCloudDialogflowV2IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponse]
  }
}

