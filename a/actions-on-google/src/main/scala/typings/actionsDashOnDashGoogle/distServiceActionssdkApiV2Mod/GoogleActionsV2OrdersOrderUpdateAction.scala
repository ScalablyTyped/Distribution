package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersOrderUpdateAction extends js.Object {
  /**
    * Button label and link.
    */
  var button: js.UndefOr[GoogleActionsV2UiElementsButton] = js.undefined
  /**
    * Type of action.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersOrderUpdateActionType] = js.undefined
}

object GoogleActionsV2OrdersOrderUpdateAction {
  @scala.inline
  def apply(
    button: GoogleActionsV2UiElementsButton = null,
    `type`: GoogleActionsV2OrdersOrderUpdateActionType = null
  ): GoogleActionsV2OrdersOrderUpdateAction = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdateAction]
  }
}

