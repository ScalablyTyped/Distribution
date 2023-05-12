package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSettings extends StObject {
  
  /**
    * The Canvas app settings.
    */
  var CanvasAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CanvasAppSettings] = js.undefined
  
  /**
    * The execution role for the user.
    */
  var ExecutionRole: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The Jupyter server's app settings.
    */
  var JupyterServerAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.JupyterServerAppSettings] = js.undefined
  
  /**
    * The kernel gateway app settings.
    */
  var KernelGatewayAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KernelGatewayAppSettings] = js.undefined
  
  /**
    * A collection of settings that configure the RSessionGateway app.
    */
  var RSessionAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RSessionAppSettings] = js.undefined
  
  /**
    * A collection of settings that configure user interaction with the RStudioServerPro app.
    */
  var RStudioServerProAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RStudioServerProAppSettings] = js.undefined
  
  /**
    * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication. Optional when the CreateDomain.AppNetworkAccessType parameter is set to PublicInternetOnly. Required when the CreateDomain.AppNetworkAccessType parameter is set to VpcOnly, unless specified as part of the DefaultUserSettings for the domain. Amazon SageMaker adds a security group to allow NFS traffic from SageMaker Studio. Therefore, the number of security groups that you can specify is one less than the maximum number shown.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * Specifies options for sharing SageMaker Studio notebooks.
    */
  var SharingSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SharingSettings] = js.undefined
  
  /**
    * The TensorBoard app settings.
    */
  var TensorBoardAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TensorBoardAppSettings] = js.undefined
}
object UserSettings {
  
  inline def apply(): UserSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserSettings] (val x: Self) extends AnyVal {
    
    inline def setCanvasAppSettings(value: CanvasAppSettings): Self = StObject.set(x, "CanvasAppSettings", value.asInstanceOf[js.Any])
    
    inline def setCanvasAppSettingsUndefined: Self = StObject.set(x, "CanvasAppSettings", js.undefined)
    
    inline def setExecutionRole(value: RoleArn): Self = StObject.set(x, "ExecutionRole", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleUndefined: Self = StObject.set(x, "ExecutionRole", js.undefined)
    
    inline def setJupyterServerAppSettings(value: JupyterServerAppSettings): Self = StObject.set(x, "JupyterServerAppSettings", value.asInstanceOf[js.Any])
    
    inline def setJupyterServerAppSettingsUndefined: Self = StObject.set(x, "JupyterServerAppSettings", js.undefined)
    
    inline def setKernelGatewayAppSettings(value: KernelGatewayAppSettings): Self = StObject.set(x, "KernelGatewayAppSettings", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayAppSettingsUndefined: Self = StObject.set(x, "KernelGatewayAppSettings", js.undefined)
    
    inline def setRSessionAppSettings(value: RSessionAppSettings): Self = StObject.set(x, "RSessionAppSettings", value.asInstanceOf[js.Any])
    
    inline def setRSessionAppSettingsUndefined: Self = StObject.set(x, "RSessionAppSettings", js.undefined)
    
    inline def setRStudioServerProAppSettings(value: RStudioServerProAppSettings): Self = StObject.set(x, "RStudioServerProAppSettings", value.asInstanceOf[js.Any])
    
    inline def setRStudioServerProAppSettingsUndefined: Self = StObject.set(x, "RStudioServerProAppSettings", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSharingSettings(value: SharingSettings): Self = StObject.set(x, "SharingSettings", value.asInstanceOf[js.Any])
    
    inline def setSharingSettingsUndefined: Self = StObject.set(x, "SharingSettings", js.undefined)
    
    inline def setTensorBoardAppSettings(value: TensorBoardAppSettings): Self = StObject.set(x, "TensorBoardAppSettings", value.asInstanceOf[js.Any])
    
    inline def setTensorBoardAppSettingsUndefined: Self = StObject.set(x, "TensorBoardAppSettings", js.undefined)
  }
}
