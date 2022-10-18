package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterDevicesRequest extends StObject {
  
  /**
    * The name of the fleet the devices belong to.
    */
  var DeviceFleetName: EntityName
  
  /**
    * The unique IDs of the devices.
    */
  var DeviceNames: typings.awsSdk.clientsSagemakerMod.DeviceNames
}
object DeregisterDevicesRequest {
  
  inline def apply(DeviceFleetName: EntityName, DeviceNames: DeviceNames): DeregisterDevicesRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], DeviceNames = DeviceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterDevicesRequest]
  }
  
  extension [Self <: DeregisterDevicesRequest](x: Self) {
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNames(value: DeviceNames): Self = StObject.set(x, "DeviceNames", value.asInstanceOf[js.Any])
    
    inline def setDeviceNamesVarargs(value: DeviceName*): Self = StObject.set(x, "DeviceNames", js.Array(value*))
  }
}
