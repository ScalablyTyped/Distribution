package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.delete
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.move
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.reshape
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDeleteEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var tool: move | reshape | transform
  var `type`: delete
}

object SketchDeleteEvent {
  @scala.inline
  def apply(graphics: js.Array[Graphic], tool: move | reshape | transform, `type`: delete): SketchDeleteEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchDeleteEvent]
  }
}

