package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeviceResponse extends StObject {
  
  /**
    * Information about the device.
    */
  var Device: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Device] = js.undefined
}
object CreateDeviceResponse {
  
  inline def apply(): CreateDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeviceResponse]
  }
  
  extension [Self <: CreateDeviceResponse](x: Self) {
    
    inline def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
  }
}
