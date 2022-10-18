package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceMethodsRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string
}
object GetDeviceMethodsRequest {
  
  inline def apply(DeviceId: string): GetDeviceMethodsRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceMethodsRequest]
  }
  
  extension [Self <: GetDeviceMethodsRequest](x: Self) {
    
    inline def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
  }
}
