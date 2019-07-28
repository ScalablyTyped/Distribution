package typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod

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
    val __obj = js.Dynamic.literal(dragItem = dragItem, dragSource = dragSource, event = event, fromNudge = fromNudge, hDirection = hDirection, vDirection = vDirection, x = x, y = y)
  
    __obj.asInstanceOf[DraggingEvent]
  }
}

