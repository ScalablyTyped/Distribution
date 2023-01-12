package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCommandsResult extends StObject {
  
  /**
    * (Optional) The list of commands requested by the user. 
    */
  var Commands: js.UndefOr[CommandList] = js.undefined
  
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object ListCommandsResult {
  
  inline def apply(): ListCommandsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCommandsResult] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: CommandList): Self = StObject.set(x, "Commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "Commands", js.undefined)
    
    inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "Commands", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
