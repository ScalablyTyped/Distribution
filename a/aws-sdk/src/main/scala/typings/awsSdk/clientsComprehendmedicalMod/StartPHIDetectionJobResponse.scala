package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPHIDetectionJobResponse extends StObject {
  
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the DescribePHIDetectionJob operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.JobId] = js.undefined
}
object StartPHIDetectionJobResponse {
  
  inline def apply(): StartPHIDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPHIDetectionJobResponse]
  }
  
  extension [Self <: StartPHIDetectionJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
