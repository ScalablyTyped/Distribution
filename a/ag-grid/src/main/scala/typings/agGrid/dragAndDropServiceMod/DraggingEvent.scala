package typings.agGrid.dragAndDropServiceMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggingEvent extends js.Object {
  var dragItem: DragItem
  var dragSource: DragSource
  var event: MouseEvent
  var fromNudge: Boolean
  var hDirection: HDirection
  var vDirection: VDirection
  var x: Double
  var y: Double
}

object DraggingEvent {
  @scala.inline
  def apply(
    dragItem: DragItem,
    dragSource: DragSource,
    event: MouseEvent,
    fromNudge: Boolean,
    hDirection: HDirection,
    vDirection: VDirection,
    x: Double,
    y: Double
  ): DraggingEvent = {
    val __obj = js.Dynamic.literal(dragItem = dragItem.asInstanceOf[js.Any], dragSource = dragSource.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromNudge = fromNudge.asInstanceOf[js.Any], hDirection = hDirection.asInstanceOf[js.Any], vDirection = vDirection.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DraggingEvent]
  }
}

