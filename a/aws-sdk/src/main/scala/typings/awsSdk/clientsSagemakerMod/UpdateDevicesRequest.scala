package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDevicesRequest extends StObject {
  
  /**
    * The name of the fleet the devices belong to.
    */
  var DeviceFleetName: EntityName
  
  /**
    * List of devices to register with Edge Manager agent.
    */
  var Devices: typings.awsSdk.clientsSagemakerMod.Devices
}
object UpdateDevicesRequest {
  
  inline def apply(DeviceFleetName: EntityName, Devices: Devices): UpdateDevicesRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], Devices = Devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevicesRequest]
  }
  
  extension [Self <: UpdateDevicesRequest](x: Self) {
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDevices(value: Devices): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "Devices", js.Array(value*))
  }
}
