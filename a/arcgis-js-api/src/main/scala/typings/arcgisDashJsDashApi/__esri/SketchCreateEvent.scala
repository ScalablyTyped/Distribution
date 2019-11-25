package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchCreateEvent extends js.Object {
  var graphic: Graphic
  var state: String
  var tool: String
  var toolEventInfo: CreateToolEventInfo
  var `type`: String
}

object SketchCreateEvent {
  @scala.inline
  def apply(graphic: Graphic, state: String, tool: String, toolEventInfo: CreateToolEventInfo, `type`: String): SketchCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchCreateEvent]
  }
}

