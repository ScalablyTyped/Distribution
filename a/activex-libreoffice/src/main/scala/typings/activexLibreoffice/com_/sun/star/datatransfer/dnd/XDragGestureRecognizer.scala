package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is implemented by a view or window that supports drag operations.
  *
  * Different to Java, the association between view and interface is fixed and cannot be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a performance issue.
  */
@js.native
trait XDragGestureRecognizer extends XInterface {
  
  /**
    * Registers a new {@link XDragGestureListener} .
    * @param dgl The {@link XDragGestureListener} to register with this {@link XDragGestureRecognizer} .
    */
  def addDragGestureListener(dgl: XDragGestureListener): Unit = js.native
  
  /**
    * Unregisters the specified {@link XDragGestureListener} .
    * @param dgl The {@link XDragGestureListener} to register with this {@link XDragGestureRecognizer} .
    */
  def removeDragGestureListener(dgl: XDragGestureListener): Unit = js.native
  
  /** Reset the recognizer. If it is currently recognizing a gesture, ignore it. */
  def resetRecognizer(): Unit = js.native
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
  
  @scala.inline
  implicit class XDragGestureRecognizerMutableBuilder[Self <: XDragGestureRecognizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDragGestureListener(value: XDragGestureListener => Unit): Self = StObject.set(x, "addDragGestureListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDragGestureListener(value: XDragGestureListener => Unit): Self = StObject.set(x, "removeDragGestureListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetRecognizer(value: () => Unit): Self = StObject.set(x, "resetRecognizer", js.Any.fromFunction0(value))
  }
}
