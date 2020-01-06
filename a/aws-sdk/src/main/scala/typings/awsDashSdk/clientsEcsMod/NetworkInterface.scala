package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /**
    * The attachment ID for the network interface.
    */
  var attachmentId: js.UndefOr[String] = js.native
  /**
    * The private IPv6 address for the network interface.
    */
  var ipv6Address: js.UndefOr[String] = js.native
  /**
    * The private IPv4 address for the network interface.
    */
  var privateIpv4Address: js.UndefOr[String] = js.native
}

object NetworkInterface {
  @scala.inline
  def apply(attachmentId: String = null, ipv6Address: String = null, privateIpv4Address: String = null): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    if (ipv6Address != null) __obj.updateDynamic("ipv6Address")(ipv6Address.asInstanceOf[js.Any])
    if (privateIpv4Address != null) __obj.updateDynamic("privateIpv4Address")(privateIpv4Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterface]
  }
}

