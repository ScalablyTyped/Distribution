package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.controlNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.UnoControlCheckBox
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XFocusListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XGraphics
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XItemListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XKeyListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseMotionListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XPaintListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XToolkit
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XView
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindowListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindowPeer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XBoundControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a check box control which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.CheckBox} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
trait CheckBox
  extends UnoControlCheckBox
     with XBoundControl

object CheckBox {
  @scala.inline
  def apply(
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    Graphics: XGraphics,
    Lock: Boolean,
    MinimumSize: Size,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    PreferredSize: Size,
    Size: Size,
    State: Double,
    View: XView,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addItemListener: XItemListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addWindowListener: XWindowListener => Unit,
    calcAdjustedSize: Size => Size,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    dispose: () => Unit,
    draw: (Double, Double) => Unit,
    enableTriState: Boolean => Unit,
    getAccessibleContext: () => XAccessibleContext,
    getContext: () => XInterface,
    getGraphics: () => XGraphics,
    getLock: () => Boolean,
    getMinimumSize: () => Size,
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getPreferredSize: () => Size,
    getSize: () => Size,
    getState: () => Double,
    getView: () => XView,
    isDesignMode: () => Boolean,
    isTransparent: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeItemListener: XItemListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setGraphics: XGraphics => Boolean,
    setLabel: String => Unit,
    setLock: Boolean => Unit,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setState: Double => Unit,
    setVisible: Boolean => Unit,
    setZoom: (Double, Double) => Unit
  ): CheckBox = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Graphics = Graphics, Lock = Lock, MinimumSize = MinimumSize, Model = Model, Peer = Peer, PosSize = PosSize, PreferredSize = PreferredSize, Size = Size, State = State, View = View, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addItemListener = js.Any.fromFunction1(addItemListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), enableTriState = js.Any.fromFunction1(enableTriState), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getLock = js.Any.fromFunction0(getLock), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), getSize = js.Any.fromFunction0(getSize), getState = js.Any.fromFunction0(getState), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeItemListener = js.Any.fromFunction1(removeItemListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1(setLabel), setLock = js.Any.fromFunction1(setLock), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setState = js.Any.fromFunction1(setState), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[CheckBox]
  }
}

