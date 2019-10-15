package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchUndoEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var tool: String
  var `type`: String
}

object SketchUndoEvent {
  @scala.inline
  def apply(graphics: js.Array[Graphic], tool: String, `type`: String): SketchUndoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics, tool = tool)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SketchUndoEvent]
  }
}

