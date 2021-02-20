package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostListenerDecorator
  extends Instantiable1[/* eventName */ String, js.Any]
     with Instantiable2[/* eventName */ String, /* args */ js.Array[String], js.Any] {
  
  /**
    * Decorator that declares a DOM event to listen for,
    * and provides a handler method to run when that event occurs.
    */
  def apply(eventName: String): js.Any = js.native
  def apply(eventName: String, args: js.Array[String]): js.Any = js.native
}
