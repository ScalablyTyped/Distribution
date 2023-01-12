package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLambdaFunctionsResponse extends StObject {
  
  /**
    * The Lambdafunction ARNs associated with the specified instance.
    */
  var LambdaFunctions: js.UndefOr[FunctionArnsList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListLambdaFunctionsResponse {
  
  inline def apply(): ListLambdaFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLambdaFunctionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLambdaFunctionsResponse] (val x: Self) extends AnyVal {
    
    inline def setLambdaFunctions(value: FunctionArnsList): Self = StObject.set(x, "LambdaFunctions", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionsUndefined: Self = StObject.set(x, "LambdaFunctions", js.undefined)
    
    inline def setLambdaFunctionsVarargs(value: FunctionArn*): Self = StObject.set(x, "LambdaFunctions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
