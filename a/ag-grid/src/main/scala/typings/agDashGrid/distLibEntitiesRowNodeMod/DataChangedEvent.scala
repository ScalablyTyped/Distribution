package typings.agDashGrid.distLibEntitiesRowNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataChangedEvent extends RowNodeEvent {
  var newData: js.Any
  var oldData: js.Any
  var update: Boolean
}

object DataChangedEvent {
  @scala.inline
  def apply(newData: js.Any, node: RowNode, oldData: js.Any, `type`: String, update: Boolean): DataChangedEvent = {
    val __obj = js.Dynamic.literal(newData = newData.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChangedEvent]
  }
}

