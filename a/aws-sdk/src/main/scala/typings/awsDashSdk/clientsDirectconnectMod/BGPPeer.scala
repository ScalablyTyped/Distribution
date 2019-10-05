package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BGPPeer extends js.Object {
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
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.undefined
  /**
    * The Direct Connect endpoint on which the BGP peer terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
  /**
    * The ID of the BGP peer.
    */
  var bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined
  /**
    * The state of the BGP peer. The following are the possible values:    verifying: The BGP peering addresses or ASN require validation before the BGP peer can be created. This state applies only to public virtual interfaces.    pending: The BGP peer is created, and remains in this state until it is ready to be established.    available: The BGP peer is ready to be established.    deleting: The BGP peer is being deleted.    deleted: The BGP peer is deleted and cannot be established.  
    */
  var bgpPeerState: js.UndefOr[BGPPeerState] = js.undefined
  /**
    * The status of the BGP peer. The following are the possible values:    up: The BGP peer is established. This state does not indicate the state of the routing function. Ensure that you are receiving routes over the BGP session.    down: The BGP peer is down.    unknown: The BGP peer status is not available.  
    */
  var bgpStatus: js.UndefOr[BGPStatus] = js.undefined
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
}

object BGPPeer {
  @scala.inline
  def apply(
    addressFamily: AddressFamily = null,
    amazonAddress: AmazonAddress = null,
    asn: Int | Double = null,
    authKey: BGPAuthKey = null,
    awsDeviceV2: AwsDeviceV2 = null,
    bgpPeerId: BGPPeerId = null,
    bgpPeerState: BGPPeerState = null,
    bgpStatus: BGPStatus = null,
    customerAddress: CustomerAddress = null
  ): BGPPeer = {
    val __obj = js.Dynamic.literal()
    if (addressFamily != null) __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress)
    if (asn != null) __obj.updateDynamic("asn")(asn.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey)
    if (awsDeviceV2 != null) __obj.updateDynamic("awsDeviceV2")(awsDeviceV2)
    if (bgpPeerId != null) __obj.updateDynamic("bgpPeerId")(bgpPeerId)
    if (bgpPeerState != null) __obj.updateDynamic("bgpPeerState")(bgpPeerState.asInstanceOf[js.Any])
    if (bgpStatus != null) __obj.updateDynamic("bgpStatus")(bgpStatus.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress)
    __obj.asInstanceOf[BGPPeer]
  }
}

