package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionDefinitionVersionsRequest extends StObject {
  
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[string] = js.undefined
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListFunctionDefinitionVersionsRequest {
  
  inline def apply(FunctionDefinitionId: string): ListFunctionDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFunctionDefinitionVersionsRequest]
  }
  
  extension [Self <: ListFunctionDefinitionVersionsRequest](x: Self) {
    
    inline def setFunctionDefinitionId(value: string): Self = StObject.set(x, "FunctionDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: string): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
