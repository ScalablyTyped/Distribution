package typings.atom.mod

import typings.atom.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationOptions extends js.Object {
  var buttons: js.UndefOr[js.Array[ClassName]] = js.native
  var description: js.UndefOr[String] = js.native
  var detail: js.UndefOr[String] = js.native
  var dismissable: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
}

object NotificationOptions {
  @scala.inline
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: ClassName*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[ClassName]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setDismissable(value: Boolean): Self = this.set("dismissable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissable: Self = this.set("dismissable", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
  }
  
}

