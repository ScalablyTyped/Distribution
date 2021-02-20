package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsResult extends StObject {
  
  /**
    *  The result structure for the list job result request. 
    */
  var jobSummaries: JobSummaries = js.native
  
  /**
    *  A pagination token. If non-null the pagination token is returned in a result. Pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListJobsResult {
  
  @scala.inline
  def apply(jobSummaries: JobSummaries): ListJobsResult = {
    val __obj = js.Dynamic.literal(jobSummaries = jobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResult]
  }
  
  @scala.inline
  implicit class ListJobsResultMutableBuilder[Self <: ListJobsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobSummaries(value: JobSummaries): Self = StObject.set(x, "jobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobSummariesVarargs(value: JobSummary*): Self = StObject.set(x, "jobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
