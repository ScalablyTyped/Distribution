package typings.awsSdk.clientsIot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicesInPlacementResponse extends StObject {
  
  /**
    * An object containing the devices (zero or more) within the placement.
    */
  var devices: DeviceMap
}
object GetDevicesInPlacementResponse {
  
  inline def apply(devices: DeviceMap): GetDevicesInPlacementResponse = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicesInPlacementResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDevicesInPlacementResponse] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: DeviceMap): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
