package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStatusInfo extends js.Object {
  /**
    * The latest available information about the connection status of a device. 
    */
  var ConnectionStatus: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ConnectionStatus] = js.native
  /**
    * One or more device status detail descriptions.
    */
  var DeviceStatusDetails: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceStatusDetails] = js.native
}

object DeviceStatusInfo {
  @scala.inline
  def apply(ConnectionStatus: ConnectionStatus = null, DeviceStatusDetails: DeviceStatusDetails = null): DeviceStatusInfo = {
    val __obj = js.Dynamic.literal()
    if (ConnectionStatus != null) __obj.updateDynamic("ConnectionStatus")(ConnectionStatus.asInstanceOf[js.Any])
    if (DeviceStatusDetails != null) __obj.updateDynamic("DeviceStatusDetails")(DeviceStatusDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStatusInfo]
  }
}

