package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostListenerDecorator
  extends StObject
     with Instantiable1[/* eventName */ String, Any]
     with Instantiable2[/* eventName */ String, /* args */ js.Array[String], Any] {
  
  /**
    * Decorator that declares a DOM event to listen for,
    * and provides a handler method to run when that event occurs.
    *
    * Angular invokes the supplied handler method when the host element emits the specified event,
    * and updates the bound element with the result.
    *
    * If the handler method returns false, applies `preventDefault` on the bound element.
    */
  def apply(eventName: String): Any = js.native
  def apply(eventName: String, args: js.Array[String]): Any = js.native
}
