package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportClientVpnClientCertificateRevocationListRequest extends js.Object {
  /**
    * The client certificate revocation list file. For more information, see Generate a Client Certificate Revocation List in the AWS Client VPN Administrator Guide.
    */
  var CertificateRevocationList: String
  /**
    * The ID of the Client VPN endpoint to which the client certificate revocation list applies.
    */
  var ClientVpnEndpointId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object ImportClientVpnClientCertificateRevocationListRequest {
  @scala.inline
  def apply(
    CertificateRevocationList: String,
    ClientVpnEndpointId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ImportClientVpnClientCertificateRevocationListRequest = {
    val __obj = js.Dynamic.literal(CertificateRevocationList = CertificateRevocationList, ClientVpnEndpointId = ClientVpnEndpointId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ImportClientVpnClientCertificateRevocationListRequest]
  }
}

