package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsResponse extends StObject {
  
  /**
    * A list of job summaries that match the request.
    */
  var jobSummaryList: JobSummaryList
  
  /**
    * The nextToken value to include in a future ListJobs request. When the results of a ListJobs request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListJobsResponse {
  
  inline def apply(jobSummaryList: JobSummaryList): ListJobsResponse = {
    val __obj = js.Dynamic.literal(jobSummaryList = jobSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobSummaryList(value: JobSummaryList): Self = StObject.set(x, "jobSummaryList", value.asInstanceOf[js.Any])
    
    inline def setJobSummaryListVarargs(value: JobSummary*): Self = StObject.set(x, "jobSummaryList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
