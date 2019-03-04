package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service connects the Java-like UNO Drag and Drop protocol to the X Drag and Drop protocol used on X-Servers to transfer data between applications
  * via Drag and Drop operations.
  * @see XDragSource
  */
trait X11DragSource
  extends XDragSource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object X11DragSource {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getDefaultCursor: js.Function1[scala.Double, scala.Double],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    isDragImageSupported: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    startDrag: js.Function6[
      DragGestureEvent, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      XDragSourceListener, 
      scala.Unit
    ]
  ): X11DragSource = {
    val __obj = js.Dynamic.literal(acquire = acquire, addEventListener = addEventListener, dispose = dispose, getDefaultCursor = getDefaultCursor, initialize = initialize, isDragImageSupported = isDragImageSupported, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, startDrag = startDrag)
  
    __obj.asInstanceOf[X11DragSource]
  }
}

