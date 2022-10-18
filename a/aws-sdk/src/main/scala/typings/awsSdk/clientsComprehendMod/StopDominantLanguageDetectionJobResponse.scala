package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDominantLanguageDetectionJobResponse extends StObject {
  
  /**
    * The identifier of the dominant language detection job to stop.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobId] = js.undefined
  
  /**
    * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopDominantLanguageDetectionJob operation.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobStatus] = js.undefined
}
object StopDominantLanguageDetectionJobResponse {
  
  inline def apply(): StopDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDominantLanguageDetectionJobResponse]
  }
  
  extension [Self <: StopDominantLanguageDetectionJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
