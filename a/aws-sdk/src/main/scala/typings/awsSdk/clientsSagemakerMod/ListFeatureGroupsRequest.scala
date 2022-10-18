package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFeatureGroupsRequest extends StObject {
  
  /**
    * Use this parameter to search for FeatureGroupss created after a specific date and time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Use this parameter to search for FeatureGroupss created before a specific date and time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A FeatureGroup status. Filters by FeatureGroup status. 
    */
  var FeatureGroupStatusEquals: js.UndefOr[FeatureGroupStatus] = js.undefined
  
  /**
    * The maximum number of results returned by ListFeatureGroups.
    */
  var MaxResults: js.UndefOr[FeatureGroupMaxResults] = js.undefined
  
  /**
    * A string that partially matches one or more FeatureGroups names. Filters FeatureGroups by name. 
    */
  var NameContains: js.UndefOr[FeatureGroupNameContains] = js.undefined
  
  /**
    * A token to resume pagination of ListFeatureGroups results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * An OfflineStore status. Filters by OfflineStore status. 
    */
  var OfflineStoreStatusEquals: js.UndefOr[OfflineStoreStatusValue] = js.undefined
  
  /**
    * The value on which the feature group list is sorted.
    */
  var SortBy: js.UndefOr[FeatureGroupSortBy] = js.undefined
  
  /**
    * The order in which feature groups are listed.
    */
  var SortOrder: js.UndefOr[FeatureGroupSortOrder] = js.undefined
}
object ListFeatureGroupsRequest {
  
  inline def apply(): ListFeatureGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFeatureGroupsRequest]
  }
  
  extension [Self <: ListFeatureGroupsRequest](x: Self) {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setFeatureGroupStatusEquals(value: FeatureGroupStatus): Self = StObject.set(x, "FeatureGroupStatusEquals", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupStatusEqualsUndefined: Self = StObject.set(x, "FeatureGroupStatusEquals", js.undefined)
    
    inline def setMaxResults(value: FeatureGroupMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: FeatureGroupNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOfflineStoreStatusEquals(value: OfflineStoreStatusValue): Self = StObject.set(x, "OfflineStoreStatusEquals", value.asInstanceOf[js.Any])
    
    inline def setOfflineStoreStatusEqualsUndefined: Self = StObject.set(x, "OfflineStoreStatusEquals", js.undefined)
    
    inline def setSortBy(value: FeatureGroupSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: FeatureGroupSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
