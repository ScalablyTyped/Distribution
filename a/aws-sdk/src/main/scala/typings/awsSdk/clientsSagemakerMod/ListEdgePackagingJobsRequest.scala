package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEdgePackagingJobsRequest extends StObject {
  
  /**
    * Select jobs where the job was created after specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Select jobs where the job was created before specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Select jobs where the job was updated after specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Select jobs where the job was updated before specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Maximum number of results to select.
    */
  var MaxResults: js.UndefOr[ListMaxResults] = js.undefined
  
  /**
    * Filter for jobs where the model name contains this string.
    */
  var ModelNameContains: js.UndefOr[NameContains] = js.undefined
  
  /**
    * Filter for jobs containing this name in their packaging job name.
    */
  var NameContains: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NameContains] = js.undefined
  
  /**
    * The response from the last list when returning a list large enough to need tokening.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * Use to specify what column to sort by.
    */
  var SortBy: js.UndefOr[ListEdgePackagingJobsSortBy] = js.undefined
  
  /**
    * What direction to sort by.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
  
  /**
    * The job status to filter for.
    */
  var StatusEquals: js.UndefOr[EdgePackagingJobStatus] = js.undefined
}
object ListEdgePackagingJobsRequest {
  
  inline def apply(): ListEdgePackagingJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEdgePackagingJobsRequest]
  }
  
  extension [Self <: ListEdgePackagingJobsRequest](x: Self) {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setLastModifiedTimeAfter(value: js.Date): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    inline def setLastModifiedTimeBefore(value: js.Date): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    inline def setMaxResults(value: ListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setModelNameContains(value: NameContains): Self = StObject.set(x, "ModelNameContains", value.asInstanceOf[js.Any])
    
    inline def setModelNameContainsUndefined: Self = StObject.set(x, "ModelNameContains", js.undefined)
    
    inline def setNameContains(value: NameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: ListEdgePackagingJobsSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStatusEquals(value: EdgePackagingJobStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
