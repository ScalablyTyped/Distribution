package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive enhanced events from the mouse.
  * @since OOo 2.0
  */
trait XEnhancedMouseClickHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a mouse button has been pressed on a window. */
  def mousePressed(e: EnhancedMouseEvent): scala.Boolean
  /** is invoked when a mouse button has been released on a window. */
  def mouseReleased(e: EnhancedMouseEvent): scala.Boolean
}

