package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsTableCardCell extends js.Object {
  /**
    * Text content of the cell.
    */
  var text: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsTableCardCell {
  @scala.inline
  def apply(text: String = null): GoogleActionsV2UiElementsTableCardCell = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardCell]
  }
}

