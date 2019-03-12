package typings
package asyncDashPollingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventName extends js.Object {
  def on(eventName: asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName, listener: js.Function): js.Any
  def run(): js.Any
  def stop(): js.Any
}

object Anon_EventName {
  @scala.inline
  def apply(
    on: (asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName, js.Function) => js.Any,
    run: () => js.Any,
    stop: () => js.Any
  ): Anon_EventName = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), run = js.Any.fromFunction0(run), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Anon_EventName]
  }
}

