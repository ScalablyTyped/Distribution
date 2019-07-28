package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XKeyHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseClickHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XUserInputInterception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferableSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.XContextMenuInterception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an abstract service for a component which offers a deeper integration of desktop components than a {@link com.sun.star.awt.XWindow} can offer
  *
  * Such components can be loaded into a {@link Frame} inside a {@link Desktop} environment. A controller is a richer component then a pure window, but
  * full featured components need a {@link XModel} interface too. ;  (see service {@link com.sun.star.document.OfficeDocument} for further information)
  * @see com.sun.star.document.OfficeDocument
  */
trait Controller
  extends XController
     with XDispatchProvider
     with XContextMenuInterception
     with XUserInputInterception
     with XSelectionSupplier
     with XTransferableSupplier

object Controller {
  @scala.inline
  def apply(
    Frame: XFrame,
    Model: XModel,
    Selection: js.Any,
    Transferable: XTransferable,
    ViewData: js.Any,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addKeyHandler: XKeyHandler => Unit,
    addMouseClickHandler: XMouseClickHandler => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    attachFrame: XFrame => Unit,
    attachModel: XModel => Boolean,
    dispose: () => Unit,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getSelection: () => js.Any,
    getTransferable: () => XTransferable,
    getViewData: () => js.Any,
    insertTransferable: XTransferable => Unit,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    registerContextMenuInterceptor: XContextMenuInterceptor => Unit,
    release: () => Unit,
    releaseContextMenuInterceptor: XContextMenuInterceptor => Unit,
    removeEventListener: XEventListener => Unit,
    removeKeyHandler: XKeyHandler => Unit,
    removeMouseClickHandler: XMouseClickHandler => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    restoreViewData: js.Any => Unit,
    select: js.Any => Boolean,
    suspend: Boolean => Boolean
  ): Controller = {
    val __obj = js.Dynamic.literal(Frame = Frame, Model = Model, Selection = Selection, Transferable = Transferable, ViewData = ViewData, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getSelection = js.Any.fromFunction0(getSelection), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), insertTransferable = js.Any.fromFunction1(insertTransferable), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[Controller]
  }
}

