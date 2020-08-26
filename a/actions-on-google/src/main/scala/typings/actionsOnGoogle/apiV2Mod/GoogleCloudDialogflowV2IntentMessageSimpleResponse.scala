package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentMessageSimpleResponse extends js.Object {
  var displayText: js.UndefOr[String] = js.native
  var ssml: js.UndefOr[String] = js.native
  var textToSpeech: js.UndefOr[String] = js.native
}

object GoogleCloudDialogflowV2IntentMessageSimpleResponse {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponse]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageSimpleResponseOps[Self <: GoogleCloudDialogflowV2IntentMessageSimpleResponse] (val x: Self) extends AnyVal {
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

