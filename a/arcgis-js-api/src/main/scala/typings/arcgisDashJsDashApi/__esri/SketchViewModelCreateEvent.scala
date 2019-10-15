package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelCreateEvent extends js.Object {
  var graphic: Graphic
  var state: String
  var tool: String
  var toolEventInfo: CreateToolEventInfo
  var `type`: String
}

object SketchViewModelCreateEvent {
  @scala.inline
  def apply(graphic: Graphic, state: String, tool: String, toolEventInfo: CreateToolEventInfo, `type`: String): SketchViewModelCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic, state = state, tool = tool, toolEventInfo = toolEventInfo)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SketchViewModelCreateEvent]
  }
}

