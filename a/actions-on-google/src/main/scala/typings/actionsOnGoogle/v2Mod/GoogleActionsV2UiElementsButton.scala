package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsButton extends js.Object {
  /**
    * Action to take when a user taps on the button.
    * Required.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
  /**
    * Title of the button.
    * Required.
    */
  var title: js.UndefOr[String] = js.native
}

object GoogleActionsV2UiElementsButton {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsButton]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsButtonOps[Self <: GoogleActionsV2UiElementsButton] (val x: Self) extends AnyVal {
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
    def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = this.set("openUrlAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenUrlAction: Self = this.set("openUrlAction", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

