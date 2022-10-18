package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateManagedEndpointRequest extends StObject {
  
  /**
    * The certificate ARN provided by users for the managed endpoint. This field is under deprecation and will be removed in future releases.
    */
  var certificateArn: js.UndefOr[ACMCertArn] = js.undefined
  
  /**
    * The client idempotency token for this create call.
    */
  var clientToken: ClientToken
  
  /**
    * The configuration settings that will be used to override existing configurations.
    */
  var configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined
  
  /**
    * The ARN of the execution role.
    */
  var executionRoleArn: IAMRoleArn
  
  /**
    * The name of the managed endpoint.
    */
  var name: ResourceNameString
  
  /**
    * The Amazon EMR release version.
    */
  var releaseLabel: ReleaseLabel
  
  /**
    * The tags of the managed endpoint. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of the managed endpoint.
    */
  var `type`: EndpointType
  
  /**
    * The ID of the virtual cluster for which a managed endpoint is created.
    */
  var virtualClusterId: ResourceIdString
}
object CreateManagedEndpointRequest {
  
  inline def apply(
    clientToken: ClientToken,
    executionRoleArn: IAMRoleArn,
    name: ResourceNameString,
    releaseLabel: ReleaseLabel,
    `type`: EndpointType,
    virtualClusterId: ResourceIdString
  ): CreateManagedEndpointRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], releaseLabel = releaseLabel.asInstanceOf[js.Any], virtualClusterId = virtualClusterId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManagedEndpointRequest]
  }
  
  extension [Self <: CreateManagedEndpointRequest](x: Self) {
    
    inline def setCertificateArn(value: ACMCertArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverrides(value: ConfigurationOverrides): Self = StObject.set(x, "configurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverridesUndefined: Self = StObject.set(x, "configurationOverrides", js.undefined)
    
    inline def setExecutionRoleArn(value: IAMRoleArn): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReleaseLabel(value: ReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: EndpointType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
  }
}
