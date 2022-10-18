package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTransformJobsRequest extends StObject {
  
  /**
    * A filter that returns only transform jobs created after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only transform jobs created before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only transform jobs modified after the specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only transform jobs modified before the specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of transform jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * A string in the transform job name. This filter returns only transform jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NameContains] = js.undefined
  
  /**
    * If the result of the previous ListTransformJobs request was truncated, the response includes a NextToken. To retrieve the next set of transform jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortBy] = js.undefined
  
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
  
  /**
    * A filter that retrieves only transform jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[TransformJobStatus] = js.undefined
}
object ListTransformJobsRequest {
  
  inline def apply(): ListTransformJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransformJobsRequest]
  }
  
  extension [Self <: ListTransformJobsRequest](x: Self) {
    
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
    
    inline def setStatusEquals(value: TransformJobStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
