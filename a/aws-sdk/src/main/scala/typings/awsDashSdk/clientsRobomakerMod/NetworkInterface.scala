package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[GenericString] = js.undefined
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var privateIpAddress: js.UndefOr[GenericString] = js.undefined
  /**
    * The IPv4 public address of the network interface.
    */
  var publicIpAddress: js.UndefOr[GenericString] = js.undefined
}

object NetworkInterface {
  @scala.inline
  def apply(
    networkInterfaceId: GenericString = null,
    privateIpAddress: GenericString = null,
    publicIpAddress: GenericString = null
  ): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress)
    if (publicIpAddress != null) __obj.updateDynamic("publicIpAddress")(publicIpAddress)
    __obj.asInstanceOf[NetworkInterface]
  }
}

