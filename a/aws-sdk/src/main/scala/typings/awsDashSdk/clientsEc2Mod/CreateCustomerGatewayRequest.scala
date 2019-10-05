package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCustomerGatewayRequest extends js.Object {
  /**
    * For devices that support BGP, the customer gateway's BGP ASN. Default: 65000
    */
  var BgpAsn: Integer
  /**
    * The Amazon Resource Name (ARN) for the customer gateway certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  /**
    * The type of VPN connection that this customer gateway supports (ipsec.1).
    */
  var Type: GatewayType
}

object CreateCustomerGatewayRequest {
  @scala.inline
  def apply(
    BgpAsn: Integer,
    Type: GatewayType,
    CertificateArn: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    PublicIp: String = null
  ): CreateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(BgpAsn = BgpAsn, Type = Type.asInstanceOf[js.Any])
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp)
    __obj.asInstanceOf[CreateCustomerGatewayRequest]
  }
}

