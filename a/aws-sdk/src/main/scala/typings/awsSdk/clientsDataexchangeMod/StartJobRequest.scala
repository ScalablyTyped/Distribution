package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartJobRequest extends StObject {
  
  /**
    * The unique identifier for a job.
    */
  var JobId: string
}
object StartJobRequest {
  
  inline def apply(JobId: string): StartJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: string): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
