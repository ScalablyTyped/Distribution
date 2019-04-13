package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputDestinationVpc extends js.Object {
  /**
    * The availability zone of the Input destination.
    */
  var AvailabilityZone: js.UndefOr[__string] = js.undefined
  /**
    * The network interface ID of the Input destination in the VPC.
    */
  var NetworkInterfaceId: js.UndefOr[__string] = js.undefined
}

object InputDestinationVpc {
  @scala.inline
  def apply(AvailabilityZone: __string = null, NetworkInterfaceId: __string = null): InputDestinationVpc = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    __obj.asInstanceOf[InputDestinationVpc]
  }
}

