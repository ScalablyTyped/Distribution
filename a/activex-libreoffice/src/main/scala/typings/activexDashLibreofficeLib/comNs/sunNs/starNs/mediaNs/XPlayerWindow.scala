package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interacts with the media player window */
trait XPlayerWindow
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow {
  /** gets the current media ratio. */
  var ZoomLevel: ZoomLevel
  /** gets the current media ratio. */
  def getZoomLevel(): ZoomLevel
  /**
    * changes the pointer for the player window.
    * @param SystemPointerType a {@link com.sun.star.awt.SystemPointer}
    */
  def setPointerType(SystemPointerType: scala.Double): scala.Unit
  /** changes the zoom of the media played by the window. */
  def setZoomLevel(ZoomLevel: ZoomLevel): scala.Boolean
  /** redraws the player window */
  def update(): scala.Unit
}

object XPlayerWindow {
  @scala.inline
  def apply(
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    ZoomLevel: ZoomLevel,
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
    dispose: js.Function0[scala.Unit],
    getPosSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getZoomLevel: js.Function0[ZoomLevel],
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
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setPointerType: js.Function1[scala.Double, scala.Unit],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setZoomLevel: js.Function1[ZoomLevel, scala.Boolean],
    update: js.Function0[scala.Unit]
  ): XPlayerWindow = {
    val __obj = js.Dynamic.literal(PosSize = PosSize, ZoomLevel = ZoomLevel, acquire = acquire, addEventListener = addEventListener, addFocusListener = addFocusListener, addKeyListener = addKeyListener, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addWindowListener = addWindowListener, dispose = dispose, getPosSize = getPosSize, getZoomLevel = getZoomLevel, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeKeyListener = removeKeyListener, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeWindowListener = removeWindowListener, setEnable = setEnable, setFocus = setFocus, setPointerType = setPointerType, setPosSize = setPosSize, setVisible = setVisible, setZoomLevel = setZoomLevel, update = update)
  
    __obj.asInstanceOf[XPlayerWindow]
  }
}

