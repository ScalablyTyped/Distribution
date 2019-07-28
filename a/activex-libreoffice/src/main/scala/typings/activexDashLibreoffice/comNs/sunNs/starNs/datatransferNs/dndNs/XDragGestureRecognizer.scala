package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by a view or window that supports drag operations.
  *
  * Different to Java, the association between view and interface is fixed and cannot be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a performance issue.
  */
trait XDragGestureRecognizer extends XInterface {
  /**
    * Registers a new {@link XDragGestureListener} .
    * @param dgl The {@link XDragGestureListener} to register with this {@link XDragGestureRecognizer} .
    */
  def addDragGestureListener(dgl: XDragGestureListener): Unit
  /**
    * Unregisters the specified {@link XDragGestureListener} .
    * @param dgl The {@link XDragGestureListener} to register with this {@link XDragGestureRecognizer} .
    */
  def removeDragGestureListener(dgl: XDragGestureListener): Unit
  /** Reset the recognizer. If it is currently recognizing a gesture, ignore it. */
  def resetRecognizer(): Unit
}

object XDragGestureRecognizer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addDragGestureListener: XDragGestureListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDragGestureListener: XDragGestureListener => Unit,
    resetRecognizer: () => Unit
  ): XDragGestureRecognizer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addDragGestureListener = js.Any.fromFunction1(addDragGestureListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDragGestureListener = js.Any.fromFunction1(removeDragGestureListener), resetRecognizer = js.Any.fromFunction0(resetRecognizer))
  
    __obj.asInstanceOf[XDragGestureRecognizer]
  }
}

