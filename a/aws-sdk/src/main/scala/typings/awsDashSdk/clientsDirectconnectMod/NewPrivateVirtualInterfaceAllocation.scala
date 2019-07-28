package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewPrivateVirtualInterfaceAllocation extends js.Object {
  /**
    * The address family for the BGP peer.
    */
  var addressFamily: js.UndefOr[AddressFamily] = js.undefined
  /**
    * The IP address assigned to the Amazon interface.
    */
  var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  var asn: ASN
  /**
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.undefined
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.undefined
  /**
    * Any tags assigned to the private virtual interface to be provisioned on a connection.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The name of the virtual interface assigned by the customer network.
    */
  var virtualInterfaceName: VirtualInterfaceName
  /**
    * The ID of the VLAN.
    */
  var vlan: VLAN
}

object NewPrivateVirtualInterfaceAllocation {
  @scala.inline
  def apply(
    asn: ASN,
    virtualInterfaceName: VirtualInterfaceName,
    vlan: VLAN,
    addressFamily: AddressFamily = null,
    amazonAddress: AmazonAddress = null,
    authKey: BGPAuthKey = null,
    customerAddress: CustomerAddress = null,
    mtu: js.UndefOr[MTU] = js.undefined,
    tags: TagList = null
  ): NewPrivateVirtualInterfaceAllocation = {
    val __obj = js.Dynamic.literal(asn = asn, virtualInterfaceName = virtualInterfaceName, vlan = vlan)
    if (addressFamily != null) __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress)
    if (authKey != null) __obj.updateDynamic("authKey")(authKey)
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress)
    if (!js.isUndefined(mtu)) __obj.updateDynamic("mtu")(mtu)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[NewPrivateVirtualInterfaceAllocation]
  }
}

