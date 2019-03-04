package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a control used for displaying images stored in a database.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.DatabaseImageControl} service.
  *
  * If the model of the control is valid bound to a database field, the control allows to select an image (browsing the file system) upon double clicking
  * into it, and forwards the URL of the chosen image to the ImageURL property of its model.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
trait ImageControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlImageControl
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XBoundControl

object ImageControl {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Graphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    Lock: scala.Boolean,
    MinimumSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    Peer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    PreferredSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    addKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    addMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    addPaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    addWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    calcAdjustedSize: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
    ],
    createPeer: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAccessibleContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getGraphics: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics],
    getLock: js.Function0[scala.Boolean],
    getMinimumSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel],
    getPeer: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer],
    getPosSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getPreferredSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getView: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView],
    isDesignMode: js.Function0[scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    removeKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    removeMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    removePaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    removeWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setGraphics: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics, scala.Boolean],
    setLock: js.Function1[scala.Boolean, scala.Unit],
    setModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, scala.Boolean],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): ImageControl = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Graphics = Graphics, Lock = Lock, MinimumSize = MinimumSize, Model = Model, Peer = Peer, PosSize = PosSize, PreferredSize = PreferredSize, Size = Size, View = View, acquire = acquire, addEventListener = addEventListener, addFocusListener = addFocusListener, addKeyListener = addKeyListener, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addWindowListener = addWindowListener, calcAdjustedSize = calcAdjustedSize, createPeer = createPeer, dispose = dispose, draw = draw, getAccessibleContext = getAccessibleContext, getContext = getContext, getGraphics = getGraphics, getLock = getLock, getMinimumSize = getMinimumSize, getModel = getModel, getPeer = getPeer, getPosSize = getPosSize, getPreferredSize = getPreferredSize, getSize = getSize, getView = getView, isDesignMode = isDesignMode, isTransparent = isTransparent, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeKeyListener = removeKeyListener, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeWindowListener = removeWindowListener, setContext = setContext, setDesignMode = setDesignMode, setEnable = setEnable, setFocus = setFocus, setGraphics = setGraphics, setLock = setLock, setModel = setModel, setPosSize = setPosSize, setVisible = setVisible, setZoom = setZoom)
  
    __obj.asInstanceOf[ImageControl]
  }
}

