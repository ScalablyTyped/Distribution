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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addKeyHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler, scala.Unit],
    addMouseClickHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler, scala.Unit],
    addSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    attachFrame: js.Function1[XFrame, scala.Unit],
    attachModel: js.Function1[XModel, scala.Boolean],
    dispose: js.Function0[scala.Unit],
    getFrame: js.Function0[XFrame],
    getModel: js.Function0[XModel],
    getSelection: js.Function0[js.Any],
    getTransferable: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable],
    getViewData: js.Function0[js.Any],
    insertTransferable: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      scala.Unit
    ],
    queryDispatch: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      java.lang.String, 
      scala.Double, 
      XDispatch
    ],
    queryDispatches: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor], 
      activexDashInteropLib.SafeArray[XDispatch]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerContextMenuInterceptor: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    releaseContextMenuInterceptor: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeKeyHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler, scala.Unit],
    removeMouseClickHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler, scala.Unit],
    removeSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    restoreViewData: js.Function1[js.Any, scala.Unit],
    select: js.Function1[js.Any, scala.Boolean],
    suspend: js.Function1[scala.Boolean, scala.Boolean]
  ): Controller = {
    val __obj = js.Dynamic.literal(Frame = Frame, Model = Model, Selection = Selection, Transferable = Transferable, ViewData = ViewData, acquire = acquire, addEventListener = addEventListener, addKeyHandler = addKeyHandler, addMouseClickHandler = addMouseClickHandler, addSelectionChangeListener = addSelectionChangeListener, attachFrame = attachFrame, attachModel = attachModel, dispose = dispose, getFrame = getFrame, getModel = getModel, getSelection = getSelection, getTransferable = getTransferable, getViewData = getViewData, insertTransferable = insertTransferable, queryDispatch = queryDispatch, queryDispatches = queryDispatches, queryInterface = queryInterface, registerContextMenuInterceptor = registerContextMenuInterceptor, release = release, releaseContextMenuInterceptor = releaseContextMenuInterceptor, removeEventListener = removeEventListener, removeKeyHandler = removeKeyHandler, removeMouseClickHandler = removeMouseClickHandler, removeSelectionChangeListener = removeSelectionChangeListener, restoreViewData = restoreViewData, select = select, suspend = suspend)
  
    __obj.asInstanceOf[Controller]
  }
}

