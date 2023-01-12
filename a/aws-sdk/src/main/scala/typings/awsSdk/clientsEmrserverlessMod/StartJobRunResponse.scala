package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartJobRunResponse extends StObject {
  
  /**
    * This output displays the application ID on which the job run was submitted.
    */
  var applicationId: ApplicationId
  
  /**
    * The output lists the execution role ARN of the job run.
    */
  var arn: JobArn
  
  /**
    * The output contains the ID of the started job run.
    */
  var jobRunId: JobRunId
}
object StartJobRunResponse {
  
  inline def apply(applicationId: ApplicationId, arn: JobArn, jobRunId: JobRunId): StartJobRunResponse = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], jobRunId = jobRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartJobRunResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setArn(value: JobArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setJobRunId(value: JobRunId): Self = StObject.set(x, "jobRunId", value.asInstanceOf[js.Any])
  }
}
