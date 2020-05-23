package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventBindable extends js.Object {
  def off(eventName: String, callback: EventCallback): Unit
  def on(eventName: String, callback: EventCallback): Unit
}

object EventBindable {
  @scala.inline
  def apply(off: (String, EventCallback) => Unit, on: (String, EventCallback) => Unit): EventBindable = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[EventBindable]
  }
}

