package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScriptsOutput extends StObject {
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A set of properties describing the requested script.
    */
  var Scripts: js.UndefOr[ScriptList] = js.undefined
}
object ListScriptsOutput {
  
  inline def apply(): ListScriptsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScriptsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListScriptsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NonEmptyString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScripts(value: ScriptList): Self = StObject.set(x, "Scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "Scripts", js.undefined)
    
    inline def setScriptsVarargs(value: Script*): Self = StObject.set(x, "Scripts", js.Array(value*))
  }
}
