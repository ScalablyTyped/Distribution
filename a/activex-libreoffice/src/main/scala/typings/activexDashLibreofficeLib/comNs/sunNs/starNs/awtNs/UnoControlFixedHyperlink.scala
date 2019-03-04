package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a control for displaying fixed hyperlink. */
trait UnoControlFixedHyperlink
  extends UnoControl
     with XFixedHyperlink
     with XLayoutConstrains

object UnoControlFixedHyperlink {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Alignment: scala.Double,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Graphics: XGraphics,
    MinimumSize: Size,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    PreferredSize: Size,
    Size: Size,
    Text: java.lang.String,
    URL: java.lang.String,
    View: XView,
    acquire: js.Function0[scala.Unit],
    addActionListener: js.Function1[XActionListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[XFocusListener, scala.Unit],
    addKeyListener: js.Function1[XKeyListener, scala.Unit],
    addMouseListener: js.Function1[XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    addPaintListener: js.Function1[XPaintListener, scala.Unit],
    addWindowListener: js.Function1[XWindowListener, scala.Unit],
    calcAdjustedSize: js.Function1[Size, Size],
    createPeer: js.Function2[XToolkit, XWindowPeer, scala.Unit],
    dispose: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAccessibleContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext],
    getAlignment: js.Function0[scala.Double],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getGraphics: js.Function0[XGraphics],
    getMinimumSize: js.Function0[Size],
    getModel: js.Function0[XControlModel],
    getPeer: js.Function0[XWindowPeer],
    getPosSize: js.Function0[Rectangle],
    getPreferredSize: js.Function0[Size],
    getSize: js.Function0[Size],
    getText: js.Function0[java.lang.String],
    getURL: js.Function0[java.lang.String],
    getView: js.Function0[XView],
    isDesignMode: js.Function0[scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeActionListener: js.Function1[XActionListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[XFocusListener, scala.Unit],
    removeKeyListener: js.Function1[XKeyListener, scala.Unit],
    removeMouseListener: js.Function1[XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    removePaintListener: js.Function1[XPaintListener, scala.Unit],
    removeWindowListener: js.Function1[XWindowListener, scala.Unit],
    setAlignment: js.Function1[scala.Double, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setGraphics: js.Function1[XGraphics, scala.Boolean],
    setModel: js.Function1[XControlModel, scala.Boolean],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setText: js.Function1[java.lang.String, scala.Unit],
    setURL: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): UnoControlFixedHyperlink = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Alignment = Alignment, Context = Context, Graphics = Graphics, MinimumSize = MinimumSize, Model = Model, Peer = Peer, PosSize = PosSize, PreferredSize = PreferredSize, Size = Size, Text = Text, URL = URL, View = View, acquire = acquire, addActionListener = addActionListener, addEventListener = addEventListener, addFocusListener = addFocusListener, addKeyListener = addKeyListener, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addWindowListener = addWindowListener, calcAdjustedSize = calcAdjustedSize, createPeer = createPeer, dispose = dispose, draw = draw, getAccessibleContext = getAccessibleContext, getAlignment = getAlignment, getContext = getContext, getGraphics = getGraphics, getMinimumSize = getMinimumSize, getModel = getModel, getPeer = getPeer, getPosSize = getPosSize, getPreferredSize = getPreferredSize, getSize = getSize, getText = getText, getURL = getURL, getView = getView, isDesignMode = isDesignMode, isTransparent = isTransparent, queryInterface = queryInterface, release = release, removeActionListener = removeActionListener, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeKeyListener = removeKeyListener, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeWindowListener = removeWindowListener, setAlignment = setAlignment, setContext = setContext, setDesignMode = setDesignMode, setEnable = setEnable, setFocus = setFocus, setGraphics = setGraphics, setModel = setModel, setPosSize = setPosSize, setText = setText, setURL = setURL, setVisible = setVisible, setZoom = setZoom)
  
    __obj.asInstanceOf[UnoControlFixedHyperlink]
  }
}

