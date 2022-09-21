package typings.antvGLite

import typings.antvGLite.federatedEventMod.FederatedEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customEventMod {
  
  @JSImport("@antv/g-lite/dist/dom/CustomEvent", "CustomEvent")
  @js.native
  open class CustomEvent protected () extends FederatedEvent[Event, Any] {
    def this(eventName: String) = this()
    def this(eventName: String, `object`: js.Object) = this()
  }
}
