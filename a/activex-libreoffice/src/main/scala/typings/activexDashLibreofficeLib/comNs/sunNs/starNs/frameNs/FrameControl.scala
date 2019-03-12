package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a frame with a desktop component
  *
  * If the control is visible and has a valid (loadable) component URL, then the {@link FrameControl.Frame} property is set. Normally this control can be
  * used for preview functionality inside any UI.
  */
trait FrameControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControl {
  /** contains the type of the component which is loaded into the frame, or the document which implicitly specifies the type */
  var ComponentUrl: java.lang.String
  /**
    * the frame held by this control
    *
    * The {@link Frame} is created if the control is shown and the {@link ComponentUrl} is set.
    */
  var Frame: java.lang.String
}

object FrameControl {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    ComponentUrl: java.lang.String,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Frame: java.lang.String,
    Graphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    Peer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    addKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    addMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    addMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    addPaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    addWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    createPeer: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer) => scala.Unit,
    dispose: () => scala.Unit,
    draw: (scala.Double, scala.Double) => scala.Unit,
    getAccessibleContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    getContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getGraphics: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    getPeer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    getPosSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getView: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    isDesignMode: () => scala.Boolean,
    isTransparent: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    removeKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    removeMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    removeMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    removePaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    removeWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    setContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setDesignMode: scala.Boolean => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    setFocus: () => scala.Unit,
    setGraphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics => scala.Boolean,
    setModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => scala.Boolean,
    setPosSize: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setVisible: scala.Boolean => scala.Unit,
    setZoom: (scala.Double, scala.Double) => scala.Unit
  ): FrameControl = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, ComponentUrl = ComponentUrl, Context = Context, Frame = Frame, Graphics = Graphics, Model = Model, Peer = Peer, PosSize = PosSize, Size = Size, View = View, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[FrameControl]
  }
}

