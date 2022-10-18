package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFiltersRequest extends StObject {
  
  /**
    * The action the filter applies to matched findings.
    */
  var action: js.UndefOr[FilterAction] = js.undefined
  
  /**
    * The Amazon resource number (ARN) of the filter.
    */
  var arns: js.UndefOr[FilterArnList] = js.undefined
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[ListFilterMaxResults] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFiltersRequest {
  
  inline def apply(): ListFiltersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFiltersRequest]
  }
  
  extension [Self <: ListFiltersRequest](x: Self) {
    
    inline def setAction(value: FilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setArns(value: FilterArnList): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
    
    inline def setArnsUndefined: Self = StObject.set(x, "arns", js.undefined)
    
    inline def setArnsVarargs(value: FilterArn*): Self = StObject.set(x, "arns", js.Array(value*))
    
    inline def setMaxResults(value: ListFilterMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
