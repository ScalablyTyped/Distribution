package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceSetsResponse extends StObject {
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of ResourceSetSummary objects.
    */
  var ResourceSets: js.UndefOr[ResourceSetSummaryList] = js.undefined
}
object ListResourceSetsResponse {
  
  inline def apply(): ListResourceSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceSetsResponse]
  }
  
  extension [Self <: ListResourceSetsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceSets(value: ResourceSetSummaryList): Self = StObject.set(x, "ResourceSets", value.asInstanceOf[js.Any])
    
    inline def setResourceSetsUndefined: Self = StObject.set(x, "ResourceSets", js.undefined)
    
    inline def setResourceSetsVarargs(value: ResourceSetSummary*): Self = StObject.set(x, "ResourceSets", js.Array(value*))
  }
}
