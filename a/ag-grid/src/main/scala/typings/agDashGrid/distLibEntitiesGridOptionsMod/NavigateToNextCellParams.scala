package typings.agDashGrid.distLibEntitiesGridOptionsMod

import typings.agDashGrid.distLibEntitiesGridCellMod.GridCellDef
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToNextCellParams extends js.Object {
  var event: KeyboardEvent
  var key: Double
  var nextCellDef: GridCellDef
  var previousCellDef: GridCellDef
}

object NavigateToNextCellParams {
  @scala.inline
  def apply(event: KeyboardEvent, key: Double, nextCellDef: GridCellDef, previousCellDef: GridCellDef): NavigateToNextCellParams = {
    val __obj = js.Dynamic.literal(event = event, key = key, nextCellDef = nextCellDef, previousCellDef = previousCellDef)
  
    __obj.asInstanceOf[NavigateToNextCellParams]
  }
}

