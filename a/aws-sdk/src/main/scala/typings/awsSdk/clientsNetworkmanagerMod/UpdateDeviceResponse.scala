package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceResponse extends StObject {
  
  /**
    * Information about the device.
    */
  var Device: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Device] = js.undefined
}
object UpdateDeviceResponse {
  
  inline def apply(): UpdateDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceResponse]
  }
  
  extension [Self <: UpdateDeviceResponse](x: Self) {
    
    inline def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
  }
}
