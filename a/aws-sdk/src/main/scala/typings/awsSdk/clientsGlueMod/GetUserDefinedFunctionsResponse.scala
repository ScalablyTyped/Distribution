package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserDefinedFunctionsResponse extends StObject {
  
  /**
    * A continuation token, if the list of functions returned does not include the last requested function.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of requested function definitions.
    */
  var UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList] = js.undefined
}
object GetUserDefinedFunctionsResponse {
  
  inline def apply(): GetUserDefinedFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserDefinedFunctionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserDefinedFunctionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUserDefinedFunctions(value: UserDefinedFunctionList): Self = StObject.set(x, "UserDefinedFunctions", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedFunctionsUndefined: Self = StObject.set(x, "UserDefinedFunctions", js.undefined)
    
    inline def setUserDefinedFunctionsVarargs(value: UserDefinedFunction*): Self = StObject.set(x, "UserDefinedFunctions", js.Array(value*))
  }
}
