package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeviceFleetRequest extends StObject {
  
  /**
    * A description of the fleet.
    */
  var Description: js.UndefOr[DeviceFleetDescription] = js.undefined
  
  /**
    * The name of the fleet that the device belongs to.
    */
  var DeviceFleetName: EntityName
  
  /**
    * Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the role alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}". For example, if your device fleet is called "demo-fleet", the name of the role alias will be "SageMakerEdge-demo-fleet".
    */
  var EnableIotRoleAlias: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EnableIotRoleAlias] = js.undefined
  
  /**
    * The output configuration for storing sample data collected by the fleet.
    */
  var OutputConfig: EdgeOutputConfig
  
  /**
    * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  /**
    * Creates tags for the specified fleet.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDeviceFleetRequest {
  
  inline def apply(DeviceFleetName: EntityName, OutputConfig: EdgeOutputConfig): CreateDeviceFleetRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeviceFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeviceFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: DeviceFleetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setEnableIotRoleAlias(value: EnableIotRoleAlias): Self = StObject.set(x, "EnableIotRoleAlias", value.asInstanceOf[js.Any])
    
    inline def setEnableIotRoleAliasUndefined: Self = StObject.set(x, "EnableIotRoleAlias", js.undefined)
    
    inline def setOutputConfig(value: EdgeOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
