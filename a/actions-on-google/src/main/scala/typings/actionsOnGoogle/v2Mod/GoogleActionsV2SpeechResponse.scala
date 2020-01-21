package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2SpeechResponse extends js.Object {
  /**
    * Structured spoken response to the user in the SSML format, e.g.
    * \"<speak> Say animal name after the sound.  <audio src =
    * 'https://www.pullstring.com/moo.mps' />, what’s the animal?  </speak>\".
    * Mutually exclusive with text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.undefined
  /**
    * Plain text of the speech output, e.g., \"where do you want to go?\"/
    */
  var textToSpeech: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2SpeechResponse {
  @scala.inline
  def apply(ssml: String = null, textToSpeech: String = null): GoogleActionsV2SpeechResponse = {
    val __obj = js.Dynamic.literal()
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2SpeechResponse]
  }
}

