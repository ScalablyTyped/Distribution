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

