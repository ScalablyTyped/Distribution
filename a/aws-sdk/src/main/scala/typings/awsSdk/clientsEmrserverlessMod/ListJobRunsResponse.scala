package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobRunsResponse extends StObject {
  
  /**
    * The output lists information about the specified job runs.
    */
  var jobRuns: JobRuns
  
  /**
    * The output displays the token for the next set of job run results. This is required for pagination and is available as a response of the previous request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListJobRunsResponse {
  
  inline def apply(jobRuns: JobRuns): ListJobRunsResponse = {
    val __obj = js.Dynamic.literal(jobRuns = jobRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobRuns(value: JobRuns): Self = StObject.set(x, "jobRuns", value.asInstanceOf[js.Any])
    
    inline def setJobRunsVarargs(value: JobRunSummary*): Self = StObject.set(x, "jobRuns", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
