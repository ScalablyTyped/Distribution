package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2SimpleResponse extends js.Object {
  /**
    * Optional text to display in the chat bubble. If not given, a display
    * rendering of the text_to_speech or ssml above will be used. Limited to 640
    * chars.
    */
  var displayText: js.UndefOr[String] = js.native
  /**
    * Structured spoken response to the user in the SSML format, e.g.
    * `<speak> Say animal name after the sound.  <audio src =
    * 'https://www.pullstring.com/moo.mps' />, what’s the animal?  </speak>`.
    * Mutually exclusive with text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.native
  /**
    * Plain text of the speech output, e.g., \"where do you want to go?\"
    * Mutually exclusive with ssml.
    */
  var textToSpeech: js.UndefOr[String] = js.native
}

object GoogleActionsV2SimpleResponse {
  @scala.inline
  def apply(): GoogleActionsV2SimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SimpleResponse]
  }
  @scala.inline
  implicit class GoogleActionsV2SimpleResponseOps[Self <: GoogleActionsV2SimpleResponse] (val x: Self) extends AnyVal {
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
    def setDisplayText(value: String): Self = this.set("displayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayText: Self = this.set("displayText", js.undefined)
    @scala.inline
    def setSsml(value: String): Self = this.set("ssml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsml: Self = this.set("ssml", js.undefined)
    @scala.inline
    def setTextToSpeech(value: String): Self = this.set("textToSpeech", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextToSpeech: Self = this.set("textToSpeech", js.undefined)
  }
  
}

