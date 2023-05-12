package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDevEnvironmentRequest extends StObject {
  
  /**
    * The user-specified alias for the Dev Environment. Changing this value will not cause a restart.
    */
  var alias: js.UndefOr[UpdateDevEnvironmentRequestAliasString] = js.undefined
  
  /**
    * A user-specified idempotency token. Idempotency ensures that an API request completes only once. With an idempotent request, if the original request completes successfully, the subsequent retries return the result from the original successful request and have no additional effect.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The system-generated unique ID of the Dev Environment. 
    */
  var id: Uuid
  
  /**
    * Information about the integrated development environment (IDE) configured for a Dev Environment.
    */
  var ides: js.UndefOr[IdeConfigurationList] = js.undefined
  
  /**
    * The amount of time the Dev Environment will run without any activity detected before stopping, in minutes. Only whole integers are allowed. Dev Environments consume compute minutes when running.  Changing this value will cause a restart of the Dev Environment if it is running. 
    */
  var inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes] = js.undefined
  
  /**
    * The Amazon EC2 instace type to use for the Dev Environment.   Changing this value will cause a restart of the Dev Environment if it is running. 
    */
  var instanceType: js.UndefOr[InstanceType] = js.undefined
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object UpdateDevEnvironmentRequest {
  
  inline def apply(id: Uuid, projectName: NameString, spaceName: NameString): UpdateDevEnvironmentRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDevEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: UpdateDevEnvironmentRequestAliasString): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdes(value: IdeConfigurationList): Self = StObject.set(x, "ides", value.asInstanceOf[js.Any])
    
    inline def setIdesUndefined: Self = StObject.set(x, "ides", js.undefined)
    
    inline def setIdesVarargs(value: IdeConfiguration*): Self = StObject.set(x, "ides", js.Array(value*))
    
    inline def setInactivityTimeoutMinutes(value: InactivityTimeoutMinutes): Self = StObject.set(x, "inactivityTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setInactivityTimeoutMinutesUndefined: Self = StObject.set(x, "inactivityTimeoutMinutes", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
