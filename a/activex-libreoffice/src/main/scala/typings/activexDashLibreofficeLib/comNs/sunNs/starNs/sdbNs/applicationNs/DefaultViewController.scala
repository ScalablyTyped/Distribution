package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the default controller implementation for OpenOffice.org's database application. */
trait DefaultViewController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Controller
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XTitle
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XTitleChangeBroadcaster
     with XDatabaseDocumentUI

object DefaultViewController {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    ApplicationMainWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    DataSource: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDataSource,
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    Selection: js.Any,
    SubComponents: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent],
    Title: java.lang.String,
    Transferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    ViewData: js.Any,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addKeyHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler => scala.Unit,
    addMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler => scala.Unit,
    addSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    addTitleChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XTitleChangeListener => scala.Unit,
    attachFrame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame => scala.Unit,
    attachModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel => scala.Boolean,
    closeSubComponents: () => scala.Boolean,
    connect: () => scala.Unit,
    createComponent: (scala.Double, js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent]) => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    createComponentWithArguments: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent]) => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    dispose: () => scala.Unit,
    getFrame: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    getSelection: () => js.Any,
    getTitle: () => java.lang.String,
    getTransferable: () => activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    getViewData: () => js.Any,
    identifySubComponent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, java.lang.String],
    insertTransferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable => scala.Unit,
    isConnected: () => scala.Boolean,
    loadComponent: (scala.Double, java.lang.String, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    loadComponentWithArguments: (scala.Double, java.lang.String, scala.Boolean, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchDescriptor] => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerContextMenuInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor => scala.Unit,
    release: () => scala.Unit,
    releaseContextMenuInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeKeyHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler => scala.Unit,
    removeMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler => scala.Unit,
    removeSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    removeTitleChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XTitleChangeListener => scala.Unit,
    restoreViewData: js.Any => scala.Unit,
    select: js.Any => scala.Boolean,
    setTitle: java.lang.String => scala.Unit,
    suspend: scala.Boolean => scala.Boolean
  ): DefaultViewController = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, ApplicationMainWindow = ApplicationMainWindow, DataSource = DataSource, Frame = Frame, Model = Model, Selection = Selection, SubComponents = SubComponents, Title = Title, Transferable = Transferable, ViewData = ViewData, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addTitleChangeListener = js.Any.fromFunction1(addTitleChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), closeSubComponents = js.Any.fromFunction0(closeSubComponents), connect = js.Any.fromFunction0(connect), createComponent = js.Any.fromFunction2(createComponent), createComponentWithArguments = js.Any.fromFunction3(createComponentWithArguments), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getSelection = js.Any.fromFunction0(getSelection), getTitle = js.Any.fromFunction0(getTitle), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), identifySubComponent = js.Any.fromFunction1(identifySubComponent), insertTransferable = js.Any.fromFunction1(insertTransferable), isConnected = js.Any.fromFunction0(isConnected), loadComponent = js.Any.fromFunction3(loadComponent), loadComponentWithArguments = js.Any.fromFunction4(loadComponentWithArguments), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeTitleChangeListener = js.Any.fromFunction1(removeTitleChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setTitle = js.Any.fromFunction1(setTitle), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[DefaultViewController]
  }
}

