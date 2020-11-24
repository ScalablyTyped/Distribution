package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface must be implemented by any drag gesture recognizer implementation that a drag source supports.
  * @see com.sun.star.datatransfer.dnd.XDragGestureRecognizer
  * @see com.sun.star.datatransfer.dnd.XDragSource
  */
@js.native
trait XDragSourceListener extends XEventListener {
  
  /**
    * This method is invoked to signify that the Drag and Drop operation is complete.
    * @param dsde The {@link DragSourceDropEvent}
    */
  def dragDropEnd(dsde: DragSourceDropEvent): Unit = js.native
  
  /**
    * Called as the hotspot enters a platform dependent drop site.
    *
    * **NOTE:** currently this notification can not be ensured by all implementations. Do not rely on it !
    * @param dsde The {@link DragSourceDragEvent} .
    */
  def dragEnter(dsde: DragSourceDragEvent): Unit = js.native
  
  /**
    * Called as the hotspot exits a platform dependent drop site.
    *
    * **NOTE:** Currently this notification can not be ensured by all implementations. Do not rely on it !
    * @param dse The {@link DragSourceEvent} .
    */
  def dragExit(dse: DragSourceEvent): Unit = js.native
  
  /**
    * Called as the hotspot moves over a platform dependent drop site.
    * @param dsde The {@link DragSourceEvent}
    */
  def dragOver(dsde: DragSourceDragEvent): Unit = js.native
  
  /**
    * Called when the user has modified the drop gesture.
    * @param dsde The {@link DragSourceEvent} .
    */
  def dropActionChanged(dsde: DragSourceDragEvent): Unit = js.native
}
object XDragSourceListener {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class XDragSourceListenerOps[Self <: XDragSourceListener] (val x: Self) extends AnyVal {
    
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
    def setDragDropEnd(value: DragSourceDropEvent => Unit): Self = this.set("dragDropEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEnter(value: DragSourceDragEvent => Unit): Self = this.set("dragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragExit(value: DragSourceEvent => Unit): Self = this.set("dragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragOver(value: DragSourceDragEvent => Unit): Self = this.set("dragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropActionChanged(value: DragSourceDragEvent => Unit): Self = this.set("dropActionChanged", js.Any.fromFunction1(value))
  }
}
