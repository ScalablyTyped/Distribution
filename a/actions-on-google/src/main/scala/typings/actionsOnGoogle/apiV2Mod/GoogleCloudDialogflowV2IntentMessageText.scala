package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentMessageText extends js.Object {
  var text: js.UndefOr[js.Array[String]] = js.native
}

object GoogleCloudDialogflowV2IntentMessageText {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageText]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageTextOps[Self <: GoogleCloudDialogflowV2IntentMessageText] (val x: Self) extends AnyVal {
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
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: js.Array[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

