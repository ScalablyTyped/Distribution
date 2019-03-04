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
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage, Frame = Frame, Model = Model, PosSize = PosSize, PropertySetInfo = PropertySetInfo, Selection = Selection, Transferable = Transferable, ViewData = ViewData, VisibleArea = VisibleArea, acquire = acquire, addEventListener = addEventListener, addFocusListener = addFocusListener, addKeyHandler = addKeyHandler, addKeyListener = addKeyListener, addMouseClickHandler = addMouseClickHandler, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addPropertyChangeListener = addPropertyChangeListener, addSelectionChangeListener = addSelectionChangeListener, addVetoableChangeListener = addVetoableChangeListener, addWindowListener = addWindowListener, attachFrame = attachFrame, attachModel = attachModel, dispose = dispose, getCurrentPage = getCurrentPage, getFrame = getFrame, getModel = getModel, getPosSize = getPosSize, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSelection = getSelection, getTransferable = getTransferable, getViewData = getViewData, insertTransferable = insertTransferable, queryDispatch = queryDispatch, queryDispatches = queryDispatches, queryInterface = queryInterface, registerContextMenuInterceptor = registerContextMenuInterceptor, release = release, releaseContextMenuInterceptor = releaseContextMenuInterceptor, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeKeyHandler = removeKeyHandler, removeKeyListener = removeKeyListener, removeMouseClickHandler = removeMouseClickHandler, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removePropertyChangeListener = removePropertyChangeListener, removeSelectionChangeListener = removeSelectionChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, removeWindowListener = removeWindowListener, restoreViewData = restoreViewData, select = select, setCurrentPage = setCurrentPage, setEnable = setEnable, setFocus = setFocus, setPosSize = setPosSize, setPropertyValue = setPropertyValue, setVisible = setVisible, suspend = suspend)
  
    __obj.asInstanceOf[PresentationView]
  }
}

