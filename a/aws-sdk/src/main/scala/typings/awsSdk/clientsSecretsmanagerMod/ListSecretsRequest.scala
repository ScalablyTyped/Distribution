package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecretsRequest extends StObject {
  
  /**
    * The filters to apply to the list of secrets.
    */
  var Filters: js.UndefOr[FiltersListType] = js.undefined
  
  /**
    * The number of results to include in the response. If there are more results available, in the response, Secrets Manager includes NextToken. To get the next results, call ListSecrets again with the value from NextToken.
    */
  var MaxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * A token that indicates where the output should continue from, if a previous call did not show all results. To get the next results, call ListSecrets again with this value.
    */
  var NextToken: js.UndefOr[NextTokenType] = js.undefined
  
  /**
    * Lists secrets in the requested order. 
    */
  var SortOrder: js.UndefOr[SortOrderType] = js.undefined
}
object ListSecretsRequest {
  
  inline def apply(): ListSecretsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecretsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecretsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FiltersListType): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortOrder(value: SortOrderType): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
