package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from the mouse in a certain window.
  * @since OOo 1.1.2
  */
trait XMouseClickHandler extends XEventListener {
  /**
    * is invoked when a mouse button has been pressed on a window.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def mousePressed(e: MouseEvent): Boolean
  /**
    * is invoked when a mouse button has been released on a window.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def mouseReleased(e: MouseEvent): Boolean
}

object XMouseClickHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    mousePressed: MouseEvent => Boolean,
    mouseReleased: MouseEvent => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMouseClickHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMouseClickHandler]
  }
}

