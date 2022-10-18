package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetedSentimentDetectionJobsRequest extends StObject {
  
  /**
    * Filters the jobs that are returned. You can filter jobs on their name, status, or the date and time that they were submitted. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[TargetedSentimentDetectionJobFilter] = js.undefined
  
  /**
    * The maximum number of results to return in each page. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListTargetedSentimentDetectionJobsRequest {
  
  inline def apply(): ListTargetedSentimentDetectionJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetedSentimentDetectionJobsRequest]
  }
  
  extension [Self <: ListTargetedSentimentDetectionJobsRequest](x: Self) {
    
    inline def setFilter(value: TargetedSentimentDetectionJobFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
