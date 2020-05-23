package typings.actionsOnGoogle.tableMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsTableCardCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends js.Object {
  /**
    * Cells in this row.
    * The first 3 cells are guaranteed to be shown but others might be cut on certain surfaces.
    * Please test with the simulator to see which cells will be shown for a given surface.
    *
    * When provided as a string array, creates the cells as text.
    * @public
    */
  var cells: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardCell | String]] = js.undefined
  /**
    * Indicates whether there should be a divider after each row.
    *
    * Overrides top level `dividers` property for this specific row if set.
    * @public
    */
  var dividerAfter: js.UndefOr[Boolean] = js.undefined
}

object TableRow {
  @scala.inline
  def apply(
    cells: js.Array[GoogleActionsV2UiElementsTableCardCell | String] = null,
    dividerAfter: js.UndefOr[Boolean] = js.undefined
  ): TableRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (!js.isUndefined(dividerAfter)) __obj.updateDynamic("dividerAfter")(dividerAfter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRow]
  }
}

