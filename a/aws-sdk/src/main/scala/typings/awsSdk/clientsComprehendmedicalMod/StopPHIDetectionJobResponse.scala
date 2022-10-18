package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPHIDetectionJobResponse extends StObject {
  
  /**
    * The identifier of the PHI detection job that was stopped.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.JobId] = js.undefined
}
object StopPHIDetectionJobResponse {
  
  inline def apply(): StopPHIDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPHIDetectionJobResponse]
  }
  
  extension [Self <: StopPHIDetectionJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
