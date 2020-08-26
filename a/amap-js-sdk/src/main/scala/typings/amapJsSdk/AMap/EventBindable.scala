package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBindable extends js.Object {
  def off(eventName: String, callback: EventCallback): Unit = js.native
  def on(eventName: String, callback: EventCallback): Unit = js.native
}

object EventBindable {
  @scala.inline
  def apply(off: (String, EventCallback) => Unit, on: (String, EventCallback) => Unit): EventBindable = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[EventBindable]
  }
  @scala.inline
  implicit class EventBindableOps[Self <: EventBindable] (val x: Self) extends AnyVal {
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
    def setOff(value: (String, EventCallback) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (String, EventCallback) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
  
}

