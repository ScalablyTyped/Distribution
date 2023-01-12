package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRunsResponse extends StObject {
  
  /**
    * A list of job-run metadata objects.
    */
  var JobRuns: js.UndefOr[JobRunList] = js.undefined
  
  /**
    * A continuation token, if not all requested job runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object GetJobRunsResponse {
  
  inline def apply(): GetJobRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobRuns(value: JobRunList): Self = StObject.set(x, "JobRuns", value.asInstanceOf[js.Any])
    
    inline def setJobRunsUndefined: Self = StObject.set(x, "JobRuns", js.undefined)
    
    inline def setJobRunsVarargs(value: JobRun*): Self = StObject.set(x, "JobRuns", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
