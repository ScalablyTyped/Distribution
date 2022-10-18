package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopKeyPhrasesDetectionJobResponse extends StObject {
  
  /**
    * The identifier of the key phrases detection job to stop.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobId] = js.undefined
  
  /**
    * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopKeyPhrasesDetectionJob operation.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobStatus] = js.undefined
}
object StopKeyPhrasesDetectionJobResponse {
  
  inline def apply(): StopKeyPhrasesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopKeyPhrasesDetectionJobResponse]
  }
  
  extension [Self <: StopKeyPhrasesDetectionJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
