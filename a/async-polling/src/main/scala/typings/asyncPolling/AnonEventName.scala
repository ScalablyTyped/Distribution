package typings.asyncPolling

import typings.asyncPolling.mod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventName extends js.Object {
  def on(eventName: EventName, listener: js.Function): js.Any
  def run(): js.Any
  def stop(): js.Any
}

object AnonEventName {
  @scala.inline
  def apply(on: (EventName, js.Function) => js.Any, run: () => js.Any, stop: () => js.Any): AnonEventName = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), run = js.Any.fromFunction0(run), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[AnonEventName]
  }
}

