package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceRequest extends StObject {
  
  /**
    * The device's ID.
    */
  var DeviceId: typings.awsSdk.clientsPanoramaMod.DeviceId
}
object DeleteDeviceRequest {
  
  inline def apply(DeviceId: DeviceId): DeleteDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceRequest]
  }
  
  extension [Self <: DeleteDeviceRequest](x: Self) {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
  }
}
