package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancePrivateIpAddress extends js.Object {
  /**
    * The association information for an Elastic IP address for the network interface.
    */
  var Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.undefined
  /**
    * Indicates whether this IPv4 address is the primary private IP address of the network interface.
    */
  var Primary: js.UndefOr[Boolean] = js.undefined
  /**
    * The private IPv4 DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  /**
    * The private IPv4 address of the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}

object InstancePrivateIpAddress {
  @scala.inline
  def apply(
    Association: InstanceNetworkInterfaceAssociation = null,
    Primary: js.UndefOr[scala.Boolean] = js.undefined,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null
  ): InstancePrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association)
    if (!js.isUndefined(Primary)) __obj.updateDynamic("Primary")(Primary)
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    __obj.asInstanceOf[InstancePrivateIpAddress]
  }
}

