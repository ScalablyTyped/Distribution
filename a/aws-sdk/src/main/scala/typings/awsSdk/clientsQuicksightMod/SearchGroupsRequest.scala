package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchGroupsRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that the group is in. Currently, you use the ID for the Amazon Web Services account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The structure for the search filters that you want to apply to your search.
    */
  var Filters: GroupSearchFilterList
  
  /**
    * The maximum number of results to return from this request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MaxResults] = js.undefined
  
  /**
    * The namespace that you want to search.
    */
  var Namespace: typings.awsSdk.clientsQuicksightMod.Namespace
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object SearchGroupsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, Filters: GroupSearchFilterList, Namespace: Namespace): SearchGroupsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchGroupsRequest]
  }
  
  extension [Self <: SearchGroupsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: GroupSearchFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: GroupSearchFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
