package typings
package agDashGridLib.distLibHeaderRenderingBodyDropTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropListener extends js.Object {
  def getIconName(): java.lang.String
  def onDragEnter(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit
  def onDragLeave(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit
  def onDragStop(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit
  def onDragging(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit
}

object DropListener {
  @scala.inline
  def apply(
    getIconName: () => java.lang.String,
    onDragEnter: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent => scala.Unit,
    onDragLeave: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent => scala.Unit,
    onDragStop: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent => scala.Unit,
    onDragging: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent => scala.Unit
  ): DropListener = {
    val __obj = js.Dynamic.literal(getIconName = js.Any.fromFunction0(getIconName), onDragEnter = js.Any.fromFunction1(onDragEnter), onDragLeave = js.Any.fromFunction1(onDragLeave), onDragStop = js.Any.fromFunction1(onDragStop), onDragging = js.Any.fromFunction1(onDragging))
  
    __obj.asInstanceOf[DropListener]
  }
}

