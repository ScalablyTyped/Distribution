package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobRequest extends StObject {
  
  /**
    * Request to delete Job from service by Job ID.
    */
  var jobID: JobID
}
object DeleteJobRequest {
  
  inline def apply(jobID: JobID): DeleteJobRequest = {
    val __obj = js.Dynamic.literal(jobID = jobID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobRequest]
  }
  
  extension [Self <: DeleteJobRequest](x: Self) {
    
    inline def setJobID(value: JobID): Self = StObject.set(x, "jobID", value.asInstanceOf[js.Any])
  }
}
