package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
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
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    Graphics: XGraphics,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    Value: Double,
    View: XView,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addWindowListener: XWindowListener => Unit,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    dispose: () => Unit,
    draw: (Double, Double) => Unit,
    getAccessibleContext: () => XAccessibleContext,
    getContext: () => XInterface,
    getGraphics: () => XGraphics,
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getSize: () => Size,
    getValue: () => Double,
    getView: () => XView,
    isDesignMode: () => Boolean,
    isTransparent: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    setBackgroundColor: Color => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setForegroundColor: Color => Unit,
    setGraphics: XGraphics => Boolean,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setRange: (Double, Double) => Unit,
    setValue: Double => Unit,
    setVisible: Boolean => Unit,
    setZoom: (Double, Double) => Unit
  ): UnoControlProgressBar = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Graphics = Graphics, Model = Model, Peer = Peer, PosSize = PosSize, Size = Size, Value = Value, View = View, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getValue = js.Any.fromFunction0(getValue), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setRange = js.Any.fromFunction2(setRange), setValue = js.Any.fromFunction1(setValue), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[UnoControlProgressBar]
  }
}

