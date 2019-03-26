package typings
package agDashGridLib.distLibEntitiesGridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabToNextCellParams extends js.Object {
  var backwards: scala.Boolean
  var editing: scala.Boolean
  var nextCellDef: agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
  var previousCellDef: agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
}

object TabToNextCellParams {
  @scala.inline
  def apply(
    backwards: scala.Boolean,
    editing: scala.Boolean,
    nextCellDef: agDashGridLib.distLibEntitiesGridCellMod.GridCellDef,
    previousCellDef: agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
  ): TabToNextCellParams = {
    val __obj = js.Dynamic.literal(backwards = backwards, editing = editing, nextCellDef = nextCellDef, previousCellDef = previousCellDef)
  
    __obj.asInstanceOf[TabToNextCellParams]
  }
}

