package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceRequest extends StObject {
  
  /**
    * The ARN of the device to retrieve.
    */
  var deviceArn: DeviceArn
}
object GetDeviceRequest {
  
  inline def apply(deviceArn: DeviceArn): GetDeviceRequest = {
    val __obj = js.Dynamic.literal(deviceArn = deviceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceRequest]
  }
  
  extension [Self <: GetDeviceRequest](x: Self) {
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
  }
}
