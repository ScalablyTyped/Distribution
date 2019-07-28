package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.applicationNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XKeyHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseClickHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Pair
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.Controller
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.DispatchDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XDispatch
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XFrame
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XTitle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XTitleChangeBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XTitleChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XDataSource
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the default controller implementation for OpenOffice.org's database application. */
trait DefaultViewController
  extends Controller
     with XTitle
     with XTitleChangeBroadcaster
     with XDatabaseDocumentUI

object DefaultViewController {
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    ApplicationMainWindow: XWindow,
    DataSource: XDataSource,
    Frame: XFrame,
    Model: XModel,
    Selection: js.Any,
    SubComponents: SafeArray[XComponent],
    Title: String,
    Transferable: XTransferable,
    ViewData: js.Any,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addKeyHandler: XKeyHandler => Unit,
    addMouseClickHandler: XMouseClickHandler => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    addTitleChangeListener: XTitleChangeListener => Unit,
    attachFrame: XFrame => Unit,
    attachModel: XModel => Boolean,
    closeSubComponents: () => Boolean,
    connect: () => Unit,
    createComponent: (Double, js.Array[XComponent]) => XComponent,
    createComponentWithArguments: (Double, SeqEquiv[PropertyValue], js.Array[XComponent]) => XComponent,
    dispose: () => Unit,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getSelection: () => js.Any,
    getTitle: () => String,
    getTransferable: () => XTransferable,
    getViewData: () => js.Any,
    identifySubComponent: XComponent => Pair[Double, String],
    insertTransferable: XTransferable => Unit,
    isConnected: () => Boolean,
    loadComponent: (Double, String, Boolean) => XComponent,
    loadComponentWithArguments: (Double, String, Boolean, SeqEquiv[PropertyValue]) => XComponent,
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
    removeTitleChangeListener: XTitleChangeListener => Unit,
    restoreViewData: js.Any => Unit,
    select: js.Any => Boolean,
    setTitle: String => Unit,
    suspend: Boolean => Boolean
  ): DefaultViewController = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, ApplicationMainWindow = ApplicationMainWindow, DataSource = DataSource, Frame = Frame, Model = Model, Selection = Selection, SubComponents = SubComponents, Title = Title, Transferable = Transferable, ViewData = ViewData, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addTitleChangeListener = js.Any.fromFunction1(addTitleChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), closeSubComponents = js.Any.fromFunction0(closeSubComponents), connect = js.Any.fromFunction0(connect), createComponent = js.Any.fromFunction2(createComponent), createComponentWithArguments = js.Any.fromFunction3(createComponentWithArguments), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getSelection = js.Any.fromFunction0(getSelection), getTitle = js.Any.fromFunction0(getTitle), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), identifySubComponent = js.Any.fromFunction1(identifySubComponent), insertTransferable = js.Any.fromFunction1(insertTransferable), isConnected = js.Any.fromFunction0(isConnected), loadComponent = js.Any.fromFunction3(loadComponent), loadComponentWithArguments = js.Any.fromFunction4(loadComponentWithArguments), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeTitleChangeListener = js.Any.fromFunction1(removeTitleChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setTitle = js.Any.fromFunction1(setTitle), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[DefaultViewController]
  }
}

