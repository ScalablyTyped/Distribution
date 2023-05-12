package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSpaceSettings extends StObject {
  
  /**
    * The ARN of the execution role for the space.
    */
  var ExecutionRole: js.UndefOr[RoleArn] = js.undefined
  
  var JupyterServerAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.JupyterServerAppSettings] = js.undefined
  
  var KernelGatewayAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KernelGatewayAppSettings] = js.undefined
  
  /**
    * The security group IDs for the Amazon Virtual Private Cloud that the space uses for communication.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.undefined
}
object DefaultSpaceSettings {
  
  inline def apply(): DefaultSpaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSpaceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultSpaceSettings] (val x: Self) extends AnyVal {
    
    inline def setExecutionRole(value: RoleArn): Self = StObject.set(x, "ExecutionRole", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleUndefined: Self = StObject.set(x, "ExecutionRole", js.undefined)
    
    inline def setJupyterServerAppSettings(value: JupyterServerAppSettings): Self = StObject.set(x, "JupyterServerAppSettings", value.asInstanceOf[js.Any])
    
    inline def setJupyterServerAppSettingsUndefined: Self = StObject.set(x, "JupyterServerAppSettings", js.undefined)
    
    inline def setKernelGatewayAppSettings(value: KernelGatewayAppSettings): Self = StObject.set(x, "KernelGatewayAppSettings", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayAppSettingsUndefined: Self = StObject.set(x, "KernelGatewayAppSettings", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
  }
}
