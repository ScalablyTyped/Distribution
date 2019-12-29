package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.move
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.multipoint
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.point
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polygon
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polyline
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rectangle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.redo
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.reshape
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelRedoEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape
  var `type`: redo
}

object SketchViewModelRedoEvent {
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape,
    `type`: redo
  ): SketchViewModelRedoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelRedoEvent]
  }
}

