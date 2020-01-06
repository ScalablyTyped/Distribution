package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCertificateResponse extends js.Object {
  /**
    * The Secure Sockets Layer (SSL) certificate.
    */
  var Certificate: js.UndefOr[typings.awsDashSdk.clientsDmsMod.Certificate] = js.native
}

object DeleteCertificateResponse {
  @scala.inline
  def apply(Certificate: Certificate = null): DeleteCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateResponse]
  }
}

