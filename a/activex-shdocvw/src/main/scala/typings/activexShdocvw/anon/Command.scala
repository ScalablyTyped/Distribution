package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  val Command: Double
  
  val Enable: Boolean
}
object Command {
  
  @scala.inline
  def apply(Command: Double, Enable: Boolean): Command = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Enable = Enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: Double): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
  }
}
