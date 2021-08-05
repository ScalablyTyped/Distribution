package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedKeymapFileReadEvent extends StObject {
  
  /** The error message. */
  var message: String
  
  /** The error stack trace. */
  var stack: String
}
object FailedKeymapFileReadEvent {
  
  inline def apply(message: String, stack: String): FailedKeymapFileReadEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedKeymapFileReadEvent]
  }
  
  extension [Self <: FailedKeymapFileReadEvent](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
