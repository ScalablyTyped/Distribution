package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the actual window implementation on the device. */
trait XWindowPeer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /** returns the toolkit which created this object. */
  val Toolkit: XToolkit
  /** returns the toolkit which created this object. */
  def getToolkit(): XToolkit
  /**
    * invalidates the whole window with the specified {@link InvalidateStyle} .
    * @param Flags see {@link com.sun.star.awt.InvalidateStyle}
    */
  def invalidate(Flags: scala.Double): scala.Unit
  /**
    * invalidates a rectangular area of the window with the specified {@link InvalidateStyle} .
    * @param Rect the area to invalidate.
    * @param Flags see {@link com.sun.star.awt.InvalidateStyle}
    */
  def invalidateRect(Rect: Rectangle, Flags: scala.Double): scala.Unit
  /** sets the background color. */
  def setBackground(Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  /** sets the mouse pointer. */
  def setPointer(Pointer: XPointer): scala.Unit
}

object XWindowPeer {
  @scala.inline
  def apply(
    Toolkit: XToolkit,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getToolkit: js.Function0[XToolkit],
    invalidate: js.Function1[scala.Double, scala.Unit],
    invalidateRect: js.Function2[Rectangle, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setBackground: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setPointer: js.Function1[XPointer, scala.Unit]
  ): XWindowPeer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Toolkit")(Toolkit)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getToolkit")(getToolkit)
    __obj.updateDynamic("invalidate")(invalidate)
    __obj.updateDynamic("invalidateRect")(invalidateRect)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBackground")(setBackground)
    __obj.updateDynamic("setPointer")(setPointer)
    __obj.asInstanceOf[XWindowPeer]
  }
}

