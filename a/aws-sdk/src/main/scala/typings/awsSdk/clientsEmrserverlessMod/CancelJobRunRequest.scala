package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRunRequest extends StObject {
  
  /**
    * The ID of the application on which the job run will be canceled.
    */
  var applicationId: ApplicationId
  
  /**
    * The ID of the job run to cancel.
    */
  var jobRunId: JobRunId
}
object CancelJobRunRequest {
  
  inline def apply(applicationId: ApplicationId, jobRunId: JobRunId): CancelJobRunRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], jobRunId = jobRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRunRequest]
  }
  
  extension [Self <: CancelJobRunRequest](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setJobRunId(value: JobRunId): Self = StObject.set(x, "jobRunId", value.asInstanceOf[js.Any])
  }
}
