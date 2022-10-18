package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StudioComponent extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration of the studio component, based on component type.
    */
  var configuration: js.UndefOr[StudioComponentConfiguration] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that created the studio component.
    */
  var createdBy: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable description for the studio component resource.
    */
  var description: js.UndefOr[StudioComponentDescription] = js.undefined
  
  /**
    * The EC2 security groups that control access to the studio component.
    */
  var ec2SecurityGroupIds: js.UndefOr[StudioComponentSecurityGroupIdList] = js.undefined
  
  /**
    * Initialization scripts for studio components.
    */
  var initializationScripts: js.UndefOr[StudioComponentInitializationScriptList] = js.undefined
  
  /**
    * A friendly name for the studio component resource.
    */
  var name: js.UndefOr[StudioComponentName] = js.undefined
  
  /**
    * An IAM role attached to a Studio Component that gives the studio component access to AWS resources at anytime while the instance is running. 
    */
  var runtimeRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Parameters for the studio component scripts.
    */
  var scriptParameters: js.UndefOr[StudioComponentScriptParameterKeyValueList] = js.undefined
  
  /**
    * An IAM role attached to Studio Component when the system initialization script runs which give the studio component access to AWS resources when the system initialization script runs.
    */
  var secureInitializationRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The current state.
    */
  var state: js.UndefOr[StudioComponentState] = js.undefined
  
  /**
    * The status code.
    */
  var statusCode: js.UndefOr[StudioComponentStatusCode] = js.undefined
  
  /**
    * The status message for the studio component.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for a studio component resource.
    */
  var studioComponentId: js.UndefOr[StudioComponentId] = js.undefined
  
  /**
    * The specific subtype of a studio component.
    */
  var subtype: js.UndefOr[StudioComponentSubtype] = js.undefined
  
  /**
    * A collection of labels, in the form of key:value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The type of the studio component.
    */
  var `type`: js.UndefOr[StudioComponentType] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that most recently updated the resource.
    */
  var updatedBy: js.UndefOr[String] = js.undefined
}
object StudioComponent {
  
  inline def apply(): StudioComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StudioComponent]
  }
  
  extension [Self <: StudioComponent](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setConfiguration(value: StudioComponentConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDescription(value: StudioComponentDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEc2SecurityGroupIds(value: StudioComponentSecurityGroupIdList): Self = StObject.set(x, "ec2SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setEc2SecurityGroupIdsUndefined: Self = StObject.set(x, "ec2SecurityGroupIds", js.undefined)
    
    inline def setEc2SecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "ec2SecurityGroupIds", js.Array(value*))
    
    inline def setInitializationScripts(value: StudioComponentInitializationScriptList): Self = StObject.set(x, "initializationScripts", value.asInstanceOf[js.Any])
    
    inline def setInitializationScriptsUndefined: Self = StObject.set(x, "initializationScripts", js.undefined)
    
    inline def setInitializationScriptsVarargs(value: StudioComponentInitializationScript*): Self = StObject.set(x, "initializationScripts", js.Array(value*))
    
    inline def setName(value: StudioComponentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRuntimeRoleArn(value: RoleArn): Self = StObject.set(x, "runtimeRoleArn", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRoleArnUndefined: Self = StObject.set(x, "runtimeRoleArn", js.undefined)
    
    inline def setScriptParameters(value: StudioComponentScriptParameterKeyValueList): Self = StObject.set(x, "scriptParameters", value.asInstanceOf[js.Any])
    
    inline def setScriptParametersUndefined: Self = StObject.set(x, "scriptParameters", js.undefined)
    
    inline def setScriptParametersVarargs(value: ScriptParameterKeyValue*): Self = StObject.set(x, "scriptParameters", js.Array(value*))
    
    inline def setSecureInitializationRoleArn(value: RoleArn): Self = StObject.set(x, "secureInitializationRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecureInitializationRoleArnUndefined: Self = StObject.set(x, "secureInitializationRoleArn", js.undefined)
    
    inline def setState(value: StudioComponentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusCode(value: StudioComponentStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStudioComponentId(value: StudioComponentId): Self = StObject.set(x, "studioComponentId", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentIdUndefined: Self = StObject.set(x, "studioComponentId", js.undefined)
    
    inline def setSubtype(value: StudioComponentSubtype): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: StudioComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setUpdatedBy(value: String): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
  }
}
