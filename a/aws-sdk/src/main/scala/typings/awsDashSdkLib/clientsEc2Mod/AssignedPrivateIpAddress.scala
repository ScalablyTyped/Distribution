package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignedPrivateIpAddress extends js.Object {
  /**
    * The private IP address assigned to the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}

object AssignedPrivateIpAddress {
  @scala.inline
  def apply(PrivateIpAddress: String = null): AssignedPrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    __obj.asInstanceOf[AssignedPrivateIpAddress]
  }
}

