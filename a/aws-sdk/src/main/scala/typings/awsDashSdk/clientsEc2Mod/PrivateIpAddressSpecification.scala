package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateIpAddressSpecification extends js.Object {
  /**
    * Indicates whether the private IPv4 address is the primary private IPv4 address. Only one IPv4 address can be designated as primary.
    */
  var Primary: js.UndefOr[Boolean] = js.undefined
  /**
    * The private IPv4 addresses.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}

object PrivateIpAddressSpecification {
  @scala.inline
  def apply(Primary: js.UndefOr[Boolean] = js.undefined, PrivateIpAddress: String = null): PrivateIpAddressSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Primary)) __obj.updateDynamic("Primary")(Primary)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    __obj.asInstanceOf[PrivateIpAddressSpecification]
  }
}

