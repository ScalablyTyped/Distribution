package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentMessageBasicCard extends js.Object {
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton]] = js.native
  var formattedText: js.UndefOr[String] = js.native
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object GoogleCloudDialogflowV2IntentMessageBasicCard {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageBasicCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBasicCard]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageBasicCardOps[Self <: GoogleCloudDialogflowV2IntentMessageBasicCard] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: GoogleCloudDialogflowV2IntentMessageBasicCardButton*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setFormattedText(value: String): Self = this.set("formattedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedText: Self = this.set("formattedText", js.undefined)
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
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

