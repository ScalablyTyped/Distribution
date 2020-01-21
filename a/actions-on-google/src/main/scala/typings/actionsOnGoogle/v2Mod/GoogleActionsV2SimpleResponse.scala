package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2SimpleResponse extends js.Object {
  /**
    * Optional text to display in the chat bubble. If not given, a display
    * rendering of the text_to_speech or ssml above will be used. Limited to 640
    * chars.
    */
  var displayText: js.UndefOr[String] = js.undefined
  /**
    * Structured spoken response to the user in the SSML format, e.g.
    * `<speak> Say animal name after the sound.  <audio src =
    * 'https://www.pullstring.com/moo.mps' />, what’s the animal?  </speak>`.
    * Mutually exclusive with text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.undefined
  /**
    * Plain text of the speech output, e.g., \"where do you want to go?\"
    * Mutually exclusive with ssml.
    */
  var textToSpeech: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2SimpleResponse {
  @scala.inline
  def apply(displayText: String = null, ssml: String = null, textToSpeech: String = null): GoogleActionsV2SimpleResponse = {
    val __obj = js.Dynamic.literal()
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2SimpleResponse]
  }
}

