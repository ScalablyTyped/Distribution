package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDeviceSyncRequest extends js.Object {
  
  /**
    * The ARN of the device to sync. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  
  /**
    * Request structure to start the device sync. Required.
    */
  var Features: typings.awsSdk.alexaforbusinessMod.Features = js.native
  
  /**
    * The ARN of the room with which the device to sync is associated. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}
object StartDeviceSyncRequest {
  
  @scala.inline
  def apply(Features: Features): StartDeviceSyncRequest = {
    val __obj = js.Dynamic.literal(Features = Features.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeviceSyncRequest]
  }
  
  @scala.inline
  implicit class StartDeviceSyncRequestOps[Self <: StartDeviceSyncRequest] (val x: Self) extends AnyVal {
    
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
    def setFeaturesVarargs(value: Feature*): Self = this.set("Features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: Features): Self = this.set("Features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = this.set("DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceArn: Self = this.set("DeviceArn", js.undefined)
    
    @scala.inline
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomArn: Self = this.set("RoomArn", js.undefined)
  }
}
