package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelUpdateEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var state: String
  var tool: String
  var toolEventInfo: UpdateToolEventInfo
  var `type`: String
}

object SketchViewModelUpdateEvent {
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    state: String,
    tool: String,
    toolEventInfo: UpdateToolEventInfo,
    `type`: String
  ): SketchViewModelUpdateEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelUpdateEvent]
  }
}

