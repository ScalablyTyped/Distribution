package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewPublicVirtualInterface extends js.Object {
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
    * The authentication key for BGP configuration.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.undefined
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
  /**
    * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
    */
  var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined
  /**
    * The name of the virtual interface assigned by the customer network.
    */
  var virtualInterfaceName: VirtualInterfaceName
  /**
    * The ID of the VLAN.
    */
  var vlan: VLAN
}

object NewPublicVirtualInterface {
  @scala.inline
  def apply(
    asn: ASN,
    virtualInterfaceName: VirtualInterfaceName,
    vlan: VLAN,
    addressFamily: AddressFamily = null,
    amazonAddress: AmazonAddress = null,
    authKey: BGPAuthKey = null,
    customerAddress: CustomerAddress = null,
    routeFilterPrefixes: RouteFilterPrefixList = null
  ): NewPublicVirtualInterface = {
    val __obj = js.Dynamic.literal(asn = asn, virtualInterfaceName = virtualInterfaceName, vlan = vlan)
    if (addressFamily != null) __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress)
    if (authKey != null) __obj.updateDynamic("authKey")(authKey)
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress)
    if (routeFilterPrefixes != null) __obj.updateDynamic("routeFilterPrefixes")(routeFilterPrefixes)
    __obj.asInstanceOf[NewPublicVirtualInterface]
  }
}

