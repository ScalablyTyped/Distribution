package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDestinationVpc extends js.Object {
  /**
    * The availability zone of the Input destination.
    */
  var AvailabilityZone: js.UndefOr[__string] = js.native
  /**
    * The network interface ID of the Input destination in the VPC.
    */
  var NetworkInterfaceId: js.UndefOr[__string] = js.native
}

object InputDestinationVpc {
  @scala.inline
  def apply(AvailabilityZone: __string = null, NetworkInterfaceId: __string = null): InputDestinationVpc = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDestinationVpc]
  }
}

