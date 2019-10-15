package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchUpdateEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var state: String
  var tool: String
  var toolEventInfo: UpdateToolEventInfo
  var `type`: String
}

object SketchUpdateEvent {
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    state: String,
    tool: String,
    toolEventInfo: UpdateToolEventInfo,
    `type`: String
  ): SketchUpdateEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics, state = state, tool = tool, toolEventInfo = toolEventInfo)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SketchUpdateEvent]
  }
}

