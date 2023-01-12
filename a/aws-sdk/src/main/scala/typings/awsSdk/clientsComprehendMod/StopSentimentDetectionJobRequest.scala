package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSentimentDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the sentiment detection job to stop.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object StopSentimentDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSentimentDetectionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopSentimentDetectionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
