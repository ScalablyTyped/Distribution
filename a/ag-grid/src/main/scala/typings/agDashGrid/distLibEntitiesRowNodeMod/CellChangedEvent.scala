package typings.agDashGrid.distLibEntitiesRowNodeMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellChangedEvent extends RowNodeEvent {
  var column: Column
  var newValue: js.Any
}

object CellChangedEvent {
  @scala.inline
  def apply(column: Column, newValue: js.Any, node: RowNode, `type`: String): CellChangedEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellChangedEvent]
  }
}

