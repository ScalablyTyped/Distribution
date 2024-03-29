package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDominantLanguageDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the dominant language detection job to stop.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object StopDominantLanguageDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopDominantLanguageDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDominantLanguageDetectionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopDominantLanguageDetectionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
