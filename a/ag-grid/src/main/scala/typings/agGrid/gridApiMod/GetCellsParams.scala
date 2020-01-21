package typings.agGrid.gridApiMod

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCellsParams extends js.Object {
  var columns: js.UndefOr[js.Array[String | Column]] = js.undefined
  var rowNodes: js.UndefOr[js.Array[RowNode]] = js.undefined
}

object GetCellsParams {
  @scala.inline
  def apply(columns: js.Array[String | Column] = null, rowNodes: js.Array[RowNode] = null): GetCellsParams = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rowNodes != null) __obj.updateDynamic("rowNodes")(rowNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCellsParams]
  }
}

