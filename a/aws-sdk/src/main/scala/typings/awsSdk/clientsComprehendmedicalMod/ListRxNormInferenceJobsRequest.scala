package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRxNormInferenceJobsRequest extends StObject {
  
  /**
    * Filters the jobs that are returned. You can filter jobs based on their names, status, or the date and time that they were submitted. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListRxNormInferenceJobsRequest {
  
  inline def apply(): ListRxNormInferenceJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRxNormInferenceJobsRequest]
  }
  
  extension [Self <: ListRxNormInferenceJobsRequest](x: Self) {
    
    inline def setFilter(value: ComprehendMedicalAsyncJobFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
