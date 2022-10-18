package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCasesRequest extends StObject {
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The list of field identifiers to be returned as part of the response.
    */
  var fields: js.UndefOr[SearchCasesRequestFieldsList] = js.undefined
  
  /**
    * A list of filter objects.
    */
  var filter: js.UndefOr[CaseFilter] = js.undefined
  
  /**
    * The maximum number of cases to return. The current maximum supported value is 25. This is also the default value when no other value is provided.
    */
  var maxResults: js.UndefOr[SearchCasesRequestMaxResultsInteger] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A word or phrase used to perform a quick search.
    */
  var searchTerm: js.UndefOr[SearchCasesRequestSearchTermString] = js.undefined
  
  /**
    * A list of sorts where each sort specifies a field and their sort order to be applied to the results. 
    */
  var sorts: js.UndefOr[SearchCasesRequestSortsList] = js.undefined
}
object SearchCasesRequest {
  
  inline def apply(domainId: DomainId): SearchCasesRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCasesRequest]
  }
  
  extension [Self <: SearchCasesRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setFields(value: SearchCasesRequestFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldIdentifier*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFilter(value: CaseFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: SearchCasesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSearchTerm(value: SearchCasesRequestSearchTermString): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
    
    inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    
    inline def setSorts(value: SearchCasesRequestSortsList): Self = StObject.set(x, "sorts", value.asInstanceOf[js.Any])
    
    inline def setSortsUndefined: Self = StObject.set(x, "sorts", js.undefined)
    
    inline def setSortsVarargs(value: Sort*): Self = StObject.set(x, "sorts", js.Array(value*))
  }
}
