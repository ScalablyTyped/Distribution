package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewTransitVirtualInterface extends js.Object {
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
  var asn: js.UndefOr[ASN] = js.undefined
  /**
    * The authentication key for BGP configuration.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.undefined
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 8500. The default value is 1500. 
    */
  var mtu: js.UndefOr[MTU] = js.undefined
  /**
    * Any tags assigned to the transit virtual interface.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The name of the virtual interface assigned by the customer network.
    */
  var virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
  /**
    * The ID of the VLAN.
    */
  var vlan: js.UndefOr[VLAN] = js.undefined
}

object NewTransitVirtualInterface {
  @scala.inline
  def apply(
    addressFamily: AddressFamily = null,
    amazonAddress: AmazonAddress = null,
    asn: js.UndefOr[ASN] = js.undefined,
    authKey: BGPAuthKey = null,
    customerAddress: CustomerAddress = null,
    directConnectGatewayId: DirectConnectGatewayId = null,
    mtu: js.UndefOr[MTU] = js.undefined,
    tags: TagList = null,
    virtualInterfaceName: VirtualInterfaceName = null,
    vlan: js.UndefOr[VLAN] = js.undefined
  ): NewTransitVirtualInterface = {
    val __obj = js.Dynamic.literal()
    if (addressFamily != null) __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress)
    if (!js.isUndefined(asn)) __obj.updateDynamic("asn")(asn)
    if (authKey != null) __obj.updateDynamic("authKey")(authKey)
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress)
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId)
    if (!js.isUndefined(mtu)) __obj.updateDynamic("mtu")(mtu)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (virtualInterfaceName != null) __obj.updateDynamic("virtualInterfaceName")(virtualInterfaceName)
    if (!js.isUndefined(vlan)) __obj.updateDynamic("vlan")(vlan)
    __obj.asInstanceOf[NewTransitVirtualInterface]
  }
}

