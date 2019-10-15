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
    val __obj = js.Dynamic.literal(graphic = graphic, state = state, tool = tool, toolEventInfo = toolEventInfo)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SketchCreateEvent]
  }
}

