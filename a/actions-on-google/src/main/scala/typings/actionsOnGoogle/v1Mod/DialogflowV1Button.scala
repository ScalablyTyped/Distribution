package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1Button extends js.Object {
  var postback: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object DialogflowV1Button {
  @scala.inline
  def apply(): DialogflowV1Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Button]
  }
  @scala.inline
  implicit class DialogflowV1ButtonOps[Self <: DialogflowV1Button] (val x: Self) extends AnyVal {
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
    def setPostback(value: String): Self = this.set("postback", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostback: Self = this.set("postback", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

