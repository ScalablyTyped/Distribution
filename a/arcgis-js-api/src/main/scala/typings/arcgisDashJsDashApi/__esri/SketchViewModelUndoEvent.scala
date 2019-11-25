package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelUndoEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var tool: String
  var `type`: String
}

object SketchViewModelUndoEvent {
  @scala.inline
  def apply(graphics: js.Array[Graphic], tool: String, `type`: String): SketchViewModelUndoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelUndoEvent]
  }
}

