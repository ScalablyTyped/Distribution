package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersOrderUpdateAction extends js.Object {
  /**
    * Button label and link.
    */
  var button: js.UndefOr[GoogleActionsV2UiElementsButton] = js.native
  /**
    * Type of action.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersOrderUpdateActionType] = js.native
}

object GoogleActionsV2OrdersOrderUpdateAction {
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderUpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdateAction]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderUpdateActionOps[Self <: GoogleActionsV2OrdersOrderUpdateAction] (val x: Self) extends AnyVal {
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
    def setButton(value: GoogleActionsV2UiElementsButton): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setType(value: GoogleActionsV2OrdersOrderUpdateActionType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

