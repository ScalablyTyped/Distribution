package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsTableCardRow extends js.Object {
  /**
    * Cells in this row. The first 3 cells are guaranteed to be shown but
    * others might be cut on certain surfaces. Please test with the simulator
    * to see which cells will be shown for a given surface.
    */
  var cells: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardCell]] = js.undefined
  /**
    * Indicates whether there should be a divider after each row.
    */
  var dividerAfter: js.UndefOr[Boolean] = js.undefined
}

object GoogleActionsV2UiElementsTableCardRow {
  @scala.inline
  def apply(
    cells: js.Array[GoogleActionsV2UiElementsTableCardCell] = null,
    dividerAfter: js.UndefOr[Boolean] = js.undefined
  ): GoogleActionsV2UiElementsTableCardRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (!js.isUndefined(dividerAfter)) __obj.updateDynamic("dividerAfter")(dividerAfter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardRow]
  }
}

