package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events from the mouse in a certain window. */
trait XMouseListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the mouse enters a window. */
  def mouseEntered(e: MouseEvent): Unit
  
  /** is invoked when the mouse exits a window. */
  def mouseExited(e: MouseEvent): Unit
  
  /**
    * is invoked when a mouse button has been pressed on a window.
    *
    * Since mouse presses are usually also used to indicate requests for pop-up menus (also known as context menus) on objects, you might receive two events
    * for a single mouse press: For example, if, on your operating system, pressing the right mouse button indicates the request for a context menu, then
    * you will receive one call to {@link mousePressed()} indicating the mouse click, and another one indicating the context menu request. For the latter,
    * the {@link MouseEvent.PopupTrigger} member of the event will be set to `TRUE` .
    */
  def mousePressed(e: MouseEvent): Unit
  
  /** is invoked when a mouse button has been released on a window. */
  def mouseReleased(e: MouseEvent): Unit
}
object XMouseListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    mouseEntered: MouseEvent => Unit,
    mouseExited: MouseEvent => Unit,
    mousePressed: MouseEvent => Unit,
    mouseReleased: MouseEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMouseListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), mouseEntered = js.Any.fromFunction1(mouseEntered), mouseExited = js.Any.fromFunction1(mouseExited), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMouseListener]
  }
  
  @scala.inline
  implicit class XMouseListenerMutableBuilder[Self <: XMouseListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMouseEntered(value: MouseEvent => Unit): Self = StObject.set(x, "mouseEntered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseExited(value: MouseEvent => Unit): Self = StObject.set(x, "mouseExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMousePressed(value: MouseEvent => Unit): Self = StObject.set(x, "mousePressed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseReleased(value: MouseEvent => Unit): Self = StObject.set(x, "mouseReleased", js.Any.fromFunction1(value))
  }
}
