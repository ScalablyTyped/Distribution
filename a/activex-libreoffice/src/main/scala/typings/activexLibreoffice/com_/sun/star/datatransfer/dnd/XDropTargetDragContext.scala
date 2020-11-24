package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is implemented by any drop target context object.
  *
  * A drop target context is created whenever the logical cursor associated with a Drag and Drop operation moves within the visible geometry of a window
  * associated with a drop target.
  *
  * The drop target context provides the mechanism for a potential receiver of a drop operation to both provide the end user with the appropriate drag
  * under feedback and effect the subsequent data transfer, if appropriate.
  */
@js.native
trait XDropTargetDragContext extends XInterface {
  
  /**
    * Accept the Drag.
    *
    * This method should be called from the methods of {@link XDropTargetListener}{@link XDropTargetListener.dragEnter()}{@link
    * XDropTargetListener.dragOver()}XDropTargetListener::dragActionChanged() if the implementation wishes to accept the drag operation with the specified
    * action.
    * @param dragOperation The operation accepted by the target.
    * @see DNDConstants
    * @see DropTargetDragEvent
    */
  def acceptDrag(dragOperation: Double): Unit = js.native
  
  /**
    * Reject the drag as a result of examining the available {@link com.sun.star.datatransfer.DataFlavor} types received in the {@link
    * com.sun.star.datatransfer.dnd.XDropTargetListener.dragEnter()} method.
    */
  def rejectDrag(): Unit = js.native
}
object XDropTargetDragContext {
  
  @scala.inline
  def apply(
    acceptDrag: Double => Unit,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    rejectDrag: () => Unit,
    release: () => Unit
  ): XDropTargetDragContext = {
    val __obj = js.Dynamic.literal(acceptDrag = js.Any.fromFunction1(acceptDrag), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), rejectDrag = js.Any.fromFunction0(rejectDrag), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDropTargetDragContext]
  }
  
  @scala.inline
  implicit class XDropTargetDragContextOps[Self <: XDropTargetDragContext] (val x: Self) extends AnyVal {
    
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
    def setAcceptDrag(value: Double => Unit): Self = this.set("acceptDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRejectDrag(value: () => Unit): Self = this.set("rejectDrag", js.Any.fromFunction0(value))
  }
}
