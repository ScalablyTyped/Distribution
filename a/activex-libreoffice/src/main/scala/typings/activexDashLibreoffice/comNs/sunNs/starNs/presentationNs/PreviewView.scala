package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XFocusListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XKeyHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XKeyListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseClickHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseMotionListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XPaintListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindowListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawPage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawView
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.Controller
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.DispatchDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XDispatch
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XFrame
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component integrates a preview view to a slide show of a presentation document into the desktop.
  * @since OOo 1.1.2
  */
trait PreviewView
  extends Controller
     with XWindow
     with XDrawView
     with XPropertySet {
  /** This is the area that is currently visible. */
  var VisibleArea: Rectangle
}

object PreviewView {
  @scala.inline
  def apply(
    CurrentPage: XDrawPage,
    Frame: XFrame,
    Model: XModel,
    PosSize: Rectangle,
    PropertySetInfo: XPropertySetInfo,
    Selection: js.Any,
    Transferable: XTransferable,
    ViewData: js.Any,
    VisibleArea: Rectangle,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyHandler: XKeyHandler => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseClickHandler: XMouseClickHandler => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    addWindowListener: XWindowListener => Unit,
    attachFrame: XFrame => Unit,
    attachModel: XModel => Boolean,
    dispose: () => Unit,
    getCurrentPage: () => XDrawPage,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getPosSize: () => Rectangle,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
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
    removeFocusListener: XFocusListener => Unit,
    removeKeyHandler: XKeyHandler => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseClickHandler: XMouseClickHandler => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    removeWindowListener: XWindowListener => Unit,
    restoreViewData: js.Any => Unit,
    select: js.Any => Boolean,
    setCurrentPage: XDrawPage => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setVisible: Boolean => Unit,
    suspend: Boolean => Boolean
  ): PreviewView = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage, Frame = Frame, Model = Model, PosSize = PosSize, PropertySetInfo = PropertySetInfo, Selection = Selection, Transferable = Transferable, ViewData = ViewData, VisibleArea = VisibleArea, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), addWindowListener = js.Any.fromFunction1(addWindowListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getCurrentPage = js.Any.fromFunction0(getCurrentPage), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getPosSize = js.Any.fromFunction0(getPosSize), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSelection = js.Any.fromFunction0(getSelection), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), insertTransferable = js.Any.fromFunction1(insertTransferable), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setCurrentPage = js.Any.fromFunction1(setCurrentPage), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setPosSize = js.Any.fromFunction5(setPosSize), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setVisible = js.Any.fromFunction1(setVisible), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[PreviewView]
  }
}

