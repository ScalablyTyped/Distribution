package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by a view or window that supports drag operations.
  *
  * Different to Java, the association between view and interface is fixed and cannot be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a performance issue.
  */
trait XDragGestureRecognizer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Registers a new {@link XDragGestureListener} .
    * @param dgl The {@link XDragGestureListener} to register with this {@link XDragGestureRecognizer} .
    */
  def addDragGestureListener(dgl: XDragGestureListener): scala.Unit
  /**
    * Unregisters the specified {@link XDragGestureListener} .
    * @param dgl The {@link XDragGestureListener} to register with this {@link XDragGestureRecognizer} .
    */
  def removeDragGestureListener(dgl: XDragGestureListener): scala.Unit
  /** Reset the recognizer. If it is currently recognizing a gesture, ignore it. */
  def resetRecognizer(): scala.Unit
}

object XDragGestureRecognizer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addDragGestureListener: js.Function1[XDragGestureListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDragGestureListener: js.Function1[XDragGestureListener, scala.Unit],
    resetRecognizer: js.Function0[scala.Unit]
  ): XDragGestureRecognizer = {
    val __obj = js.Dynamic.literal(acquire = acquire, addDragGestureListener = addDragGestureListener, queryInterface = queryInterface, release = release, removeDragGestureListener = removeDragGestureListener, resetRecognizer = resetRecognizer)
  
    __obj.asInstanceOf[XDragGestureRecognizer]
  }
}

