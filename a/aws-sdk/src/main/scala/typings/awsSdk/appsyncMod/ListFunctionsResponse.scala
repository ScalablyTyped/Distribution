package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionsResponse extends StObject {
  
  /**
    * A list of Function objects.
    */
  var functions: js.UndefOr[Functions] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListFunctionsResponse {
  
  @scala.inline
  def apply(): ListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionsResponse]
  }
  
  @scala.inline
  implicit class ListFunctionsResponseMutableBuilder[Self <: ListFunctionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctions(value: Functions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setFunctionsVarargs(value: FunctionConfiguration*): Self = StObject.set(x, "functions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
