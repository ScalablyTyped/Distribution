package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelCardExportJobsRequest extends StObject {
  
  /**
    * Only list model card export jobs that were created after the time specified.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Only list model card export jobs that were created before the time specified.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of model card export jobs to list.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * Only list model card export jobs with names that contain the specified string.
    */
  var ModelCardExportJobNameContains: js.UndefOr[EntityName] = js.undefined
  
  /**
    * List export jobs for the model card with the specified name.
    */
  var ModelCardName: EntityName
  
  /**
    * List export jobs for the model card with the specified version.
    */
  var ModelCardVersion: js.UndefOr[Integer] = js.undefined
  
  /**
    * If the response to a previous ListModelCardExportJobs request was truncated, the response includes a NextToken. To retrieve the next set of model card export jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * Sort model card export jobs by either name or creation time. Sorts by creation time by default.
    */
  var SortBy: js.UndefOr[ModelCardExportJobSortBy] = js.undefined
  
  /**
    * Sort model card export jobs by ascending or descending order.
    */
  var SortOrder: js.UndefOr[ModelCardExportJobSortOrder] = js.undefined
  
  /**
    * Only list model card export jobs with the specified status.
    */
  var StatusEquals: js.UndefOr[ModelCardExportJobStatus] = js.undefined
}
object ListModelCardExportJobsRequest {
  
  inline def apply(ModelCardName: EntityName): ListModelCardExportJobsRequest = {
    val __obj = js.Dynamic.literal(ModelCardName = ModelCardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelCardExportJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListModelCardExportJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setModelCardExportJobNameContains(value: EntityName): Self = StObject.set(x, "ModelCardExportJobNameContains", value.asInstanceOf[js.Any])
    
    inline def setModelCardExportJobNameContainsUndefined: Self = StObject.set(x, "ModelCardExportJobNameContains", js.undefined)
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersion(value: Integer): Self = StObject.set(x, "ModelCardVersion", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersionUndefined: Self = StObject.set(x, "ModelCardVersion", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: ModelCardExportJobSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: ModelCardExportJobSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStatusEquals(value: ModelCardExportJobStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
