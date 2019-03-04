package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

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
trait XDropTargetDropContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Accept the Drop.
    *
    * This method should be called from the {@link com.sun.star.datatransfer.dnd.XDropTargetListener.drop()} method if the implementation wishes to accept
    * the drop operation with the specified action.
    * @param dragOperation The operation accepted by the target.
    * @see DNDConstants
    * @see DropTargetDragEvent
    */
  def acceptDrop(dragOperation: scala.Double): scala.Unit
  /**
    * Signals that the drop is completed and if it was successful or not.
    * @param success A value of `TRUE` means the drop completed successfully A value of `FALSE` means the drop completed unsuccessfully.
    */
  def dropComplete(success: scala.Boolean): scala.Unit
  /**
    * Reject the drop as a result of examining the available {@link com.sun.star.datatransfer.DataFlavor} types received in the {@link
    * XDropTargetListener.dragEnter()} method.
    */
  def rejectDrop(): scala.Unit
}

object XDropTargetDropContext {
  @scala.inline
  def apply(
    acceptDrop: js.Function1[scala.Double, scala.Unit],
    acquire: js.Function0[scala.Unit],
    dropComplete: js.Function1[scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rejectDrop: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit]
  ): XDropTargetDropContext = {
    val __obj = js.Dynamic.literal(acceptDrop = acceptDrop, acquire = acquire, dropComplete = dropComplete, queryInterface = queryInterface, rejectDrop = rejectDrop, release = release)
  
    __obj.asInstanceOf[XDropTargetDropContext]
  }
}

