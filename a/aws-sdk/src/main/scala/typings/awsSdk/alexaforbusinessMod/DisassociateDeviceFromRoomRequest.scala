package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateDeviceFromRoomRequest extends js.Object {
  
  /**
    * The ARN of the device to disassociate from a room. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
}
object DisassociateDeviceFromRoomRequest {
  
  @scala.inline
  def apply(): DisassociateDeviceFromRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateDeviceFromRoomRequest]
  }
  
  @scala.inline
  implicit class DisassociateDeviceFromRoomRequestOps[Self <: DisassociateDeviceFromRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = this.set("DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceArn: Self = this.set("DeviceArn", js.undefined)
  }
}
