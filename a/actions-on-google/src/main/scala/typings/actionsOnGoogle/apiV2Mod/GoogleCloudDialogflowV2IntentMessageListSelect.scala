package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentMessageListSelect extends js.Object {
  var items: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageListSelectItem]] = js.native
  var title: js.UndefOr[String] = js.native
}

object GoogleCloudDialogflowV2IntentMessageListSelect {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageListSelect]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageListSelectOps[Self <: GoogleCloudDialogflowV2IntentMessageListSelect] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: GoogleCloudDialogflowV2IntentMessageListSelectItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[GoogleCloudDialogflowV2IntentMessageListSelectItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

