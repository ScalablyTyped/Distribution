package typings
package agDashGridLib.distLibEntitiesRowNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataChangedEvent extends RowNodeEvent {
  var newData: js.Any
  var oldData: js.Any
  var update: scala.Boolean
}

object DataChangedEvent {
  @scala.inline
  def apply(newData: js.Any, node: RowNode, oldData: js.Any, `type`: java.lang.String, update: scala.Boolean): DataChangedEvent = {
    val __obj = js.Dynamic.literal(newData = newData, node = node, oldData = oldData, update = update)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataChangedEvent]
  }
}

