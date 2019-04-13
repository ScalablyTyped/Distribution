package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCertificateResponse extends js.Object {
  /**
    * The Secure Sockets Layer (SSL) certificate.
    */
  var Certificate: js.UndefOr[Certificate] = js.undefined
}

object DeleteCertificateResponse {
  @scala.inline
  def apply(Certificate: Certificate = null): DeleteCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    __obj.asInstanceOf[DeleteCertificateResponse]
  }
}

