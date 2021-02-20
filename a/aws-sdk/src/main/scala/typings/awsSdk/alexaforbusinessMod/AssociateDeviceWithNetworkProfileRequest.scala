package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateDeviceWithNetworkProfileRequest extends StObject {
  
  /**
    * The device ARN.
    */
  var DeviceArn: Arn = js.native
  
  /**
    * The ARN of the network profile to associate with a device.
    */
  var NetworkProfileArn: Arn = js.native
}
object AssociateDeviceWithNetworkProfileRequest {
  
  @scala.inline
  def apply(DeviceArn: Arn, NetworkProfileArn: Arn): AssociateDeviceWithNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any], NetworkProfileArn = NetworkProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDeviceWithNetworkProfileRequest]
  }
  
  @scala.inline
  implicit class AssociateDeviceWithNetworkProfileRequestMutableBuilder[Self <: AssociateDeviceWithNetworkProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
  }
}
