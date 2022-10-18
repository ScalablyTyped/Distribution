package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEntitiesDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the entities detection job to stop.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object StopEntitiesDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEntitiesDetectionJobRequest]
  }
  
  extension [Self <: StopEntitiesDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
