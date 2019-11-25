package typings.agDashGrid.distLibEntitiesRowNodeMod

import typings.agDashGrid.distLibEventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowNodeEvent extends AgEvent {
  var node: RowNode
}

object RowNodeEvent {
  @scala.inline
  def apply(node: RowNode, `type`: String): RowNodeEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowNodeEvent]
  }
}

