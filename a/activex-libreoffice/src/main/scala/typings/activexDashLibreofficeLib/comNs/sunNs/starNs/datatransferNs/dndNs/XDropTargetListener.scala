package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is the callback interface used by the drop target object to provide notification of Drag and Drop operations that involve the subject
  * drop target.
  *
  * Methods of this interface may be implemented to provide "drag under" visual feedback to the user throughout the Drag and Drop operation.
  */
trait XDropTargetListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * Called when a drag operation has encountered the drop target.
    * @param dtdee The {@link DropTargetDragEvent} .
    */
  def dragEnter(dtdee: DropTargetDragEnterEvent): scala.Unit
  /**
    * The drag operation has departed the drop target without dropping.
    * @param dte The {@link DropTargetEvent} .
    */
  def dragExit(dte: DropTargetEvent): scala.Unit
  /**
    * Called when a drag operation is ongoing on the drop target.
    * @param dtde The {@link DropTargetEvent} .
    */
  def dragOver(dtde: DropTargetDragEvent): scala.Unit
  /**
    * The drag operation has terminated with a drop on this drop target.
    *
    * **NOTE:** The implementation has to wait until the method {@link XDropTargetDropContext.dropComplete()} is called before releasing the data for the
    * drop operation. This should occur before returning from drop in a normal flow of operation. Also, the implementor of {@link XDropTargetListener}
    * should not assume the {@link DropTargetDropEvent} to be meaningful after returning from the {@link XDropTargetListener.drop()} method.
    * @param dtde The {@link DropTargetDropEvent} .
    */
  def drop(dtde: DropTargetDropEvent): scala.Unit
  /**
    * Called when the user has modified the drop gesture.
    * @param dtde The {@link DropTargetEvent} .
    */
  def dropActionChanged(dtde: DropTargetDragEvent): scala.Unit
}

object XDropTargetListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    dragEnter: DropTargetDragEnterEvent => scala.Unit,
    dragExit: DropTargetEvent => scala.Unit,
    dragOver: DropTargetDragEvent => scala.Unit,
    drop: DropTargetDropEvent => scala.Unit,
    dropActionChanged: DropTargetDragEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDropTargetListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), dragEnter = js.Any.fromFunction1(dragEnter), dragExit = js.Any.fromFunction1(dragExit), dragOver = js.Any.fromFunction1(dragOver), drop = js.Any.fromFunction1(drop), dropActionChanged = js.Any.fromFunction1(dropActionChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDropTargetListener]
  }
}

