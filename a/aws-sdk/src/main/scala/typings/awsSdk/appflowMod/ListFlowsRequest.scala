package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFlowsRequest extends StObject {
  
  /**
    *  Specifies the maximum number of items that should be returned in the result set. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token for next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFlowsRequest {
  
  inline def apply(): ListFlowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlowsRequest]
  }
  
  extension [Self <: ListFlowsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
