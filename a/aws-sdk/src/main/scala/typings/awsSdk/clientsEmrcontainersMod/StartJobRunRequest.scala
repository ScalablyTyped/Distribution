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
  var executionRoleArn: IAMRoleArn
  
  /**
    * The job driver for the job run.
    */
  var jobDriver: JobDriver
  
  /**
    * The name of the job run.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
  
  /**
    * The Amazon EMR release version to use for the job run.
    */
  var releaseLabel: ReleaseLabel
  
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
  
  inline def apply(
    clientToken: ClientToken,
    executionRoleArn: IAMRoleArn,
    jobDriver: JobDriver,
    releaseLabel: ReleaseLabel,
    virtualClusterId: ResourceIdString
  ): StartJobRunRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], jobDriver = jobDriver.asInstanceOf[js.Any], releaseLabel = releaseLabel.asInstanceOf[js.Any], virtualClusterId = virtualClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRunRequest]
  }
  
  extension [Self <: StartJobRunRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverrides(value: ConfigurationOverrides): Self = StObject.set(x, "configurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverridesUndefined: Self = StObject.set(x, "configurationOverrides", js.undefined)
    
    inline def setExecutionRoleArn(value: IAMRoleArn): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setJobDriver(value: JobDriver): Self = StObject.set(x, "jobDriver", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReleaseLabel(value: ReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
  }
}
