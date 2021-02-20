package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the paint event for a component.
  *
  * This event is a special type which is used to ensure that paint/update method calls are serialized along with the other events delivered from the
  * event queue.
  * @see WindowEvent
  */
@js.native
trait PaintEvent extends EventObject {
  
  /**
    * contains the number of paint events that follows this event if it is a multiple {@link PaintEvent} . You can collect the {@link PaintEvent} until
    * Count is zero.
    */
  var Count: Double = js.native
  
  /** contains the rectangle area which needs to be repainted. */
  var UpdateRect: Rectangle = js.native
}
object PaintEvent {
  
  @scala.inline
  def apply(Count: Double, Source: XInterface, UpdateRect: Rectangle): PaintEvent = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], UpdateRect = UpdateRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaintEvent]
  }
  
  @scala.inline
  implicit class PaintEventMutableBuilder[Self <: PaintEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateRect(value: Rectangle): Self = StObject.set(x, "UpdateRect", value.asInstanceOf[js.Any])
  }
}
