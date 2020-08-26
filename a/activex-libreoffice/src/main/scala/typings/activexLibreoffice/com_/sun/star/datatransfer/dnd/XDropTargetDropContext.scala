package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by any drop target context object.
  *
  * A DropTargetContext is created whenever the logical cursor associated with a Drag and Drop operation moves within the visible geometry of a window
  * associated with a DropTarget.
  *
  * The drop target context provides the mechanism for a potential receiver of a drop operation to provide the end user with the appropriate drag under
  * feedback and to effect the subsequent data transfer, if appropriate.
  */
@js.native
trait XDropTargetDropContext extends XInterface {
  /**
    * Accept the Drop.
    *
    * This method should be called from the {@link com.sun.star.datatransfer.dnd.XDropTargetListener.drop()} method if the implementation wishes to accept
    * the drop operation with the specified action.
    * @param dragOperation The operation accepted by the target.
    * @see DNDConstants
    * @see DropTargetDragEvent
    */
  def acceptDrop(dragOperation: Double): Unit = js.native
  /**
    * Signals that the drop is completed and if it was successful or not.
    * @param success A value of `TRUE` means the drop completed successfully A value of `FALSE` means the drop completed unsuccessfully.
    */
  def dropComplete(success: Boolean): Unit = js.native
  /**
    * Reject the drop as a result of examining the available {@link com.sun.star.datatransfer.DataFlavor} types received in the {@link
    * XDropTargetListener.dragEnter()} method.
    */
  def rejectDrop(): Unit = js.native
}

object XDropTargetDropContext {
  @scala.inline
  def apply(
    acceptDrop: Double => Unit,
    acquire: () => Unit,
    dropComplete: Boolean => Unit,
    queryInterface: `type` => js.Any,
    rejectDrop: () => Unit,
    release: () => Unit
  ): XDropTargetDropContext = {
    val __obj = js.Dynamic.literal(acceptDrop = js.Any.fromFunction1(acceptDrop), acquire = js.Any.fromFunction0(acquire), dropComplete = js.Any.fromFunction1(dropComplete), queryInterface = js.Any.fromFunction1(queryInterface), rejectDrop = js.Any.fromFunction0(rejectDrop), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDropTargetDropContext]
  }
  @scala.inline
  implicit class XDropTargetDropContextOps[Self <: XDropTargetDropContext] (val x: Self) extends AnyVal {
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
    def setAcceptDrop(value: Double => Unit): Self = this.set("acceptDrop", js.Any.fromFunction1(value))
    @scala.inline
    def setDropComplete(value: Boolean => Unit): Self = this.set("dropComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setRejectDrop(value: () => Unit): Self = this.set("rejectDrop", js.Any.fromFunction0(value))
  }
  
}

