package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface must be implemented by any drag gesture recognizer implementation that a drag source supports.
  * @see com.sun.star.datatransfer.dnd.XDragGestureRecognizer
  * @see com.sun.star.datatransfer.dnd.XDragSource
  */
trait XDragSourceListener
  extends StObject
     with XEventListener {
  
  /**
    * This method is invoked to signify that the Drag and Drop operation is complete.
    * @param dsde The {@link DragSourceDropEvent}
    */
  def dragDropEnd(dsde: DragSourceDropEvent): Unit
  
  /**
    * Called as the hotspot enters a platform dependent drop site.
    *
    * **NOTE:** currently this notification can not be ensured by all implementations. Do not rely on it !
    * @param dsde The {@link DragSourceDragEvent} .
    */
  def dragEnter(dsde: DragSourceDragEvent): Unit
  
  /**
    * Called as the hotspot exits a platform dependent drop site.
    *
    * **NOTE:** Currently this notification can not be ensured by all implementations. Do not rely on it !
    * @param dse The {@link DragSourceEvent} .
    */
  def dragExit(dse: DragSourceEvent): Unit
  
  /**
    * Called as the hotspot moves over a platform dependent drop site.
    * @param dsde The {@link DragSourceEvent}
    */
  def dragOver(dsde: DragSourceDragEvent): Unit
  
  /**
    * Called when the user has modified the drop gesture.
    * @param dsde The {@link DragSourceEvent} .
    */
  def dropActionChanged(dsde: DragSourceDragEvent): Unit
}
object XDragSourceListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    dragDropEnd: DragSourceDropEvent => Unit,
    dragEnter: DragSourceDragEvent => Unit,
    dragExit: DragSourceEvent => Unit,
    dragOver: DragSourceDragEvent => Unit,
    dropActionChanged: DragSourceDragEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDragSourceListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), dragDropEnd = js.Any.fromFunction1(dragDropEnd), dragEnter = js.Any.fromFunction1(dragEnter), dragExit = js.Any.fromFunction1(dragExit), dragOver = js.Any.fromFunction1(dragOver), dropActionChanged = js.Any.fromFunction1(dropActionChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDragSourceListener]
  }
  
  extension [Self <: XDragSourceListener](x: Self) {
    
    inline def setDragDropEnd(value: DragSourceDropEvent => Unit): Self = StObject.set(x, "dragDropEnd", js.Any.fromFunction1(value))
    
    inline def setDragEnter(value: DragSourceDragEvent => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction1(value))
    
    inline def setDragExit(value: DragSourceEvent => Unit): Self = StObject.set(x, "dragExit", js.Any.fromFunction1(value))
    
    inline def setDragOver(value: DragSourceDragEvent => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
    
    inline def setDropActionChanged(value: DragSourceDragEvent => Unit): Self = StObject.set(x, "dropActionChanged", js.Any.fromFunction1(value))
  }
}
