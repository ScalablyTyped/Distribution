package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedKeymapFileReadEvent extends StObject {
  
  /** The error message. */
  var message: String = js.native
  
  /** The error stack trace. */
  var stack: String = js.native
}
object FailedKeymapFileReadEvent {
  
  @scala.inline
  def apply(message: String, stack: String): FailedKeymapFileReadEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedKeymapFileReadEvent]
  }
  
  @scala.inline
  implicit class FailedKeymapFileReadEventMutableBuilder[Self <: FailedKeymapFileReadEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
