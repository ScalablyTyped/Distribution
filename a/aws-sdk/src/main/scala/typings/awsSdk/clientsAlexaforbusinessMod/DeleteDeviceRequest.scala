package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceRequest extends StObject {
  
  /**
    * The ARN of the device for which to request details.
    */
  var DeviceArn: Arn
}
object DeleteDeviceRequest {
  
  inline def apply(DeviceArn: Arn): DeleteDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceRequest]
  }
  
  extension [Self <: DeleteDeviceRequest](x: Self) {
    
    inline def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
  }
}
