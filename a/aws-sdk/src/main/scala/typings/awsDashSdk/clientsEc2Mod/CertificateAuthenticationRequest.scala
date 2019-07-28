package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthenticationRequest extends js.Object {
  /**
    * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM).
    */
  var ClientRootCertificateChainArn: js.UndefOr[String] = js.undefined
}

object CertificateAuthenticationRequest {
  @scala.inline
  def apply(ClientRootCertificateChainArn: String = null): CertificateAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    if (ClientRootCertificateChainArn != null) __obj.updateDynamic("ClientRootCertificateChainArn")(ClientRootCertificateChainArn)
    __obj.asInstanceOf[CertificateAuthenticationRequest]
  }
}

