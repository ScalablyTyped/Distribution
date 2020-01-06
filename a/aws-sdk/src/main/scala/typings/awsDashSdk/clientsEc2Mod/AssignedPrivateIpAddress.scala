package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignedPrivateIpAddress extends js.Object {
  /**
    * The private IP address assigned to the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object AssignedPrivateIpAddress {
  @scala.inline
  def apply(PrivateIpAddress: String = null): AssignedPrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignedPrivateIpAddress]
  }
}

