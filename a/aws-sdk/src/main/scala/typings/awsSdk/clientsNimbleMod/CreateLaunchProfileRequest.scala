package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchProfileRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The description.
    */
  var description: js.UndefOr[LaunchProfileDescription] = js.undefined
  
  /**
    * Specifies the IDs of the EC2 subnets where streaming sessions will be accessible from. These subnets must support the specified instance types. 
    */
  var ec2SubnetIds: EC2SubnetIdList
  
  /**
    * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
    */
  var launchProfileProtocolVersions: LaunchProfileProtocolVersionList
  
  /**
    * The name for the launch profile.
    */
  var name: LaunchProfileName
  
  /**
    * A configuration for a streaming session.
    */
  var streamConfiguration: StreamConfigurationCreate
  
  /**
    * Unique identifiers for a collection of studio components that can be used with this launch profile.
    */
  var studioComponentIds: LaunchProfileStudioComponentIdList
  
  /**
    * The studio ID. 
    */
  var studioId: String
  
  /**
    * A collection of labels, in the form of key:value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateLaunchProfileRequest {
  
  inline def apply(
    ec2SubnetIds: EC2SubnetIdList,
    launchProfileProtocolVersions: LaunchProfileProtocolVersionList,
    name: LaunchProfileName,
    streamConfiguration: StreamConfigurationCreate,
    studioComponentIds: LaunchProfileStudioComponentIdList,
    studioId: String
  ): CreateLaunchProfileRequest = {
    val __obj = js.Dynamic.literal(ec2SubnetIds = ec2SubnetIds.asInstanceOf[js.Any], launchProfileProtocolVersions = launchProfileProtocolVersions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], streamConfiguration = streamConfiguration.asInstanceOf[js.Any], studioComponentIds = studioComponentIds.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchProfileRequest]
  }
  
  extension [Self <: CreateLaunchProfileRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: LaunchProfileDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEc2SubnetIds(value: EC2SubnetIdList): Self = StObject.set(x, "ec2SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setEc2SubnetIdsVarargs(value: EC2SubnetId*): Self = StObject.set(x, "ec2SubnetIds", js.Array(value*))
    
    inline def setLaunchProfileProtocolVersions(value: LaunchProfileProtocolVersionList): Self = StObject.set(x, "launchProfileProtocolVersions", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileProtocolVersionsVarargs(value: LaunchProfileProtocolVersion*): Self = StObject.set(x, "launchProfileProtocolVersions", js.Array(value*))
    
    inline def setName(value: LaunchProfileName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStreamConfiguration(value: StreamConfigurationCreate): Self = StObject.set(x, "streamConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentIds(value: LaunchProfileStudioComponentIdList): Self = StObject.set(x, "studioComponentIds", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentIdsVarargs(value: String*): Self = StObject.set(x, "studioComponentIds", js.Array(value*))
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
