package typings.awsSdk.alexaforbusinessMod

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
  
  @scala.inline
  def apply(DeviceArn: Arn): DeleteDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceRequest]
  }
  
  @scala.inline
  implicit class DeleteDeviceRequestMutableBuilder[Self <: DeleteDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
  }
}
