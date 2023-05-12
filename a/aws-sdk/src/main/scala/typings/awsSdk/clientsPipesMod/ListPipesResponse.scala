package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipesResponse extends StObject {
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPipesMod.NextToken] = js.undefined
  
  /**
    * The pipes returned by the call.
    */
  var Pipes: js.UndefOr[PipeList] = js.undefined
}
object ListPipesResponse {
  
  inline def apply(): ListPipesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPipesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPipes(value: PipeList): Self = StObject.set(x, "Pipes", value.asInstanceOf[js.Any])
    
    inline def setPipesUndefined: Self = StObject.set(x, "Pipes", js.undefined)
    
    inline def setPipesVarargs(value: Pipe*): Self = StObject.set(x, "Pipes", js.Array(value*))
  }
}
