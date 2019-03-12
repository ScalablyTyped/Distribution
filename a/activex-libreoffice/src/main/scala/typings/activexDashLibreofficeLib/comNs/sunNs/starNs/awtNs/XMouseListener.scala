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
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    mouseEntered: MouseEvent => scala.Unit,
    mouseExited: MouseEvent => scala.Unit,
    mousePressed: MouseEvent => scala.Unit,
    mouseReleased: MouseEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMouseListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), mouseEntered = js.Any.fromFunction1(mouseEntered), mouseExited = js.Any.fromFunction1(mouseExited), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMouseListener]
  }
}

