package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsButton extends js.Object {
  /**
    * Action to take when a user taps on the button.
    * Required.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
  /**
    * Title of the button.
    * Required.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsButton {
  @scala.inline
  def apply(openUrlAction: GoogleActionsV2UiElementsOpenUrlAction = null, title: String = null): GoogleActionsV2UiElementsButton = {
    val __obj = js.Dynamic.literal()
    if (openUrlAction != null) __obj.updateDynamic("openUrlAction")(openUrlAction.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsButton]
  }
}

