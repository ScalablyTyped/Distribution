package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageText
  extends DialogflowV1BaseMessage[`0`]
     with DialogflowV1Message {
  var speech: js.UndefOr[String] = js.native
}

object DialogflowV1MessageText {
  @scala.inline
  def apply(): DialogflowV1MessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageText]
  }
  @scala.inline
  implicit class DialogflowV1MessageTextOps[Self <: DialogflowV1MessageText] (val x: Self) extends AnyVal {
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
    def setSpeech(value: String): Self = this.set("speech", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeech: Self = this.set("speech", js.undefined)
  }
  
}

