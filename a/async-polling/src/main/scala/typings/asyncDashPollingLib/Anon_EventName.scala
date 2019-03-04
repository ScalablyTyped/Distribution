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
    on: js.Function2[
      asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName, 
      js.Function, 
      js.Any
    ],
    run: js.Function0[js.Any],
    stop: js.Function0[js.Any]
  ): Anon_EventName = {
    val __obj = js.Dynamic.literal(on = on, run = run, stop = stop)
  
    __obj.asInstanceOf[Anon_EventName]
  }
}

