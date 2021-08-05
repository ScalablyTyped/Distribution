package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandAny extends StObject {
  
  val Command: js.Any
}
object CommandAny {
  
  inline def apply(Command: js.Any): CommandAny = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandAny]
  }
  
  extension [Self <: CommandAny](x: Self) {
    
    inline def setCommand(value: js.Any): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
  }
}
