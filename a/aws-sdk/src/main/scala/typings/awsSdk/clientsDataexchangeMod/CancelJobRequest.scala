package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRequest extends StObject {
  
  /**
    * The unique identifier for a job.
    */
  var JobId: _String
}
object CancelJobRequest {
  
  inline def apply(JobId: _String): CancelJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: _String): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
