package typings.agGrid.dragAndDropServiceMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggingEvent extends js.Object {
  
  var dragItem: DragItem = js.native
  
  var dragSource: DragSource = js.native
  
  var event: MouseEvent = js.native
  
  var fromNudge: Boolean = js.native
  
  var hDirection: HDirection = js.native
  
  var vDirection: VDirection = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
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
  
  @scala.inline
  implicit class DraggingEventOps[Self <: DraggingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDragItem(value: DragItem): Self = this.set("dragItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragSource(value: DragSource): Self = this.set("dragSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromNudge(value: Boolean): Self = this.set("fromNudge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHDirection(value: HDirection): Self = this.set("hDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVDirection(value: VDirection): Self = this.set("vDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
