package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrainingJobsRequest extends StObject {
  
  /**
    * A filter that returns only training jobs created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only training jobs created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only training jobs modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only training jobs modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of training jobs to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * A string in the training job name. This filter returns only training jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NameContains] = js.undefined
  
  /**
    * If the result of the previous ListTrainingJobs request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortBy] = js.undefined
  
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
  
  /**
    * A filter that retrieves only training jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined
  
  /**
    * A filter that retrieves only training jobs with a specific warm pool status.
    */
  var WarmPoolStatusEquals: js.UndefOr[WarmPoolResourceStatus] = js.undefined
}
object ListTrainingJobsRequest {
  
  inline def apply(): ListTrainingJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrainingJobsRequest]
  }
  
  extension [Self <: ListTrainingJobsRequest](x: Self) {
    
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
    
    inline def setNameContains(value: NameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: SortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStatusEquals(value: TrainingJobStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
    
    inline def setWarmPoolStatusEquals(value: WarmPoolResourceStatus): Self = StObject.set(x, "WarmPoolStatusEquals", value.asInstanceOf[js.Any])
    
    inline def setWarmPoolStatusEqualsUndefined: Self = StObject.set(x, "WarmPoolStatusEquals", js.undefined)
  }
}
