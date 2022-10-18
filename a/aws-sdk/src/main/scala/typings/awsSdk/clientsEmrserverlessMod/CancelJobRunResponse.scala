package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRunResponse extends StObject {
  
  /**
    * The output contains the application ID on which the job run is cancelled.
    */
  var applicationId: ApplicationId
  
  /**
    * The output contains the ID of the cancelled job run.
    */
  var jobRunId: JobRunId
}
object CancelJobRunResponse {
  
  inline def apply(applicationId: ApplicationId, jobRunId: JobRunId): CancelJobRunResponse = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], jobRunId = jobRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRunResponse]
  }
  
  extension [Self <: CancelJobRunResponse](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setJobRunId(value: JobRunId): Self = StObject.set(x, "jobRunId", value.asInstanceOf[js.Any])
  }
}
