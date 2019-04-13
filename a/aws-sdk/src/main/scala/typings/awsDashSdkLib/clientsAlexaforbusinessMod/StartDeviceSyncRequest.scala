package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDeviceSyncRequest extends js.Object {
  /**
    * The ARN of the device to sync. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
  /**
    * Request structure to start the device sync. Required.
    */
  var Features: awsDashSdkLib.clientsAlexaforbusinessMod.Features
  /**
    * The ARN of the room with which the device to sync is associated. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
}

object StartDeviceSyncRequest {
  @scala.inline
  def apply(Features: Features, DeviceArn: Arn = null, RoomArn: Arn = null): StartDeviceSyncRequest = {
    val __obj = js.Dynamic.literal(Features = Features)
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn)
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    __obj.asInstanceOf[StartDeviceSyncRequest]
  }
}

