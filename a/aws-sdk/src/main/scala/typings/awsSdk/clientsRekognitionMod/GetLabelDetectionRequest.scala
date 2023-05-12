package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLabelDetectionRequest extends StObject {
  
  /**
    * Defines how to aggregate the returned results. Results can be aggregated by timestamps or segments.
    */
  var AggregateBy: js.UndefOr[LabelDetectionAggregateBy] = js.undefined
  
  /**
    * Job identifier for the label detection operation for which you want results returned. You get the job identifer from an initial call to StartlabelDetection.
    */
  var JobId: typings.awsSdk.clientsRekognitionMod.JobId
  
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRekognitionMod.MaxResults] = js.undefined
  
  /**
    * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of labels. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Sort to use for elements in the Labels array. Use TIMESTAMP to sort array elements by the time labels are detected. Use NAME to alphabetically group elements for a label together. Within each label group, the array element are sorted by detection confidence. The default sort is by TIMESTAMP.
    */
  var SortBy: js.UndefOr[LabelDetectionSortBy] = js.undefined
}
object GetLabelDetectionRequest {
  
  inline def apply(JobId: JobId): GetLabelDetectionRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLabelDetectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLabelDetectionRequest] (val x: Self) extends AnyVal {
    
    inline def setAggregateBy(value: LabelDetectionAggregateBy): Self = StObject.set(x, "AggregateBy", value.asInstanceOf[js.Any])
    
    inline def setAggregateByUndefined: Self = StObject.set(x, "AggregateBy", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: LabelDetectionSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
  }
}
