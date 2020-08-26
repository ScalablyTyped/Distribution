package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class PaintEventOps[Self <: PaintEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateRect(value: Rectangle): Self = this.set("UpdateRect", value.asInstanceOf[js.Any])
  }
  
}

