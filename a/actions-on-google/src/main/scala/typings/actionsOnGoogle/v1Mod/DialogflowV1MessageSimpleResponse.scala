package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.actionsOnGoogleStrings.simple_response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageSimpleResponse
  extends DialogflowV1BaseGoogleMessage[simple_response]
     with DialogflowV1Message {
  var displayText: js.UndefOr[String] = js.native
  var textToSpeech: js.UndefOr[String] = js.native
}

object DialogflowV1MessageSimpleResponse {
  @scala.inline
  def apply(platform: google): DialogflowV1MessageSimpleResponse = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageSimpleResponse]
  }
  @scala.inline
  implicit class DialogflowV1MessageSimpleResponseOps[Self <: DialogflowV1MessageSimpleResponse] (val x: Self) extends AnyVal {
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
    def setTextToSpeech(value: String): Self = this.set("textToSpeech", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextToSpeech: Self = this.set("textToSpeech", js.undefined)
  }
  
}

