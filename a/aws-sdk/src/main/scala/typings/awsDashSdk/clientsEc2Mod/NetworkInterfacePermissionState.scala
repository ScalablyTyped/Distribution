package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfacePermissionState extends js.Object {
  /**
    * The state of the permission.
    */
  var State: js.UndefOr[NetworkInterfacePermissionStateCode] = js.native
  /**
    * A status message, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object NetworkInterfacePermissionState {
  @scala.inline
  def apply(State: NetworkInterfacePermissionStateCode = null, StatusMessage: String = null): NetworkInterfacePermissionState = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfacePermissionState]
  }
}

