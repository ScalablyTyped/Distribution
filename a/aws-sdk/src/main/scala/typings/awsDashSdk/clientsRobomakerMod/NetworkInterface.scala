package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[GenericString] = js.native
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var privateIpAddress: js.UndefOr[GenericString] = js.native
  /**
    * The IPv4 public address of the network interface.
    */
  var publicIpAddress: js.UndefOr[GenericString] = js.native
}

object NetworkInterface {
  @scala.inline
  def apply(
    networkInterfaceId: GenericString = null,
    privateIpAddress: GenericString = null,
    publicIpAddress: GenericString = null
  ): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress.asInstanceOf[js.Any])
    if (publicIpAddress != null) __obj.updateDynamic("publicIpAddress")(publicIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterface]
  }
}

