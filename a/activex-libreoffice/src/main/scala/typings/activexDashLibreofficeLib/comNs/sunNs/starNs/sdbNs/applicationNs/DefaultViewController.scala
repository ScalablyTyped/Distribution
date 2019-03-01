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
    SubComponents: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent],
    Title: java.lang.String,
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
    addTitleChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XTitleChangeListener, 
      scala.Unit
    ],
    attachFrame: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, scala.Unit],
    attachModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, scala.Boolean],
    closeSubComponents: js.Function0[scala.Boolean],
    connect: js.Function0[scala.Unit],
    createComponent: js.Function2[
      scala.Double, 
      js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
    ],
    createComponentWithArguments: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
    ],
    dispose: js.Function0[scala.Unit],
    getFrame: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel],
    getSelection: js.Function0[js.Any],
    getTitle: js.Function0[java.lang.String],
    getTransferable: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable],
    getViewData: js.Function0[js.Any],
    identifySubComponent: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, java.lang.String]
    ],
    insertTransferable: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      scala.Unit
    ],
    isConnected: js.Function0[scala.Boolean],
    loadComponent: js.Function3[
      scala.Double, 
      java.lang.String, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
    ],
    loadComponentWithArguments: js.Function4[
      scala.Double, 
      java.lang.String, 
      scala.Boolean, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
    ],
    queryDispatch: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch
    ],
    queryDispatches: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchDescriptor], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch]
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
    removeTitleChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XTitleChangeListener, 
      scala.Unit
    ],
    restoreViewData: js.Function1[js.Any, scala.Unit],
    select: js.Function1[js.Any, scala.Boolean],
    setTitle: js.Function1[java.lang.String, scala.Unit],
    suspend: js.Function1[scala.Boolean, scala.Boolean]
  ): DefaultViewController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveConnection")(ActiveConnection)
    __obj.updateDynamic("ApplicationMainWindow")(ApplicationMainWindow)
    __obj.updateDynamic("DataSource")(DataSource)
    __obj.updateDynamic("Frame")(Frame)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("Selection")(Selection)
    __obj.updateDynamic("SubComponents")(SubComponents)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("Transferable")(Transferable)
    __obj.updateDynamic("ViewData")(ViewData)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addKeyHandler")(addKeyHandler)
    __obj.updateDynamic("addMouseClickHandler")(addMouseClickHandler)
    __obj.updateDynamic("addSelectionChangeListener")(addSelectionChangeListener)
    __obj.updateDynamic("addTitleChangeListener")(addTitleChangeListener)
    __obj.updateDynamic("attachFrame")(attachFrame)
    __obj.updateDynamic("attachModel")(attachModel)
    __obj.updateDynamic("closeSubComponents")(closeSubComponents)
    __obj.updateDynamic("connect")(connect)
    __obj.updateDynamic("createComponent")(createComponent)
    __obj.updateDynamic("createComponentWithArguments")(createComponentWithArguments)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getFrame")(getFrame)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getTransferable")(getTransferable)
    __obj.updateDynamic("getViewData")(getViewData)
    __obj.updateDynamic("identifySubComponent")(identifySubComponent)
    __obj.updateDynamic("insertTransferable")(insertTransferable)
    __obj.updateDynamic("isConnected")(isConnected)
    __obj.updateDynamic("loadComponent")(loadComponent)
    __obj.updateDynamic("loadComponentWithArguments")(loadComponentWithArguments)
    __obj.updateDynamic("queryDispatch")(queryDispatch)
    __obj.updateDynamic("queryDispatches")(queryDispatches)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerContextMenuInterceptor")(registerContextMenuInterceptor)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseContextMenuInterceptor")(releaseContextMenuInterceptor)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeKeyHandler")(removeKeyHandler)
    __obj.updateDynamic("removeMouseClickHandler")(removeMouseClickHandler)
    __obj.updateDynamic("removeSelectionChangeListener")(removeSelectionChangeListener)
    __obj.updateDynamic("removeTitleChangeListener")(removeTitleChangeListener)
    __obj.updateDynamic("restoreViewData")(restoreViewData)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("suspend")(suspend)
    __obj.asInstanceOf[DefaultViewController]
  }
}

