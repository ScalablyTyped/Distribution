package typings.agGrid.bodyDropTargetMod

import typings.agGrid.dragAndDropServiceMod.DraggingEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropListener extends js.Object {
  
  def getIconName(): String = js.native
  
  def onDragEnter(params: DraggingEvent): Unit = js.native
  
  def onDragLeave(params: DraggingEvent): Unit = js.native
  
  def onDragStop(params: DraggingEvent): Unit = js.native
  
  def onDragging(params: DraggingEvent): Unit = js.native
}
object DropListener {
  
  @scala.inline
  def apply(
    getIconName: () => String,
    onDragEnter: DraggingEvent => Unit,
    onDragLeave: DraggingEvent => Unit,
    onDragStop: DraggingEvent => Unit,
    onDragging: DraggingEvent => Unit
  ): DropListener = {
    val __obj = js.Dynamic.literal(getIconName = js.Any.fromFunction0(getIconName), onDragEnter = js.Any.fromFunction1(onDragEnter), onDragLeave = js.Any.fromFunction1(onDragLeave), onDragStop = js.Any.fromFunction1(onDragStop), onDragging = js.Any.fromFunction1(onDragging))
    __obj.asInstanceOf[DropListener]
  }
  
  @scala.inline
  implicit class DropListenerOps[Self <: DropListener] (val x: Self) extends AnyVal {
    
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
    def setGetIconName(value: () => String): Self = this.set("getIconName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDragEnter(value: DraggingEvent => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragLeave(value: DraggingEvent => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStop(value: DraggingEvent => Unit): Self = this.set("onDragStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragging(value: DraggingEvent => Unit): Self = this.set("onDragging", js.Any.fromFunction1(value))
  }
}
