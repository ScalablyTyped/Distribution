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

object XEnhancedMouseClickHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    mousePressed: js.Function1[EnhancedMouseEvent, scala.Boolean],
    mouseReleased: js.Function1[EnhancedMouseEvent, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEnhancedMouseClickHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, mousePressed = mousePressed, mouseReleased = mouseReleased, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XEnhancedMouseClickHandler]
  }
}

