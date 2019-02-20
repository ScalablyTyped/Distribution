package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive mouse motion events on a window. */
trait XMouseMotionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when a mouse button is pressed on a window and then dragged.
    *
    * Mouse drag events will continue to be delivered to the window where the first event originated until the mouse button is released (regardless of
    * whether the mouse position is within the bounds of the window).
    */
  def mouseDragged(e: MouseEvent): scala.Unit
  /** is invoked when the mouse pointer has been moved on a window (with no buttons down). */
  def mouseMoved(e: MouseEvent): scala.Unit
}

