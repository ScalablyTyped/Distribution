package typings.agGrid.gridOptionsMod

import typings.agGrid.gridCellMod.GridCellDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabToNextCellParams extends js.Object {
  var backwards: Boolean
  var editing: Boolean
  var nextCellDef: GridCellDef
  var previousCellDef: GridCellDef
}

object TabToNextCellParams {
  @scala.inline
  def apply(backwards: Boolean, editing: Boolean, nextCellDef: GridCellDef, previousCellDef: GridCellDef): TabToNextCellParams = {
    val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], nextCellDef = nextCellDef.asInstanceOf[js.Any], previousCellDef = previousCellDef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabToNextCellParams]
  }
}

