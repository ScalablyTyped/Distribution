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
    val __obj = js.Dynamic.literal(node = node)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowNodeEvent]
  }
}

