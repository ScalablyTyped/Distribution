package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component integrates a slides view to a presentation document into the desktop.
  *
  * In a slides view, the pages of a presentation document are displayed to the user as thumbnails and can be arranged and cut/copied to/from the
  * clipboard.
  * @since OOo 1.1.2
  */
trait SlidesView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Controller
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** This is the area that is currently visible. */
  var VisibleArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
}

object SlidesView {
  @scala.inline
  def apply(
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Selection: js.Any,
    Transferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    ViewData: js.Any,
    VisibleArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    addKeyHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler => scala.Unit,
    addKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    addMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler => scala.Unit,
    addMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    addMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    addPaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    addWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    attachFrame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame => scala.Unit,
    attachModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel => scala.Boolean,
    dispose: () => scala.Unit,
    getFrame: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    getPosSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSelection: () => js.Any,
    getTransferable: () => activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    getViewData: () => js.Any,
    insertTransferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable => scala.Unit,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchDescriptor] => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerContextMenuInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor => scala.Unit,
    release: () => scala.Unit,
    releaseContextMenuInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    removeKeyHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler => scala.Unit,
    removeKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    removeMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler => scala.Unit,
    removeMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    removeMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    removePaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    removeWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    restoreViewData: js.Any => scala.Unit,
    select: js.Any => scala.Boolean,
    setEnable: scala.Boolean => scala.Unit,
    setFocus: () => scala.Unit,
    setPosSize: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setVisible: scala.Boolean => scala.Unit,
    suspend: scala.Boolean => scala.Boolean
  ): SlidesView = {
    val __obj = js.Dynamic.literal(Frame = Frame, Model = Model, PosSize = PosSize, PropertySetInfo = PropertySetInfo, Selection = Selection, Transferable = Transferable, ViewData = ViewData, VisibleArea = VisibleArea, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), addWindowListener = js.Any.fromFunction1(addWindowListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getPosSize = js.Any.fromFunction0(getPosSize), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSelection = js.Any.fromFunction0(getSelection), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), insertTransferable = js.Any.fromFunction1(insertTransferable), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setPosSize = js.Any.fromFunction5(setPosSize), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setVisible = js.Any.fromFunction1(setVisible), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[SlidesView]
  }
}

