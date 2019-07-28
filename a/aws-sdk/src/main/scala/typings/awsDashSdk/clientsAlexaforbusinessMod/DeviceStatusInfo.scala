package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceStatusInfo extends js.Object {
  /**
    * The latest available information about the connection status of a device. 
    */
  var ConnectionStatus: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ConnectionStatus] = js.undefined
  /**
    * One or more device status detail descriptions.
    */
  var DeviceStatusDetails: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeviceStatusDetails] = js.undefined
}

object DeviceStatusInfo {
  @scala.inline
  def apply(ConnectionStatus: ConnectionStatus = null, DeviceStatusDetails: DeviceStatusDetails = null): DeviceStatusInfo = {
    val __obj = js.Dynamic.literal()
    if (ConnectionStatus != null) __obj.updateDynamic("ConnectionStatus")(ConnectionStatus.asInstanceOf[js.Any])
    if (DeviceStatusDetails != null) __obj.updateDynamic("DeviceStatusDetails")(DeviceStatusDetails)
    __obj.asInstanceOf[DeviceStatusInfo]
  }
}

