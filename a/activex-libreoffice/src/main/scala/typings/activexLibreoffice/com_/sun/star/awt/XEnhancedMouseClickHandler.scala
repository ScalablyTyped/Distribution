package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive enhanced events from the mouse.
  * @since OOo 2.0
  */
trait XEnhancedMouseClickHandler extends XEventListener {
  /** is invoked when a mouse button has been pressed on a window. */
  def mousePressed(e: EnhancedMouseEvent): Boolean
  /** is invoked when a mouse button has been released on a window. */
  def mouseReleased(e: EnhancedMouseEvent): Boolean
}

object XEnhancedMouseClickHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    mousePressed: EnhancedMouseEvent => Boolean,
    mouseReleased: EnhancedMouseEvent => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEnhancedMouseClickHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEnhancedMouseClickHandler]
  }
}

