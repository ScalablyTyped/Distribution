package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  val Cancel: Any
  
  val Command: Any
}
object Command {
  
  inline def apply(Cancel: Any, Command: Any): Command = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Any): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Any): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
  }
}
