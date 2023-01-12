package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartJobRunRequest extends StObject {
  
  /**
    * The client idempotency token of the job run request. 
    */
  var clientToken: ClientToken
  
  /**
    * The configuration overrides for the job run.
    */
  var configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined
  
  /**
    * The execution role ARN for the job run.
    */
  var executionRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  
  /**
    * The job driver for the job run.
    */
  var jobDriver: js.UndefOr[JobDriver] = js.undefined
  
  /**
    * The job template ID to be used to start the job run.
    */
  var jobTemplateId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The values of job template parameters to start a job run.
    */
  var jobTemplateParameters: js.UndefOr[TemplateParameterInputMap] = js.undefined
  
  /**
    * The name of the job run.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
  
  /**
    * The Amazon EMR release version to use for the job run.
    */
  var releaseLabel: js.UndefOr[ReleaseLabel] = js.undefined
  
  /**
    * The tags assigned to job runs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The virtual cluster ID for which the job run request is submitted.
    */
  var virtualClusterId: ResourceIdString
}
object StartJobRunRequest {
  
  inline def apply(clientToken: ClientToken, virtualClusterId: ResourceIdString): StartJobRunRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], virtualClusterId = virtualClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartJobRunRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverrides(value: ConfigurationOverrides): Self = StObject.set(x, "configurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverridesUndefined: Self = StObject.set(x, "configurationOverrides", js.undefined)
    
    inline def setExecutionRoleArn(value: IAMRoleArn): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
    
    inline def setJobDriver(value: JobDriver): Self = StObject.set(x, "jobDriver", value.asInstanceOf[js.Any])
    
    inline def setJobDriverUndefined: Self = StObject.set(x, "jobDriver", js.undefined)
    
    inline def setJobTemplateId(value: ResourceIdString): Self = StObject.set(x, "jobTemplateId", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateIdUndefined: Self = StObject.set(x, "jobTemplateId", js.undefined)
    
    inline def setJobTemplateParameters(value: TemplateParameterInputMap): Self = StObject.set(x, "jobTemplateParameters", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateParametersUndefined: Self = StObject.set(x, "jobTemplateParameters", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReleaseLabel(value: ReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
    
    inline def setReleaseLabelUndefined: Self = StObject.set(x, "releaseLabel", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
  }
}
