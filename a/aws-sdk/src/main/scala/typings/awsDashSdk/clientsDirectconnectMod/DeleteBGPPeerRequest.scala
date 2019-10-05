package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBGPPeerRequest extends js.Object {
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  var asn: js.UndefOr[ASN] = js.undefined
  /**
    * The ID of the BGP peer.
    */
  var bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
}

object DeleteBGPPeerRequest {
  @scala.inline
  def apply(
    asn: Int | Double = null,
    bgpPeerId: BGPPeerId = null,
    customerAddress: CustomerAddress = null,
    virtualInterfaceId: VirtualInterfaceId = null
  ): DeleteBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    if (asn != null) __obj.updateDynamic("asn")(asn.asInstanceOf[js.Any])
    if (bgpPeerId != null) __obj.updateDynamic("bgpPeerId")(bgpPeerId)
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress)
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId)
    __obj.asInstanceOf[DeleteBGPPeerRequest]
  }
}

