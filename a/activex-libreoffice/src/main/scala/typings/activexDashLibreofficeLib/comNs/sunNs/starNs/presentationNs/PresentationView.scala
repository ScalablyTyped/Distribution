package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This component integrates a view to a slide show of a presentation document into the desktop. */
trait PresentationView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Controller
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawView
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** This is the area that is currently visible. */
  var VisibleArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
}

object PresentationView {
  @scala.inline
  def apply(
    CurrentPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Selection: js.Any,
    Transferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    ViewData: js.Any,
    VisibleArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    addKeyHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler, scala.Unit],
    addKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    addMouseClickHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler, scala.Unit],
    addMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    addPaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    addWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    attachFrame: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, scala.Unit],
    attachModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, scala.Boolean],
    dispose: js.Function0[scala.Unit],
    getCurrentPage: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage],
    getFrame: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel],
    getPosSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
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
    removeFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    removeKeyHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler, scala.Unit],
    removeKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    removeMouseClickHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler, scala.Unit],
    removeMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    removePaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    removeWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    restoreViewData: js.Function1[js.Any, scala.Unit],
    select: js.Function1[js.Any, scala.Boolean],
    setCurrentPage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    suspend: js.Function1[scala.Boolean, scala.Boolean]
  ): PresentationView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentPage")(CurrentPage)
    __obj.updateDynamic("Frame")(Frame)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("PosSize")(PosSize)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Selection")(Selection)
    __obj.updateDynamic("Transferable")(Transferable)
    __obj.updateDynamic("ViewData")(ViewData)
    __obj.updateDynamic("VisibleArea")(VisibleArea)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFocusListener")(addFocusListener)
    __obj.updateDynamic("addKeyHandler")(addKeyHandler)
    __obj.updateDynamic("addKeyListener")(addKeyListener)
    __obj.updateDynamic("addMouseClickHandler")(addMouseClickHandler)
    __obj.updateDynamic("addMouseListener")(addMouseListener)
    __obj.updateDynamic("addMouseMotionListener")(addMouseMotionListener)
    __obj.updateDynamic("addPaintListener")(addPaintListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addSelectionChangeListener")(addSelectionChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("addWindowListener")(addWindowListener)
    __obj.updateDynamic("attachFrame")(attachFrame)
    __obj.updateDynamic("attachModel")(attachModel)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getCurrentPage")(getCurrentPage)
    __obj.updateDynamic("getFrame")(getFrame)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getPosSize")(getPosSize)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("getTransferable")(getTransferable)
    __obj.updateDynamic("getViewData")(getViewData)
    __obj.updateDynamic("insertTransferable")(insertTransferable)
    __obj.updateDynamic("queryDispatch")(queryDispatch)
    __obj.updateDynamic("queryDispatches")(queryDispatches)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerContextMenuInterceptor")(registerContextMenuInterceptor)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseContextMenuInterceptor")(releaseContextMenuInterceptor)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFocusListener")(removeFocusListener)
    __obj.updateDynamic("removeKeyHandler")(removeKeyHandler)
    __obj.updateDynamic("removeKeyListener")(removeKeyListener)
    __obj.updateDynamic("removeMouseClickHandler")(removeMouseClickHandler)
    __obj.updateDynamic("removeMouseListener")(removeMouseListener)
    __obj.updateDynamic("removeMouseMotionListener")(removeMouseMotionListener)
    __obj.updateDynamic("removePaintListener")(removePaintListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeSelectionChangeListener")(removeSelectionChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("removeWindowListener")(removeWindowListener)
    __obj.updateDynamic("restoreViewData")(restoreViewData)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("setCurrentPage")(setCurrentPage)
    __obj.updateDynamic("setEnable")(setEnable)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setPosSize")(setPosSize)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("suspend")(suspend)
    __obj.asInstanceOf[PresentationView]
  }
}

