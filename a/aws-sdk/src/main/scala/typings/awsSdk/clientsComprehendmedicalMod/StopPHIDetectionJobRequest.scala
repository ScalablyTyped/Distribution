package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPHIDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the PHI detection job to stop.
    */
  var JobId: typings.awsSdk.clientsComprehendmedicalMod.JobId
}
object StopPHIDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopPHIDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPHIDetectionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopPHIDetectionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
