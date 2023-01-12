package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceFleetRequest extends StObject {
  
  /**
    * Description of the fleet.
    */
  var Description: js.UndefOr[DeviceFleetDescription] = js.undefined
  
  /**
    * The name of the fleet.
    */
  var DeviceFleetName: EntityName
  
  /**
    * Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the role alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}". For example, if your device fleet is called "demo-fleet", the name of the role alias will be "SageMakerEdge-demo-fleet".
    */
  var EnableIotRoleAlias: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EnableIotRoleAlias] = js.undefined
  
  /**
    * Output configuration for storing sample data collected by the fleet.
    */
  var OutputConfig: EdgeOutputConfig
  
  /**
    * The Amazon Resource Name (ARN) of the device.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
}
object UpdateDeviceFleetRequest {
  
  inline def apply(DeviceFleetName: EntityName, OutputConfig: EdgeOutputConfig): UpdateDeviceFleetRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDeviceFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: DeviceFleetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setEnableIotRoleAlias(value: EnableIotRoleAlias): Self = StObject.set(x, "EnableIotRoleAlias", value.asInstanceOf[js.Any])
    
    inline def setEnableIotRoleAliasUndefined: Self = StObject.set(x, "EnableIotRoleAlias", js.undefined)
    
    inline def setOutputConfig(value: EdgeOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
