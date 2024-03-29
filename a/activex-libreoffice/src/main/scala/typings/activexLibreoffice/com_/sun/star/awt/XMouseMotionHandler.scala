package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive mouse motion events on a window. */
trait XMouseMotionHandler
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when a mouse button is pressed on a window and then dragged.
    *
    * Mouse drag events will continue to be delivered to the window where the first event originated until the mouse button is released (regardless of
    * whether the mouse position is within the bounds of the window).
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def mouseDragged(e: MouseEvent): Boolean
  
  /**
    * is invoked when the mouse button has been moved on a window (with no buttons down).
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def mouseMoved(e: MouseEvent): Boolean
}
object XMouseMotionHandler {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    mouseDragged: MouseEvent => Boolean,
    mouseMoved: MouseEvent => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XMouseMotionHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), mouseDragged = js.Any.fromFunction1(mouseDragged), mouseMoved = js.Any.fromFunction1(mouseMoved), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMouseMotionHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMouseMotionHandler] (val x: Self) extends AnyVal {
    
    inline def setMouseDragged(value: MouseEvent => Boolean): Self = StObject.set(x, "mouseDragged", js.Any.fromFunction1(value))
    
    inline def setMouseMoved(value: MouseEvent => Boolean): Self = StObject.set(x, "mouseMoved", js.Any.fromFunction1(value))
  }
}
