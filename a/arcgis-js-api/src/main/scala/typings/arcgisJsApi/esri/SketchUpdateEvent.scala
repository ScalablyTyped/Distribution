package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.active
import typings.arcgisJsApi.arcgisJsApiStrings.complete
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.start
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.arcgisJsApi.arcgisJsApiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchUpdateEvent extends js.Object {
  var aborted: Boolean
  var graphics: js.Array[Graphic]
  var state: start | active | complete
  var tool: move | transform | reshape
  var toolEventInfo: UpdateToolEventInfo
  var `type`: update
}

object SketchUpdateEvent {
  @scala.inline
  def apply(
    aborted: Boolean,
    graphics: js.Array[Graphic],
    state: start | active | complete,
    tool: move | transform | reshape,
    toolEventInfo: UpdateToolEventInfo,
    `type`: update
  ): SketchUpdateEvent = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], graphics = graphics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchUpdateEvent]
  }
}

