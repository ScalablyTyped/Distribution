package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostListener extends StObject {
  
  /**
    * A set of arguments to pass to the handler method when the event occurs.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The DOM event to listen for.
    */
  var eventName: js.UndefOr[String] = js.native
}
object HostListener {
  
  @JSImport("@angular/core", "HostListener")
  @js.native
  val ^ : HostListenerDecorator = js.native
  
  @scala.inline
  implicit class HostListenerMutableBuilder[Self <: HostListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
  }
}
