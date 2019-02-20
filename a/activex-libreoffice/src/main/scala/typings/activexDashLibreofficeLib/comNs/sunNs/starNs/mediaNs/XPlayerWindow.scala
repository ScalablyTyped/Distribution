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

