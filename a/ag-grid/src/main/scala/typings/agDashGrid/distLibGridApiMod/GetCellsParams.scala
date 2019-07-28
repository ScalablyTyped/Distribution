package typings.agDashGrid.distLibGridApiMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
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
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (rowNodes != null) __obj.updateDynamic("rowNodes")(rowNodes)
    __obj.asInstanceOf[GetCellsParams]
  }
}

