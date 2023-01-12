package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTargetedSentimentDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the targeted sentiment detection job to stop.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object StopTargetedSentimentDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopTargetedSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTargetedSentimentDetectionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopTargetedSentimentDetectionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
