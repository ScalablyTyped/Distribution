package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPiiEntitiesDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the PII entities detection job to stop.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object StopPiiEntitiesDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopPiiEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPiiEntitiesDetectionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopPiiEntitiesDetectionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
