package typings
package agDashGridLib.distLibDragAndDropDragAndDropServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggingEvent extends js.Object {
  var dragItem: DragItem
  var dragSource: DragSource
  var event: stdLib.MouseEvent
  var fromNudge: scala.Boolean
  var hDirection: HDirection
  var vDirection: VDirection
  var x: scala.Double
  var y: scala.Double
}

object DraggingEvent {
  @scala.inline
  def apply(
    dragItem: DragItem,
    dragSource: DragSource,
    event: stdLib.MouseEvent,
    fromNudge: scala.Boolean,
    hDirection: HDirection,
    vDirection: VDirection,
    x: scala.Double,
    y: scala.Double
  ): DraggingEvent = {
    val __obj = js.Dynamic.literal(dragItem = dragItem, dragSource = dragSource, event = event, fromNudge = fromNudge, hDirection = hDirection, vDirection = vDirection, x = x, y = y)
  
    __obj.asInstanceOf[DraggingEvent]
  }
}

