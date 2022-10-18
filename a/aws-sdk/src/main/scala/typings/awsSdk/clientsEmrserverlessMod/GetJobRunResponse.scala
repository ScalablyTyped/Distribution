package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRunResponse extends StObject {
  
  /**
    * The output displays information about the job run.
    */
  var jobRun: JobRun
}
object GetJobRunResponse {
  
  inline def apply(jobRun: JobRun): GetJobRunResponse = {
    val __obj = js.Dynamic.literal(jobRun = jobRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRunResponse]
  }
  
  extension [Self <: GetJobRunResponse](x: Self) {
    
    inline def setJobRun(value: JobRun): Self = StObject.set(x, "jobRun", value.asInstanceOf[js.Any])
  }
}
