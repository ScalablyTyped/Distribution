package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBulkImportJobsResponse extends StObject {
  
  /**
    * One or more job summaries to list.
    */
  var jobSummaries: JobSummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBulkImportJobsResponse {
  
  inline def apply(jobSummaries: JobSummaries): ListBulkImportJobsResponse = {
    val __obj = js.Dynamic.literal(jobSummaries = jobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBulkImportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBulkImportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobSummaries(value: JobSummaries): Self = StObject.set(x, "jobSummaries", value.asInstanceOf[js.Any])
    
    inline def setJobSummariesVarargs(value: JobSummary*): Self = StObject.set(x, "jobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
