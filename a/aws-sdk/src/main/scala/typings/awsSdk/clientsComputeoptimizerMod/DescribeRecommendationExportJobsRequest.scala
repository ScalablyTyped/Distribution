package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommendationExportJobsRequest extends StObject {
  
  /**
    * An array of objects to specify a filter that returns a more specific list of export jobs.
    */
  var filters: js.UndefOr[JobFilters] = js.undefined
  
  /**
    * The identification numbers of the export jobs to return. An export job ID is returned when you create an export using the ExportAutoScalingGroupRecommendations or ExportEC2InstanceRecommendations actions. All export jobs created in the last seven days are returned if this parameter is omitted.
    */
  var jobIds: js.UndefOr[JobIds] = js.undefined
  
  /**
    * The maximum number of export jobs to return with a single request. To retrieve the remaining results, make another request with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to advance to the next page of export jobs.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeRecommendationExportJobsRequest {
  
  inline def apply(): DescribeRecommendationExportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationExportJobsRequest]
  }
  
  extension [Self <: DescribeRecommendationExportJobsRequest](x: Self) {
    
    inline def setFilters(value: JobFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: JobFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setJobIds(value: JobIds): Self = StObject.set(x, "jobIds", value.asInstanceOf[js.Any])
    
    inline def setJobIdsUndefined: Self = StObject.set(x, "jobIds", js.undefined)
    
    inline def setJobIdsVarargs(value: JobId*): Self = StObject.set(x, "jobIds", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
