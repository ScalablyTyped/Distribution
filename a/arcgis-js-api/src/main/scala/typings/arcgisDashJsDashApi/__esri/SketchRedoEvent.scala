package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchRedoEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var tool: String
  var `type`: String
}

object SketchRedoEvent {
  @scala.inline
  def apply(graphics: js.Array[Graphic], tool: String, `type`: String): SketchRedoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics, tool = tool)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SketchRedoEvent]
  }
}

