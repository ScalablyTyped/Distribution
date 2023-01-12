package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceRequest extends StObject {
  
  /**
    * The ARN of the device for which to request details. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
}
object GetDeviceRequest {
  
  inline def apply(): GetDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
  }
}
