package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a command which can be send to a generic toolbar control.
  * @since OOo 2.0.3
  */
trait ControlCommand extends StObject {
  
  /**
    * specifies a sequence of named values which are used as argument for the command. The number and type of arguments depend on the the command and
    * control.
    */
  var Arguments: SafeArray[NamedValue]
  
  /** specifies the command which should be processed by the toolbar control. */
  var Command: String
}
object ControlCommand {
  
  inline def apply(Arguments: SafeArray[NamedValue], Command: String): ControlCommand = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlCommand] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: SafeArray[NamedValue]): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
  }
}
