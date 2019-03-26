package typings
package agDashGridLib.distLibInterfacesIRangeControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelection extends js.Object {
  var columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]
  var end: agDashGridLib.distLibEntitiesGridCellMod.GridCell
  var start: agDashGridLib.distLibEntitiesGridCellMod.GridCell
}

object RangeSelection {
  @scala.inline
  def apply(
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    end: agDashGridLib.distLibEntitiesGridCellMod.GridCell,
    start: agDashGridLib.distLibEntitiesGridCellMod.GridCell
  ): RangeSelection = {
    val __obj = js.Dynamic.literal(columns = columns, end = end, start = start)
  
    __obj.asInstanceOf[RangeSelection]
  }
}

