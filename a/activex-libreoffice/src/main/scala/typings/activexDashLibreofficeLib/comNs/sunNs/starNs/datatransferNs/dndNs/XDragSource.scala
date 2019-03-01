package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by a view or window that supports drag operations and will be received as part of a {@link DragGestureEvent} through a
  * {@link com.sun.star.datatransfer.dnd.XDragGestureListener.dragGestureRecognized()} callback.
  *
  * Differently to Java, the association between view and interface is fixed and can not be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a real performance issue.
  */
trait XDragSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * To get the default cursor for a specified drag action.
    * @param dragAction A drag action as specified in {@link DNDConstants} .
    * @returns The default drag cursor for the specified drag action. The returned value may be used as parameter for the method {@link com.sun.star.datatransfe
    */
  def getDefaultCursor(dragAction: scala.Double): scala.Double
  /**
    * In order to query if drag image support is available.
    * @returns A boolean indicating whether or not drag image support is available on the underlying platform.
    */
  def isDragImageSupported(): scala.Boolean
  /**
    * Starts the drag operation.
    *
    * Note: this call does **not** block until the drag and drop operation ends. If the Drag and Drop system is unable to initiate a drag operation or if
    * the user attempts to start a drag while an existing drag operation is still executing, the action fails immediately. This is indicated by calling
    * {@link com.sun.star.datatransfer.dnd.XDragSourceListener.dragDropEnd()} on the parameter listener with a {@link DragSourceDragEvent} showing a
    * failure.
    * @param trigger The {@link DragGestureEvent} that initiated the drag.
    * @param sourceActions The action or actions supported for this transferable as defined in {@link DNDConstants} .
    * @param cursor The initial drag cursor id or 0 as default.
    * @param image The initial drag image id or 0 as default.
    * @param trans The transferable object dragged.
    * @param listener The {@link XDragSourceListener} .
    * @see com.sun.star.datatransfer.XTransferable
    */
  def startDrag(
    trigger: DragGestureEvent,
    sourceActions: scala.Double,
    cursor: scala.Double,
    image: scala.Double,
    trans: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    listener: XDragSourceListener
  ): scala.Unit
}

object XDragSource {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDefaultCursor: js.Function1[scala.Double, scala.Double],
    isDragImageSupported: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    startDrag: js.Function6[
      DragGestureEvent, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      XDragSourceListener, 
      scala.Unit
    ]
  ): XDragSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDefaultCursor")(getDefaultCursor)
    __obj.updateDynamic("isDragImageSupported")(isDragImageSupported)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("startDrag")(startDrag)
    __obj.asInstanceOf[XDragSource]
  }
}

