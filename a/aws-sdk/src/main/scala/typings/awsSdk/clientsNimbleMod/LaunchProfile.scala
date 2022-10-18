package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchProfile extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that created the launch profile.
    */
  var createdBy: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable description of the launch profile.
    */
  var description: js.UndefOr[LaunchProfileDescription] = js.undefined
  
  /**
    * Unique identifiers for a collection of EC2 subnets.
    */
  var ec2SubnetIds: js.UndefOr[EC2SubnetIdList] = js.undefined
  
  /**
    * The launch profile ID.
    */
  var launchProfileId: js.UndefOr[LaunchProfileId] = js.undefined
  
  /**
    * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
    */
  var launchProfileProtocolVersions: js.UndefOr[LaunchProfileProtocolVersionList] = js.undefined
  
  /**
    * A friendly name for the launch profile.
    */
  var name: js.UndefOr[LaunchProfileName] = js.undefined
  
  /**
    * The current state.
    */
  var state: js.UndefOr[LaunchProfileState] = js.undefined
  
  /**
    * The status code.
    */
  var statusCode: js.UndefOr[LaunchProfileStatusCode] = js.undefined
  
  /**
    * The status message for the launch profile.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * A configuration for a streaming session.
    */
  var streamConfiguration: js.UndefOr[StreamConfiguration] = js.undefined
  
  /**
    * Unique identifiers for a collection of studio components that can be used with this launch profile.
    */
  var studioComponentIds: js.UndefOr[LaunchProfileStudioComponentIdList] = js.undefined
  
  /**
    * A collection of labels, in the form of key:value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that most recently updated the resource.
    */
  var updatedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The list of the latest validation results.
    */
  var validationResults: js.UndefOr[ValidationResults] = js.undefined
}
object LaunchProfile {
  
  inline def apply(): LaunchProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchProfile]
  }
  
  extension [Self <: LaunchProfile](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDescription(value: LaunchProfileDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEc2SubnetIds(value: EC2SubnetIdList): Self = StObject.set(x, "ec2SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setEc2SubnetIdsUndefined: Self = StObject.set(x, "ec2SubnetIds", js.undefined)
    
    inline def setEc2SubnetIdsVarargs(value: EC2SubnetId*): Self = StObject.set(x, "ec2SubnetIds", js.Array(value*))
    
    inline def setLaunchProfileId(value: LaunchProfileId): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileIdUndefined: Self = StObject.set(x, "launchProfileId", js.undefined)
    
    inline def setLaunchProfileProtocolVersions(value: LaunchProfileProtocolVersionList): Self = StObject.set(x, "launchProfileProtocolVersions", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileProtocolVersionsUndefined: Self = StObject.set(x, "launchProfileProtocolVersions", js.undefined)
    
    inline def setLaunchProfileProtocolVersionsVarargs(value: LaunchProfileProtocolVersion*): Self = StObject.set(x, "launchProfileProtocolVersions", js.Array(value*))
    
    inline def setName(value: LaunchProfileName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: LaunchProfileState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusCode(value: LaunchProfileStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStreamConfiguration(value: StreamConfiguration): Self = StObject.set(x, "streamConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStreamConfigurationUndefined: Self = StObject.set(x, "streamConfiguration", js.undefined)
    
    inline def setStudioComponentIds(value: LaunchProfileStudioComponentIdList): Self = StObject.set(x, "studioComponentIds", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentIdsUndefined: Self = StObject.set(x, "studioComponentIds", js.undefined)
    
    inline def setStudioComponentIdsVarargs(value: String*): Self = StObject.set(x, "studioComponentIds", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setUpdatedBy(value: String): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
    
    inline def setValidationResults(value: ValidationResults): Self = StObject.set(x, "validationResults", value.asInstanceOf[js.Any])
    
    inline def setValidationResultsUndefined: Self = StObject.set(x, "validationResults", js.undefined)
    
    inline def setValidationResultsVarargs(value: ValidationResult*): Self = StObject.set(x, "validationResults", js.Array(value*))
  }
}
