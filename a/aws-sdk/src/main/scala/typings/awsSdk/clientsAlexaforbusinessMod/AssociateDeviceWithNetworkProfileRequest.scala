package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDeviceWithNetworkProfileRequest extends StObject {
  
  /**
    * The device ARN.
    */
  var DeviceArn: Arn
  
  /**
    * The ARN of the network profile to associate with a device.
    */
  var NetworkProfileArn: Arn
}
object AssociateDeviceWithNetworkProfileRequest {
  
  inline def apply(DeviceArn: Arn, NetworkProfileArn: Arn): AssociateDeviceWithNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any], NetworkProfileArn = NetworkProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDeviceWithNetworkProfileRequest]
  }
  
  extension [Self <: AssociateDeviceWithNetworkProfileRequest](x: Self) {
    
    inline def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
  }
}
