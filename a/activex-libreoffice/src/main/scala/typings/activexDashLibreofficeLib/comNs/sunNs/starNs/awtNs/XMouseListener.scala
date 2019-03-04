package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events from the mouse in a certain window. */
trait XMouseListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when the mouse enters a window. */
  def mouseEntered(e: MouseEvent): scala.Unit
  /** is invoked when the mouse exits a window. */
  def mouseExited(e: MouseEvent): scala.Unit
  /**
    * is invoked when a mouse button has been pressed on a window.
    *
    * Since mouse presses are usually also used to indicate requests for pop-up menus (also known as context menus) on objects, you might receive two events
    * for a single mouse press: For example, if, on your operating system, pressing the right mouse button indicates the request for a context menu, then
    * you will receive one call to {@link mousePressed()} indicating the mouse click, and another one indicating the context menu request. For the latter,
    * the {@link MouseEvent.PopupTrigger} member of the event will be set to `TRUE` .
    */
  def mousePressed(e: MouseEvent): scala.Unit
  /** is invoked when a mouse button has been released on a window. */
  def mouseReleased(e: MouseEvent): scala.Unit
}

object XMouseListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    mouseEntered: js.Function1[MouseEvent, scala.Unit],
    mouseExited: js.Function1[MouseEvent, scala.Unit],
    mousePressed: js.Function1[MouseEvent, scala.Unit],
    mouseReleased: js.Function1[MouseEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMouseListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, mouseEntered = mouseEntered, mouseExited = mouseExited, mousePressed = mousePressed, mouseReleased = mouseReleased, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMouseListener]
  }
}

