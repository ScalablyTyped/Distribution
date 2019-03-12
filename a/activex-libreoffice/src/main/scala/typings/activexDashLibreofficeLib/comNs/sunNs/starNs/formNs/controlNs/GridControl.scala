package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a table-like control for displaying data.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.GridControl} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
trait GridControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControl
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XBoundComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XGridControl
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModeSelector
     with activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProviderInterception

object GridControl {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Count: scala.Double,
    CurrentColumnPosition: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    Graphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    Mode: java.lang.String,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    Peer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Selection: js.Any,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SupportedModes: stdLib.SafeArray[java.lang.String],
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    addGridControlListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XGridControlListener => scala.Unit,
    addKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    addMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    addMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    addPaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    addSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    addUpdateListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XUpdateListener => scala.Unit,
    addWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    commit: () => scala.Boolean,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    createPeer: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer) => scala.Unit,
    dispose: () => scala.Unit,
    draw: (scala.Double, scala.Double) => scala.Unit,
    getAccessibleContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    getByIndex: scala.Double => js.Any,
    getContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getCount: () => scala.Double,
    getCurrentColumnPosition: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getGraphics: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    getMode: () => java.lang.String,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    getPeer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    getPosSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getSelection: () => js.Any,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getSupportedModes: () => stdLib.SafeArray[java.lang.String],
    getView: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    hasElements: () => scala.Boolean,
    isDesignMode: () => scala.Boolean,
    isTransparent: () => scala.Boolean,
    queryFieldData: (scala.Double, activexDashLibreofficeLib.`type`) => stdLib.SafeArray[_],
    queryFieldDataType: activexDashLibreofficeLib.`type` => stdLib.SafeArray[scala.Boolean],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerDispatchProviderInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProviderInterceptor => scala.Unit,
    release: () => scala.Unit,
    releaseDispatchProviderInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProviderInterceptor => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    removeGridControlListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XGridControlListener => scala.Unit,
    removeKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    removeMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    removeMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    removePaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    removeSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    removeUpdateListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XUpdateListener => scala.Unit,
    removeWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    select: js.Any => scala.Boolean,
    setContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setCurrentColumnPosition: scala.Double => scala.Unit,
    setDesignMode: scala.Boolean => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    setFocus: () => scala.Unit,
    setGraphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics => scala.Boolean,
    setMode: java.lang.String => scala.Unit,
    setModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => scala.Boolean,
    setPosSize: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setVisible: scala.Boolean => scala.Unit,
    setZoom: (scala.Double, scala.Double) => scala.Unit,
    supportsMode: java.lang.String => scala.Boolean
  ): GridControl = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Count = Count, CurrentColumnPosition = CurrentColumnPosition, ElementType = ElementType, Graphics = Graphics, Mode = Mode, Model = Model, Peer = Peer, PosSize = PosSize, Selection = Selection, Size = Size, SupportedModes = SupportedModes, View = View, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addGridControlListener = js.Any.fromFunction1(addGridControlListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addUpdateListener = js.Any.fromFunction1(addUpdateListener), addWindowListener = js.Any.fromFunction1(addWindowListener), commit = js.Any.fromFunction0(commit), createEnumeration = js.Any.fromFunction0(createEnumeration), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getByIndex = js.Any.fromFunction1(getByIndex), getContext = js.Any.fromFunction0(getContext), getCount = js.Any.fromFunction0(getCount), getCurrentColumnPosition = js.Any.fromFunction0(getCurrentColumnPosition), getElementType = js.Any.fromFunction0(getElementType), getGraphics = js.Any.fromFunction0(getGraphics), getMode = js.Any.fromFunction0(getMode), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSelection = js.Any.fromFunction0(getSelection), getSize = js.Any.fromFunction0(getSize), getSupportedModes = js.Any.fromFunction0(getSupportedModes), getView = js.Any.fromFunction0(getView), hasElements = js.Any.fromFunction0(hasElements), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryFieldData = js.Any.fromFunction2(queryFieldData), queryFieldDataType = js.Any.fromFunction1(queryFieldDataType), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1(registerDispatchProviderInterceptor), release = js.Any.fromFunction0(release), releaseDispatchProviderInterceptor = js.Any.fromFunction1(releaseDispatchProviderInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeGridControlListener = js.Any.fromFunction1(removeGridControlListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeUpdateListener = js.Any.fromFunction1(removeUpdateListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), select = js.Any.fromFunction1(select), setContext = js.Any.fromFunction1(setContext), setCurrentColumnPosition = js.Any.fromFunction1(setCurrentColumnPosition), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setMode = js.Any.fromFunction1(setMode), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom), supportsMode = js.Any.fromFunction1(supportsMode))
  
    __obj.asInstanceOf[GridControl]
  }
}

