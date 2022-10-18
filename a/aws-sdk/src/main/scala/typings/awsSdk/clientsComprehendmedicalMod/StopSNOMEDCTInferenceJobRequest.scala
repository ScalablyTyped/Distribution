package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSNOMEDCTInferenceJobRequest extends StObject {
  
  /**
    *  The job id of the asynchronous InferSNOMEDCT job to be stopped. 
    */
  var JobId: typings.awsSdk.clientsComprehendmedicalMod.JobId
}
object StopSNOMEDCTInferenceJobRequest {
  
  inline def apply(JobId: JobId): StopSNOMEDCTInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSNOMEDCTInferenceJobRequest]
  }
  
  extension [Self <: StopSNOMEDCTInferenceJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
