package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterception
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XUserInputInterception
     with activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferableSupplier

object Controller {
  @scala.inline
  def apply(
    Frame: XFrame,
    Model: XModel,
    Selection: js.Any,
    Transferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    ViewData: js.Any,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addKeyHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler => scala.Unit,
    addMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler => scala.Unit,
    addSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    attachFrame: XFrame => scala.Unit,
    attachModel: XModel => scala.Boolean,
    dispose: () => scala.Unit,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getSelection: () => js.Any,
    getTransferable: () => activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    getViewData: () => js.Any,
    insertTransferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable => scala.Unit,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor] => stdLib.SafeArray[XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerContextMenuInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor => scala.Unit,
    release: () => scala.Unit,
    releaseContextMenuInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeKeyHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler => scala.Unit,
    removeMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler => scala.Unit,
    removeSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    restoreViewData: js.Any => scala.Unit,
    select: js.Any => scala.Boolean,
    suspend: scala.Boolean => scala.Boolean
  ): Controller = {
    val __obj = js.Dynamic.literal(Frame = Frame, Model = Model, Selection = Selection, Transferable = Transferable, ViewData = ViewData, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getSelection = js.Any.fromFunction0(getSelection), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), insertTransferable = js.Any.fromFunction1(insertTransferable), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[Controller]
  }
}

