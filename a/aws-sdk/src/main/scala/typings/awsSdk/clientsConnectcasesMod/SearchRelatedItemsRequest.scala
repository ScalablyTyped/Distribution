package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRelatedItemsRequest extends StObject {
  
  /**
    * A unique identifier of the case.
    */
  var caseId: CaseId
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The list of types of related items and their parameters to use for filtering.
    */
  var filters: js.UndefOr[SearchRelatedItemsRequestFiltersList] = js.undefined
  
  /**
    * The maximum number of results to return per page.
    */
  var maxResults: js.UndefOr[SearchRelatedItemsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object SearchRelatedItemsRequest {
  
  inline def apply(caseId: CaseId, domainId: DomainId): SearchRelatedItemsRequest = {
    val __obj = js.Dynamic.literal(caseId = caseId.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRelatedItemsRequest]
  }
  
  extension [Self <: SearchRelatedItemsRequest](x: Self) {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: SearchRelatedItemsRequestFiltersList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: RelatedItemTypeFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: SearchRelatedItemsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
