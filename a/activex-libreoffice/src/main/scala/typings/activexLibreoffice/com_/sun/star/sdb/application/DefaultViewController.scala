package typings.activexLibreoffice.com_.sun.star.sdb.application

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XKeyHandler
import typings.activexLibreoffice.com_.sun.star.awt.XMouseClickHandler
import typings.activexLibreoffice.com_.sun.star.awt.XUserInputInterception
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.beans.Pair
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferableSupplier
import typings.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.frame.XDispatch
import typings.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.frame.XTitle
import typings.activexLibreoffice.com_.sun.star.frame.XTitleChangeBroadcaster
import typings.activexLibreoffice.com_.sun.star.frame.XTitleChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import typings.activexLibreoffice.com_.sun.star.ui.XContextMenuInterception
import typings.activexLibreoffice.com_.sun.star.ui.XContextMenuInterceptor
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the default controller implementation for OpenOffice.org's database application. */
trait DefaultViewController
  extends XController
     with XDispatchProvider
     with XContextMenuInterception
     with XUserInputInterception
     with XSelectionSupplier
     with XTransferableSupplier
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
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], ApplicationMainWindow = ApplicationMainWindow.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SubComponents = SubComponents.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Transferable = Transferable.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addTitleChangeListener = js.Any.fromFunction1(addTitleChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), closeSubComponents = js.Any.fromFunction0(closeSubComponents), connect = js.Any.fromFunction0(connect), createComponent = js.Any.fromFunction2(createComponent), createComponentWithArguments = js.Any.fromFunction3(createComponentWithArguments), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getSelection = js.Any.fromFunction0(getSelection), getTitle = js.Any.fromFunction0(getTitle), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), identifySubComponent = js.Any.fromFunction1(identifySubComponent), insertTransferable = js.Any.fromFunction1(insertTransferable), isConnected = js.Any.fromFunction0(isConnected), loadComponent = js.Any.fromFunction3(loadComponent), loadComponentWithArguments = js.Any.fromFunction4(loadComponentWithArguments), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeTitleChangeListener = js.Any.fromFunction1(removeTitleChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setTitle = js.Any.fromFunction1(setTitle), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[DefaultViewController]
  }
}

