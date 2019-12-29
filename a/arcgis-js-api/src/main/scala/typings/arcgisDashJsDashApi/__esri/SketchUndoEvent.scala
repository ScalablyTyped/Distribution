package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.move
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.point
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polygon
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polyline
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rectangle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.reshape
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.transform
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.undo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchUndoEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var tool: point | polyline | polygon | rectangle | circle | move | transform | reshape
  var `type`: undo
}

object SketchUndoEvent {
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    tool: point | polyline | polygon | rectangle | circle | move | transform | reshape,
    `type`: undo
  ): SketchUndoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchUndoEvent]
  }
}

