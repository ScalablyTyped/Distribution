package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserProfilesRequest extends StObject {
  
  /**
    * A parameter by which to filter the results.
    */
  var DomainIdEquals: js.UndefOr[DomainId] = js.undefined
  
  /**
    * Returns a list up to a specified limit.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The parameter by which to sort the results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[UserProfileSortKey] = js.undefined
  
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
  
  /**
    * A parameter by which to filter the results.
    */
  var UserProfileNameContains: js.UndefOr[UserProfileName] = js.undefined
}
object ListUserProfilesRequest {
  
  inline def apply(): ListUserProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserProfilesRequest]
  }
  
  extension [Self <: ListUserProfilesRequest](x: Self) {
    
    inline def setDomainIdEquals(value: DomainId): Self = StObject.set(x, "DomainIdEquals", value.asInstanceOf[js.Any])
    
    inline def setDomainIdEqualsUndefined: Self = StObject.set(x, "DomainIdEquals", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: UserProfileSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setUserProfileNameContains(value: UserProfileName): Self = StObject.set(x, "UserProfileNameContains", value.asInstanceOf[js.Any])
    
    inline def setUserProfileNameContainsUndefined: Self = StObject.set(x, "UserProfileNameContains", js.undefined)
  }
}
