package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateDeviceFromRoomRequest extends StObject {
  
  /**
    * The ARN of the device to disassociate from a room. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
}
object DisassociateDeviceFromRoomRequest {
  
  @scala.inline
  def apply(): DisassociateDeviceFromRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateDeviceFromRoomRequest]
  }
  
  @scala.inline
  implicit class DisassociateDeviceFromRoomRequestMutableBuilder[Self <: DisassociateDeviceFromRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
  }
}
