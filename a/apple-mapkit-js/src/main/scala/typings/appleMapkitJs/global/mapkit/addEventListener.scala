package typings.appleMapkitJs.global.mapkit

import typings.appleMapkitJs.mapkit.InitializationEvent
import typings.appleMapkitJs.mapkit.InitializationEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.addEventListener")
@js.native
object addEventListener extends js.Object {
  /**
    * Subscribes a listener function to an event type.
    *
    * @param type The type of event (e.g., "configuration-change").
    * @param listener The callback function to invoke. listener is passed an
    * Event as its sole argument.
    * @param thisObject An object set as the this keyword on the listener function.
    */
  def apply[T](
    `type`: InitializationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit]
  ): Unit = js.native
  def apply[T](
    `type`: InitializationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit],
    thisObject: T
  ): Unit = js.native
}

