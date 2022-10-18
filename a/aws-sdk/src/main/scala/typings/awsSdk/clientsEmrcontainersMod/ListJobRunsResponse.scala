package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobRunsResponse extends StObject {
  
  /**
    * This output lists information about the specified job runs.
    */
  var jobRuns: js.UndefOr[JobRuns] = js.undefined
  
  /**
    * This output displays the token for the next set of job runs.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListJobRunsResponse {
  
  inline def apply(): ListJobRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobRunsResponse]
  }
  
  extension [Self <: ListJobRunsResponse](x: Self) {
    
    inline def setJobRuns(value: JobRuns): Self = StObject.set(x, "jobRuns", value.asInstanceOf[js.Any])
    
    inline def setJobRunsUndefined: Self = StObject.set(x, "jobRuns", js.undefined)
    
    inline def setJobRunsVarargs(value: JobRun*): Self = StObject.set(x, "jobRuns", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
