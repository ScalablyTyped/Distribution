package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopKeyPhrasesDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the key phrases detection job to stop.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object StopKeyPhrasesDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopKeyPhrasesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopKeyPhrasesDetectionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopKeyPhrasesDetectionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
