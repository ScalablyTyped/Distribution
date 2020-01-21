package typings.agGrid.gridApiMod

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshCellsParams extends GetCellsParams {
  var force: js.UndefOr[Boolean] = js.undefined
}

object RefreshCellsParams {
  @scala.inline
  def apply(
    columns: js.Array[String | Column] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    rowNodes: js.Array[RowNode] = null
  ): RefreshCellsParams = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (rowNodes != null) __obj.updateDynamic("rowNodes")(rowNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshCellsParams]
  }
}

