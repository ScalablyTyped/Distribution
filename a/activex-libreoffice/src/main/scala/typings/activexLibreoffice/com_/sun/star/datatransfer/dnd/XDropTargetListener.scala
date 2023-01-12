package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is the callback interface used by the drop target object to provide notification of Drag and Drop operations that involve the subject
  * drop target.
  *
  * Methods of this interface may be implemented to provide "drag under" visual feedback to the user throughout the Drag and Drop operation.
  */
trait XDropTargetListener
  extends StObject
     with XEventListener {
  
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
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    dragEnter: DropTargetDragEnterEvent => Unit,
    dragExit: DropTargetEvent => Unit,
    dragOver: DropTargetDragEvent => Unit,
    drop: DropTargetDropEvent => Unit,
    dropActionChanged: DropTargetDragEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDropTargetListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), dragEnter = js.Any.fromFunction1(dragEnter), dragExit = js.Any.fromFunction1(dragExit), dragOver = js.Any.fromFunction1(dragOver), drop = js.Any.fromFunction1(drop), dropActionChanged = js.Any.fromFunction1(dropActionChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDropTargetListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDropTargetListener] (val x: Self) extends AnyVal {
    
    inline def setDragEnter(value: DropTargetDragEnterEvent => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction1(value))
    
    inline def setDragExit(value: DropTargetEvent => Unit): Self = StObject.set(x, "dragExit", js.Any.fromFunction1(value))
    
    inline def setDragOver(value: DropTargetDragEvent => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
    
    inline def setDrop(value: DropTargetDropEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    inline def setDropActionChanged(value: DropTargetDragEvent => Unit): Self = StObject.set(x, "dropActionChanged", js.Any.fromFunction1(value))
  }
}
