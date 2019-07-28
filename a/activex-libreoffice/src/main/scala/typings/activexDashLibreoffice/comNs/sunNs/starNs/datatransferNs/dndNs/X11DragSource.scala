package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
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
     with XInitialization
     with XComponent

object X11DragSource {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getDefaultCursor: Double => Double,
    initialize: SeqEquiv[_] => Unit,
    isDragImageSupported: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    startDrag: (DragGestureEvent, Double, Double, Double, XTransferable, XDragSourceListener) => Unit
  ): X11DragSource = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getDefaultCursor = js.Any.fromFunction1(getDefaultCursor), initialize = js.Any.fromFunction1(initialize), isDragImageSupported = js.Any.fromFunction0(isDragImageSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), startDrag = js.Any.fromFunction6(startDrag))
  
    __obj.asInstanceOf[X11DragSource]
  }
}

