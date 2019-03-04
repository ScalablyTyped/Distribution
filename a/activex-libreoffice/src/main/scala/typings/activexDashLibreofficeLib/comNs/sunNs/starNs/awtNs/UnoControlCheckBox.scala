package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a check box control. */
trait UnoControlCheckBox
  extends UnoControl
     with XCheckBox
     with XLayoutConstrains

object UnoControlCheckBox {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Graphics: XGraphics,
    MinimumSize: Size,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    PreferredSize: Size,
    Size: Size,
    State: scala.Double,
    View: XView,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[XFocusListener, scala.Unit],
    addItemListener: js.Function1[XItemListener, scala.Unit],
    addKeyListener: js.Function1[XKeyListener, scala.Unit],
    addMouseListener: js.Function1[XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    addPaintListener: js.Function1[XPaintListener, scala.Unit],
    addWindowListener: js.Function1[XWindowListener, scala.Unit],
    calcAdjustedSize: js.Function1[Size, Size],
    createPeer: js.Function2[XToolkit, XWindowPeer, scala.Unit],
    dispose: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    enableTriState: js.Function1[scala.Boolean, scala.Unit],
    getAccessibleContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getGraphics: js.Function0[XGraphics],
    getMinimumSize: js.Function0[Size],
    getModel: js.Function0[XControlModel],
    getPeer: js.Function0[XWindowPeer],
    getPosSize: js.Function0[Rectangle],
    getPreferredSize: js.Function0[Size],
    getSize: js.Function0[Size],
    getState: js.Function0[scala.Double],
    getView: js.Function0[XView],
    isDesignMode: js.Function0[scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[XFocusListener, scala.Unit],
    removeItemListener: js.Function1[XItemListener, scala.Unit],
    removeKeyListener: js.Function1[XKeyListener, scala.Unit],
    removeMouseListener: js.Function1[XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    removePaintListener: js.Function1[XPaintListener, scala.Unit],
    removeWindowListener: js.Function1[XWindowListener, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setGraphics: js.Function1[XGraphics, scala.Boolean],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setModel: js.Function1[XControlModel, scala.Boolean],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setState: js.Function1[scala.Double, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): UnoControlCheckBox = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Graphics = Graphics, MinimumSize = MinimumSize, Model = Model, Peer = Peer, PosSize = PosSize, PreferredSize = PreferredSize, Size = Size, State = State, View = View, acquire = acquire, addEventListener = addEventListener, addFocusListener = addFocusListener, addItemListener = addItemListener, addKeyListener = addKeyListener, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addWindowListener = addWindowListener, calcAdjustedSize = calcAdjustedSize, createPeer = createPeer, dispose = dispose, draw = draw, enableTriState = enableTriState, getAccessibleContext = getAccessibleContext, getContext = getContext, getGraphics = getGraphics, getMinimumSize = getMinimumSize, getModel = getModel, getPeer = getPeer, getPosSize = getPosSize, getPreferredSize = getPreferredSize, getSize = getSize, getState = getState, getView = getView, isDesignMode = isDesignMode, isTransparent = isTransparent, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeItemListener = removeItemListener, removeKeyListener = removeKeyListener, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeWindowListener = removeWindowListener, setContext = setContext, setDesignMode = setDesignMode, setEnable = setEnable, setFocus = setFocus, setGraphics = setGraphics, setLabel = setLabel, setModel = setModel, setPosSize = setPosSize, setState = setState, setVisible = setVisible, setZoom = setZoom)
  
    __obj.asInstanceOf[UnoControlCheckBox]
  }
}

