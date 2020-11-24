package typings.appleMapkitJsBrowser.global.mapkit

import typings.appleMapkitJsBrowser.mapkit.InitializationEvent
import typings.appleMapkitJsBrowser.mapkit.InitializationEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("mapkit.removeEventListener")
@js.native
object removeEventListener extends js.Object {
  
  /**
    * Unsubscribes a listener function from an event type.
    *
    * @param type The type of event (e.g., "configuration-change").
    * @param listener The callback function to remove.
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
