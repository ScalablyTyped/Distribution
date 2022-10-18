package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnclaimDeviceRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string
}
object UnclaimDeviceRequest {
  
  inline def apply(DeviceId: string): UnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnclaimDeviceRequest]
  }
  
  extension [Self <: UnclaimDeviceRequest](x: Self) {
    
    inline def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
  }
}
