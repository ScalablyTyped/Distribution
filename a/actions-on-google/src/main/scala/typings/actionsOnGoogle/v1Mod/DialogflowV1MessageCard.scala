package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageCard
  extends DialogflowV1BaseMessage[`1`]
     with DialogflowV1Message {
  var buttons: js.UndefOr[js.Array[DialogflowV1Button]] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object DialogflowV1MessageCard {
  @scala.inline
  def apply(): DialogflowV1MessageCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageCard]
  }
  @scala.inline
  implicit class DialogflowV1MessageCardOps[Self <: DialogflowV1MessageCard] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: DialogflowV1Button*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[DialogflowV1Button]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

