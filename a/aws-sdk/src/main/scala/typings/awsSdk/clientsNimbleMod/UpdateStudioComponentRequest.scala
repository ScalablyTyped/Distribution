package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStudioComponentRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The configuration of the studio component, based on component type.
    */
  var configuration: js.UndefOr[StudioComponentConfiguration] = js.undefined
  
  /**
    * The description.
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
    * The name for the studio component.
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
    * The studio component ID.
    */
  var studioComponentId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
  
  /**
    * The specific subtype of a studio component.
    */
  var subtype: js.UndefOr[StudioComponentSubtype] = js.undefined
  
  /**
    * The type of the studio component.
    */
  var `type`: js.UndefOr[StudioComponentType] = js.undefined
}
object UpdateStudioComponentRequest {
  
  inline def apply(studioComponentId: String, studioId: String): UpdateStudioComponentRequest = {
    val __obj = js.Dynamic.literal(studioComponentId = studioComponentId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStudioComponentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStudioComponentRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setConfiguration(value: StudioComponentConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
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
    
    inline def setStudioComponentId(value: String): Self = StObject.set(x, "studioComponentId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: StudioComponentSubtype): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: StudioComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
