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
    * The time (in epoch) when the device connection status changed.
    */
  var ConnectionStatusUpdatedTime: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ConnectionStatusUpdatedTime] = js.native
  /**
    * One or more device status detail descriptions.
    */
  var DeviceStatusDetails: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceStatusDetails] = js.native
}

object DeviceStatusInfo {
  @scala.inline
  def apply(): DeviceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusInfo]
  }
  @scala.inline
  implicit class DeviceStatusInfoOps[Self <: DeviceStatusInfo] (val x: Self) extends AnyVal {
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
    def setConnectionStatus(value: ConnectionStatus): Self = this.set("ConnectionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionStatus: Self = this.set("ConnectionStatus", js.undefined)
    @scala.inline
    def setConnectionStatusUpdatedTime(value: ConnectionStatusUpdatedTime): Self = this.set("ConnectionStatusUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionStatusUpdatedTime: Self = this.set("ConnectionStatusUpdatedTime", js.undefined)
    @scala.inline
    def setDeviceStatusDetailsVarargs(value: DeviceStatusDetail*): Self = this.set("DeviceStatusDetails", js.Array(value :_*))
    @scala.inline
    def setDeviceStatusDetails(value: DeviceStatusDetails): Self = this.set("DeviceStatusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceStatusDetails: Self = this.set("DeviceStatusDetails", js.undefined)
  }
  
}

