package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(Features: Features, DeviceArn: Arn = null, RoomArn: Arn = null): StartDeviceSyncRequest = {
    val __obj = js.Dynamic.literal(Features = Features.asInstanceOf[js.Any])
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeviceSyncRequest]
  }
}

