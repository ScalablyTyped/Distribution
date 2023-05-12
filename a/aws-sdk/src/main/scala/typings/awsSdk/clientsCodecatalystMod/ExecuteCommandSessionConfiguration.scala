package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCommandSessionConfiguration extends StObject {
  
  /**
    * An array of arguments containing arguments and members.
    */
  var arguments: js.UndefOr[ExecuteCommandSessionConfigurationArguments] = js.undefined
  
  /**
    * The command used at the beginning of the SSH session to a Dev Environment.
    */
  var command: ExecuteCommandSessionConfigurationCommandString
}
object ExecuteCommandSessionConfiguration {
  
  inline def apply(command: ExecuteCommandSessionConfigurationCommandString): ExecuteCommandSessionConfiguration = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteCommandSessionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteCommandSessionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: ExecuteCommandSessionConfigurationArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: ExecuteCommandSessionConfigurationArgumentsMemberString*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCommand(value: ExecuteCommandSessionConfigurationCommandString): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
