package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudioLifecycleConfigsRequest extends StObject {
  
  /**
    * A parameter to search for the App Type to which the Lifecycle Configuration is attached.
    */
  var AppTypeEquals: js.UndefOr[StudioLifecycleConfigAppType] = js.undefined
  
  /**
    * A filter that returns only Lifecycle Configurations created on or after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only Lifecycle Configurations created on or before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of Studio Lifecycle Configurations to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * A filter that returns only Lifecycle Configurations modified after the specified time.
    */
  var ModifiedTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only Lifecycle Configurations modified before the specified time.
    */
  var ModifiedTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A string in the Lifecycle Configuration name. This filter returns only Lifecycle Configurations whose name contains the specified string.
    */
  var NameContains: js.UndefOr[StudioLifecycleConfigName] = js.undefined
  
  /**
    * If the previous call to ListStudioLifecycleConfigs didn't return the full set of Lifecycle Configurations, the call returns a token for getting the next set of Lifecycle Configurations.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[StudioLifecycleConfigSortKey] = js.undefined
  
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
}
object ListStudioLifecycleConfigsRequest {
  
  inline def apply(): ListStudioLifecycleConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudioLifecycleConfigsRequest]
  }
  
  extension [Self <: ListStudioLifecycleConfigsRequest](x: Self) {
    
    inline def setAppTypeEquals(value: StudioLifecycleConfigAppType): Self = StObject.set(x, "AppTypeEquals", value.asInstanceOf[js.Any])
    
    inline def setAppTypeEqualsUndefined: Self = StObject.set(x, "AppTypeEquals", js.undefined)
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setModifiedTimeAfter(value: js.Date): Self = StObject.set(x, "ModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeAfterUndefined: Self = StObject.set(x, "ModifiedTimeAfter", js.undefined)
    
    inline def setModifiedTimeBefore(value: js.Date): Self = StObject.set(x, "ModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeBeforeUndefined: Self = StObject.set(x, "ModifiedTimeBefore", js.undefined)
    
    inline def setNameContains(value: StudioLifecycleConfigName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: StudioLifecycleConfigSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
