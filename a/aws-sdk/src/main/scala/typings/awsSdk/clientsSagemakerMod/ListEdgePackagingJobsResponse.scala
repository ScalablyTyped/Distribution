package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEdgePackagingJobsResponse extends StObject {
  
  /**
    * Summaries of edge packaging jobs.
    */
  var EdgePackagingJobSummaries: typings.awsSdk.clientsSagemakerMod.EdgePackagingJobSummaries
  
  /**
    * Token to use when calling the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListEdgePackagingJobsResponse {
  
  inline def apply(EdgePackagingJobSummaries: EdgePackagingJobSummaries): ListEdgePackagingJobsResponse = {
    val __obj = js.Dynamic.literal(EdgePackagingJobSummaries = EdgePackagingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEdgePackagingJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEdgePackagingJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setEdgePackagingJobSummaries(value: EdgePackagingJobSummaries): Self = StObject.set(x, "EdgePackagingJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setEdgePackagingJobSummariesVarargs(value: EdgePackagingJobSummary*): Self = StObject.set(x, "EdgePackagingJobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
