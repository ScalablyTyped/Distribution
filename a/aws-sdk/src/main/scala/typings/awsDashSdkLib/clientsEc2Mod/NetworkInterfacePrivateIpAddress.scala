package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfacePrivateIpAddress extends js.Object {
  /**
    * The association information for an Elastic IP address (IPv4) associated with the network interface.
    */
  var Association: js.UndefOr[NetworkInterfaceAssociation] = js.undefined
  /**
    * Indicates whether this IPv4 address is the primary private IPv4 address of the network interface.
    */
  var Primary: js.UndefOr[Boolean] = js.undefined
  /**
    * The private DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  /**
    * The private IPv4 address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}

object NetworkInterfacePrivateIpAddress {
  @scala.inline
  def apply(
    Association: NetworkInterfaceAssociation = null,
    Primary: js.UndefOr[Boolean] = js.undefined,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null
  ): NetworkInterfacePrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association)
    if (!js.isUndefined(Primary)) __obj.updateDynamic("Primary")(Primary)
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    __obj.asInstanceOf[NetworkInterfacePrivateIpAddress]
  }
}

