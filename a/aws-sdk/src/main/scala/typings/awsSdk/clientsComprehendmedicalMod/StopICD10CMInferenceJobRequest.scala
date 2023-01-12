package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopICD10CMInferenceJobRequest extends StObject {
  
  /**
    * The identifier of the job.
    */
  var JobId: typings.awsSdk.clientsComprehendmedicalMod.JobId
}
object StopICD10CMInferenceJobRequest {
  
  inline def apply(JobId: JobId): StopICD10CMInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopICD10CMInferenceJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopICD10CMInferenceJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
