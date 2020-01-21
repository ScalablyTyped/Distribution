package typings.agGrid.bodyDropTargetMod

import typings.agGrid.dragAndDropServiceMod.DraggingEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropListener extends js.Object {
  def getIconName(): String
  def onDragEnter(params: DraggingEvent): Unit
  def onDragLeave(params: DraggingEvent): Unit
  def onDragStop(params: DraggingEvent): Unit
  def onDragging(params: DraggingEvent): Unit
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
}

