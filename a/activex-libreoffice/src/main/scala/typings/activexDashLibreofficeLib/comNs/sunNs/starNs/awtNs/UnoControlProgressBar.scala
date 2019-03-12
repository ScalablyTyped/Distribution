package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a progress bar control. */
trait UnoControlProgressBar
  extends UnoControl
     with XProgressBar

object UnoControlProgressBar {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Graphics: XGraphics,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    Value: scala.Double,
    View: XView,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFocusListener: XFocusListener => scala.Unit,
    addKeyListener: XKeyListener => scala.Unit,
    addMouseListener: XMouseListener => scala.Unit,
    addMouseMotionListener: XMouseMotionListener => scala.Unit,
    addPaintListener: XPaintListener => scala.Unit,
    addWindowListener: XWindowListener => scala.Unit,
    createPeer: (XToolkit, XWindowPeer) => scala.Unit,
    dispose: () => scala.Unit,
    draw: (scala.Double, scala.Double) => scala.Unit,
    getAccessibleContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    getContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getGraphics: () => XGraphics,
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getSize: () => Size,
    getValue: () => scala.Double,
    getView: () => XView,
    isDesignMode: () => scala.Boolean,
    isTransparent: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFocusListener: XFocusListener => scala.Unit,
    removeKeyListener: XKeyListener => scala.Unit,
    removeMouseListener: XMouseListener => scala.Unit,
    removeMouseMotionListener: XMouseMotionListener => scala.Unit,
    removePaintListener: XPaintListener => scala.Unit,
    removeWindowListener: XWindowListener => scala.Unit,
    setBackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setDesignMode: scala.Boolean => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    setFocus: () => scala.Unit,
    setForegroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setGraphics: XGraphics => scala.Boolean,
    setModel: XControlModel => scala.Boolean,
    setPosSize: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setRange: (scala.Double, scala.Double) => scala.Unit,
    setValue: scala.Double => scala.Unit,
    setVisible: scala.Boolean => scala.Unit,
    setZoom: (scala.Double, scala.Double) => scala.Unit
  ): UnoControlProgressBar = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Graphics = Graphics, Model = Model, Peer = Peer, PosSize = PosSize, Size = Size, Value = Value, View = View, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getValue = js.Any.fromFunction0(getValue), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setRange = js.Any.fromFunction2(setRange), setValue = js.Any.fromFunction1(setValue), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[UnoControlProgressBar]
  }
}

