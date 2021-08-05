package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  val Cancel: js.Any
  
  val Command: js.Any
}
object Command {
  
  inline def apply(Cancel: js.Any, Command: js.Any): Command = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setCancel(value: js.Any): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: js.Any): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
  }
}
