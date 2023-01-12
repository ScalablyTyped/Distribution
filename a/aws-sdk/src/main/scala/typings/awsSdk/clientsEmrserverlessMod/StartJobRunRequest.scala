package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartJobRunRequest extends StObject {
  
  /**
    * The ID of the application on which to run the job.
    */
  var applicationId: ApplicationId
  
  /**
    * The client idempotency token of the job run to start. Its value must be unique for each request.
    */
  var clientToken: ClientToken
  
  /**
    * The configuration overrides for the job run.
    */
  var configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined
  
  /**
    * The execution role ARN for the job run.
    */
  var executionRoleArn: IAMRoleArn
  
  /**
    * The maximum duration for the job run to run. If the job run runs beyond this duration, it will be automatically cancelled.
    */
  var executionTimeoutMinutes: js.UndefOr[Duration] = js.undefined
  
  /**
    * The job driver for the job run.
    */
  var jobDriver: js.UndefOr[JobDriver] = js.undefined
  
  /**
    * The optional job run name. This doesn't have to be unique.
    */
  var name: js.UndefOr[String256] = js.undefined
  
  /**
    * The tags assigned to the job run.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object StartJobRunRequest {
  
  inline def apply(applicationId: ApplicationId, clientToken: ClientToken, executionRoleArn: IAMRoleArn): StartJobRunRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartJobRunRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverrides(value: ConfigurationOverrides): Self = StObject.set(x, "configurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverridesUndefined: Self = StObject.set(x, "configurationOverrides", js.undefined)
    
    inline def setExecutionRoleArn(value: IAMRoleArn): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeoutMinutes(value: Duration): Self = StObject.set(x, "executionTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeoutMinutesUndefined: Self = StObject.set(x, "executionTimeoutMinutes", js.undefined)
    
    inline def setJobDriver(value: JobDriver): Self = StObject.set(x, "jobDriver", value.asInstanceOf[js.Any])
    
    inline def setJobDriverUndefined: Self = StObject.set(x, "jobDriver", js.undefined)
    
    inline def setName(value: String256): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
