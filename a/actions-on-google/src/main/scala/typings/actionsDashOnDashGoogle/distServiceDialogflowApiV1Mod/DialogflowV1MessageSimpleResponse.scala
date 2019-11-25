package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.google
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.simple_response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageSimpleResponse
  extends DialogflowV1BaseGoogleMessage[simple_response]
     with DialogflowV1Message {
  var displayText: js.UndefOr[String] = js.undefined
  var textToSpeech: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageSimpleResponse {
  @scala.inline
  def apply(
    platform: google,
    displayText: String = null,
    textToSpeech: String = null,
    `type`: simple_response = null
  ): DialogflowV1MessageSimpleResponse = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageSimpleResponse]
  }
}

