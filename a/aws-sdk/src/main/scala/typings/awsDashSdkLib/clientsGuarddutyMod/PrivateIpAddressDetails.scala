package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateIpAddressDetails extends js.Object {
  /**
    * Private DNS name of the EC2 instance.
    */
  var PrivateDnsName: js.UndefOr[PrivateDnsName] = js.undefined
  /**
    * Private IP address of the EC2 instance.
    */
  var PrivateIpAddress: js.UndefOr[PrivateIpAddress] = js.undefined
}

object PrivateIpAddressDetails {
  @scala.inline
  def apply(PrivateDnsName: PrivateDnsName = null, PrivateIpAddress: PrivateIpAddress = null): PrivateIpAddressDetails = {
    val __obj = js.Dynamic.literal()
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    __obj.asInstanceOf[PrivateIpAddressDetails]
  }
}

