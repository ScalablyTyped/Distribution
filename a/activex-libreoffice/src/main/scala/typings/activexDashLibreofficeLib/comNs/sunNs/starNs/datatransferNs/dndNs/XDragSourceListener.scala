package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface must be implemented by any drag gesture recognizer implementation that a drag source supports.
  * @see com.sun.star.datatransfer.dnd.XDragGestureRecognizer
  * @see com.sun.star.datatransfer.dnd.XDragSource
  */
trait XDragSourceListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * This method is invoked to signify that the Drag and Drop operation is complete.
    * @param dsde The {@link DragSourceDropEvent}
    */
  def dragDropEnd(dsde: DragSourceDropEvent): scala.Unit
  /**
    * Called as the hotspot enters a platform dependent drop site.
    *
    * **NOTE:** currently this notification can not be ensured by all implementations. Do not rely on it !
    * @param dsde The {@link DragSourceDragEvent} .
    */
  def dragEnter(dsde: DragSourceDragEvent): scala.Unit
  /**
    * Called as the hotspot exits a platform dependent drop site.
    *
    * **NOTE:** Currently this notification can not be ensured by all implementations. Do not rely on it !
    * @param dse The {@link DragSourceEvent} .
    */
  def dragExit(dse: DragSourceEvent): scala.Unit
  /**
    * Called as the hotspot moves over a platform dependent drop site.
    * @param dsde The {@link DragSourceEvent}
    */
  def dragOver(dsde: DragSourceDragEvent): scala.Unit
  /**
    * Called when the user has modified the drop gesture.
    * @param dsde The {@link DragSourceEvent} .
    */
  def dropActionChanged(dsde: DragSourceDragEvent): scala.Unit
}

object XDragSourceListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    dragDropEnd: js.Function1[DragSourceDropEvent, scala.Unit],
    dragEnter: js.Function1[DragSourceDragEvent, scala.Unit],
    dragExit: js.Function1[DragSourceEvent, scala.Unit],
    dragOver: js.Function1[DragSourceDragEvent, scala.Unit],
    dropActionChanged: js.Function1[DragSourceDragEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDragSourceListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, dragDropEnd = dragDropEnd, dragEnter = dragEnter, dragExit = dragExit, dragOver = dragOver, dropActionChanged = dropActionChanged, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDragSourceListener]
  }
}

