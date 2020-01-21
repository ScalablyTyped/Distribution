package typings.aos.mod

import typings.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait Document extends js.Object {
    def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit]): Unit = js.native
    def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit], options: Boolean): Unit = js.native
    def addEventListener(
      `type`: AosEventType,
      listener: js.Function1[/* event */ AosEvent, Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
}

