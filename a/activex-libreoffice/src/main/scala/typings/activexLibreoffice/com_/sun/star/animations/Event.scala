package typings.activexLibreoffice.com_.sun.star.animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * an event has a source that causes an event to be fired and a trigger that defines under which condition an event should be raised and an offset if the
  * event should be raised a defined amount of time after the event is triggered.
  */
@js.native
trait Event extends js.Object {
  /** an optional offset in seconds or Timing::INDEFINITE. This is the timespan between the triggering of the event and actually raising the event */
  var Offset: js.Any = js.native
  /** an option repeat value. If the {@link Trigger} is {@link EventTrigger} , this is the number of repeats after which the event is initially raised. */
  var Repeat: Double = js.native
  /** this is the source for this event. */
  var Source: js.Any = js.native
  /** this is the trigger that fires this event. */
  var Trigger: Double = js.native
}

object Event {
  @scala.inline
  def apply(Offset: js.Any, Repeat: Double, Source: js.Any, Trigger: Double): Event = {
    val __obj = js.Dynamic.literal(Offset = Offset.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Trigger = Trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setOffset(value: js.Any): Self = this.set("Offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat(value: Double): Self = this.set("Repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: js.Any): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrigger(value: Double): Self = this.set("Trigger", value.asInstanceOf[js.Any])
  }
  
}

