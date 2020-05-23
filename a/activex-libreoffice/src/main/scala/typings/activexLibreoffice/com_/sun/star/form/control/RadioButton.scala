package typings.activexLibreoffice.com_.sun.star.form.control

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typings.activexLibreoffice.com_.sun.star.awt.XGraphics
import typings.activexLibreoffice.com_.sun.star.awt.XItemListener
import typings.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typings.activexLibreoffice.com_.sun.star.awt.XLayoutConstrains
import typings.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typings.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typings.activexLibreoffice.com_.sun.star.awt.XRadioButton
import typings.activexLibreoffice.com_.sun.star.awt.XToolkit
import typings.activexLibreoffice.com_.sun.star.awt.XView
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typings.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typings.activexLibreoffice.com_.sun.star.form.XBoundControl
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a radio button control which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.RadioButton} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
trait RadioButton
  extends XControl
     with XWindow
     with XView
     with XAccessible
     with XRadioButton
     with XLayoutConstrains
     with XBoundControl

object RadioButton {
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
    State: Boolean,
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
    getState: () => Boolean,
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
    setState: Boolean => Unit,
    setVisible: Boolean => Unit,
    setZoom: (Double, Double) => Unit
  ): RadioButton = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Lock = Lock.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addItemListener = js.Any.fromFunction1(addItemListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getLock = js.Any.fromFunction0(getLock), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), getSize = js.Any.fromFunction0(getSize), getState = js.Any.fromFunction0(getState), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeItemListener = js.Any.fromFunction1(removeItemListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1(setLabel), setLock = js.Any.fromFunction1(setLock), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setState = js.Any.fromFunction1(setState), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
    __obj.asInstanceOf[RadioButton]
  }
}

