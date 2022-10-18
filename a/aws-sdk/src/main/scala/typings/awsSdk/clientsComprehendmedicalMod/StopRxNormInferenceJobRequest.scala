package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRxNormInferenceJobRequest extends StObject {
  
  /**
    * The identifier of the job.
    */
  var JobId: typings.awsSdk.clientsComprehendmedicalMod.JobId
}
object StopRxNormInferenceJobRequest {
  
  inline def apply(JobId: JobId): StopRxNormInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRxNormInferenceJobRequest]
  }
  
  extension [Self <: StopRxNormInferenceJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
