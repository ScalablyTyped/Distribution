package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRequest extends StObject {
  
  /**
    * The unique identifier for a job.
    */
  var JobId: _String
}
object GetJobRequest {
  
  inline def apply(JobId: _String): GetJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: _String): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
