package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerGateway extends js.Object {
  /**
    * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  var BgpAsn: js.UndefOr[String] = js.undefined
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: js.UndefOr[String] = js.undefined
  /**
    * The Internet-routable IP address of the customer gateway's outside interface.
    */
  var IpAddress: js.UndefOr[String] = js.undefined
  /**
    * The current state of the customer gateway (pending | available | deleting | deleted).
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the customer gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The type of VPN connection the customer gateway supports (ipsec.1).
    */
  var Type: js.UndefOr[String] = js.undefined
}

object CustomerGateway {
  @scala.inline
  def apply(
    BgpAsn: String = null,
    CustomerGatewayId: String = null,
    IpAddress: String = null,
    State: String = null,
    Tags: TagList = null,
    Type: String = null
  ): CustomerGateway = {
    val __obj = js.Dynamic.literal()
    if (BgpAsn != null) __obj.updateDynamic("BgpAsn")(BgpAsn)
    if (CustomerGatewayId != null) __obj.updateDynamic("CustomerGatewayId")(CustomerGatewayId)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (State != null) __obj.updateDynamic("State")(State)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[CustomerGateway]
  }
}

