package typings
package agDashGridLib.distLibEntitiesRowNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellChangedEvent extends RowNodeEvent {
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var newValue: js.Any
}

object CellChangedEvent {
  @scala.inline
  def apply(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    newValue: js.Any,
    node: RowNode,
    `type`: java.lang.String
  ): CellChangedEvent = {
    val __obj = js.Dynamic.literal(column = column, newValue = newValue, node = node)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellChangedEvent]
  }
}

