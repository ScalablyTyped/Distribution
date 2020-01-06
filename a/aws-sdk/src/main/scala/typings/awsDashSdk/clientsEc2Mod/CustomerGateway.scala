package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerGateway extends js.Object {
  /**
    * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  var BgpAsn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the customer gateway certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: js.UndefOr[String] = js.native
  /**
    * The name of customer gateway device.
    */
  var DeviceName: js.UndefOr[String] = js.native
  /**
    * The Internet-routable IP address of the customer gateway's outside interface.
    */
  var IpAddress: js.UndefOr[String] = js.native
  /**
    * The current state of the customer gateway (pending | available | deleting | deleted).
    */
  var State: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the customer gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of VPN connection the customer gateway supports (ipsec.1).
    */
  var Type: js.UndefOr[String] = js.native
}

object CustomerGateway {
  @scala.inline
  def apply(
    BgpAsn: String = null,
    CertificateArn: String = null,
    CustomerGatewayId: String = null,
    DeviceName: String = null,
    IpAddress: String = null,
    State: String = null,
    Tags: TagList = null,
    Type: String = null
  ): CustomerGateway = {
    val __obj = js.Dynamic.literal()
    if (BgpAsn != null) __obj.updateDynamic("BgpAsn")(BgpAsn.asInstanceOf[js.Any])
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (CustomerGatewayId != null) __obj.updateDynamic("CustomerGatewayId")(CustomerGatewayId.asInstanceOf[js.Any])
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerGateway]
  }
}

