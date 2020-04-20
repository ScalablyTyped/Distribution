package typings.agGrid.iRangeControllerMod

import typings.agGrid.columnMod.Column
import typings.agGrid.gridCellMod.GridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelection extends js.Object {
  var columns: js.Array[Column]
  var end: GridCell
  var start: GridCell
}

object RangeSelection {
  @scala.inline
  def apply(columns: js.Array[Column], end: GridCell, start: GridCell): RangeSelection = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelection]
  }
}

