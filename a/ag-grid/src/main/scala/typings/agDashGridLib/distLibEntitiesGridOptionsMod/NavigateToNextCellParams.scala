package typings
package agDashGridLib.distLibEntitiesGridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToNextCellParams extends js.Object {
  var event: stdLib.KeyboardEvent
  var key: scala.Double
  var nextCellDef: agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
  var previousCellDef: agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
}

object NavigateToNextCellParams {
  @scala.inline
  def apply(
    event: stdLib.KeyboardEvent,
    key: scala.Double,
    nextCellDef: agDashGridLib.distLibEntitiesGridCellMod.GridCellDef,
    previousCellDef: agDashGridLib.distLibEntitiesGridCellMod.GridCellDef
  ): NavigateToNextCellParams = {
    val __obj = js.Dynamic.literal(event = event, key = key, nextCellDef = nextCellDef, previousCellDef = previousCellDef)
  
    __obj.asInstanceOf[NavigateToNextCellParams]
  }
}

