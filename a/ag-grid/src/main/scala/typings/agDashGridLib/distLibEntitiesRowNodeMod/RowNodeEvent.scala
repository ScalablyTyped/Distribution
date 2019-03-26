package typings
package agDashGridLib.distLibEntitiesRowNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowNodeEvent
  extends agDashGridLib.distLibEventsMod.AgEvent {
  var node: RowNode
}

object RowNodeEvent {
  @scala.inline
  def apply(node: RowNode, `type`: java.lang.String): RowNodeEvent = {
    val __obj = js.Dynamic.literal(node = node)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowNodeEvent]
  }
}

