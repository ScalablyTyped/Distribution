package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppLaunchConfigurationResponse extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  
  /**
    * Indicates whether the application is configured to launch automatically after replication is complete.
    */
  var autoLaunch: js.UndefOr[AutoLaunch] = js.undefined
  
  /**
    * The name of the service role in the customer's account that CloudFormation uses to launch the application.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  
  /**
    * The launch configurations for server groups in this application.
    */
  var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined
}
object GetAppLaunchConfigurationResponse {
  
  inline def apply(): GetAppLaunchConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppLaunchConfigurationResponse]
  }
  
  extension [Self <: GetAppLaunchConfigurationResponse](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAutoLaunch(value: AutoLaunch): Self = StObject.set(x, "autoLaunch", value.asInstanceOf[js.Any])
    
    inline def setAutoLaunchUndefined: Self = StObject.set(x, "autoLaunch", js.undefined)
    
    inline def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    inline def setServerGroupLaunchConfigurations(value: ServerGroupLaunchConfigurations): Self = StObject.set(x, "serverGroupLaunchConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServerGroupLaunchConfigurationsUndefined: Self = StObject.set(x, "serverGroupLaunchConfigurations", js.undefined)
    
    inline def setServerGroupLaunchConfigurationsVarargs(value: ServerGroupLaunchConfiguration*): Self = StObject.set(x, "serverGroupLaunchConfigurations", js.Array(value*))
  }
}
