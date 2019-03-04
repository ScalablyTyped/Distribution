package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from the mouse in a certain window.
  * @since OOo 1.1.2
  */
trait XMouseClickHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when a mouse button has been pressed on a window.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def mousePressed(e: MouseEvent): scala.Boolean
  /**
    * is invoked when a mouse button has been released on a window.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def mouseReleased(e: MouseEvent): scala.Boolean
}

object XMouseClickHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    mousePressed: js.Function1[MouseEvent, scala.Boolean],
    mouseReleased: js.Function1[MouseEvent, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMouseClickHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, mousePressed = mousePressed, mouseReleased = mouseReleased, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMouseClickHandler]
  }
}

