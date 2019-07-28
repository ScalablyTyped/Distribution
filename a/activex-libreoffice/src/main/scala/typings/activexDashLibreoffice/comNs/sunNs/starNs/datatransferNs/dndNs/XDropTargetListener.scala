package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is the callback interface used by the drop target object to provide notification of Drag and Drop operations that involve the subject
  * drop target.
  *
  * Methods of this interface may be implemented to provide "drag under" visual feedback to the user throughout the Drag and Drop operation.
  */
trait XDropTargetListener extends XEventListener {
  /**
    * Called when a drag operation has encountered the drop target.
    * @param dtdee The {@link DropTargetDragEvent} .
    */
  def dragEnter(dtdee: DropTargetDragEnterEvent): Unit
  /**
    * The drag operation has departed the drop target without dropping.
    * @param dte The {@link DropTargetEvent} .
    */
  def dragExit(dte: DropTargetEvent): Unit
  /**
    * Called when a drag operation is ongoing on the drop target.
    * @param dtde The {@link DropTargetEvent} .
    */
  def dragOver(dtde: DropTargetDragEvent): Unit
  /**
    * The drag operation has terminated with a drop on this drop target.
    *
    * **NOTE:** The implementation has to wait until the method {@link XDropTargetDropContext.dropComplete()} is called before releasing the data for the
    * drop operation. This should occur before returning from drop in a normal flow of operation. Also, the implementor of {@link XDropTargetListener}
    * should not assume the {@link DropTargetDropEvent} to be meaningful after returning from the {@link XDropTargetListener.drop()} method.
    * @param dtde The {@link DropTargetDropEvent} .
    */
  def drop(dtde: DropTargetDropEvent): Unit
  /**
    * Called when the user has modified the drop gesture.
    * @param dtde The {@link DropTargetEvent} .
    */
  def dropActionChanged(dtde: DropTargetDragEvent): Unit
}

object XDropTargetListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    dragEnter: DropTargetDragEnterEvent => Unit,
    dragExit: DropTargetEvent => Unit,
    dragOver: DropTargetDragEvent => Unit,
    drop: DropTargetDropEvent => Unit,
    dropActionChanged: DropTargetDragEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDropTargetListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), dragEnter = js.Any.fromFunction1(dragEnter), dragExit = js.Any.fromFunction1(dragExit), dragOver = js.Any.fromFunction1(dragOver), drop = js.Any.fromFunction1(drop), dropActionChanged = js.Any.fromFunction1(dropActionChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDropTargetListener]
  }
}

