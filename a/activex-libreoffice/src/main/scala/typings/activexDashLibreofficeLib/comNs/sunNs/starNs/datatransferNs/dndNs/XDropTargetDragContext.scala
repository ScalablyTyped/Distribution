package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by any drop target context object.
  *
  * A drop target context is created whenever the logical cursor associated with a Drag and Drop operation moves within the visible geometry of a window
  * associated with a drop target.
  *
  * The drop target context provides the mechanism for a potential receiver of a drop operation to both provide the end user with the appropriate drag
  * under feedback and effect the subsequent data transfer, if appropriate.
  */
trait XDropTargetDragContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def acceptDrag(dragOperation: scala.Double): scala.Unit
  /**
    * Reject the drag as a result of examining the available {@link com.sun.star.datatransfer.DataFlavor} types received in the {@link
    * com.sun.star.datatransfer.dnd.XDropTargetListener.dragEnter()} method.
    */
  def rejectDrag(): scala.Unit
}

object XDropTargetDragContext {
  @scala.inline
  def apply(
    acceptDrag: js.Function1[scala.Double, scala.Unit],
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rejectDrag: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit]
  ): XDropTargetDragContext = {
    val __obj = js.Dynamic.literal(acceptDrag = acceptDrag, acquire = acquire, queryInterface = queryInterface, rejectDrag = rejectDrag, release = release)
  
    __obj.asInstanceOf[XDropTargetDragContext]
  }
}

