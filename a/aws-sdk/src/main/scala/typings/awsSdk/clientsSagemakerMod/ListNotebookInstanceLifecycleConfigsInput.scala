package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotebookInstanceLifecycleConfigsInput extends StObject {
  
  /**
    * A filter that returns only lifecycle configurations that were created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only lifecycle configurations that were created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only lifecycle configurations that were modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only lifecycle configurations that were modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of lifecycle configurations to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * A string in the lifecycle configuration name. This filter returns only lifecycle configurations whose name contains the specified string.
    */
  var NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains] = js.undefined
  
  /**
    * If the result of a ListNotebookInstanceLifecycleConfigs request was truncated, the response includes a NextToken. To get the next set of lifecycle configurations, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * Sorts the list of results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey] = js.undefined
  
  /**
    * The sort order for results.
    */
  var SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder] = js.undefined
}
object ListNotebookInstanceLifecycleConfigsInput {
  
  inline def apply(): ListNotebookInstanceLifecycleConfigsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsInput]
  }
  
  extension [Self <: ListNotebookInstanceLifecycleConfigsInput](x: Self) {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setLastModifiedTimeAfter(value: js.Date): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    inline def setLastModifiedTimeBefore(value: js.Date): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: NotebookInstanceLifecycleConfigNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: NotebookInstanceLifecycleConfigSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: NotebookInstanceLifecycleConfigSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
