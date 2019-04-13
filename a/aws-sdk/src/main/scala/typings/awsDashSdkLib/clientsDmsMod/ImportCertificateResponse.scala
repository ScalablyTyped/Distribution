package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportCertificateResponse extends js.Object {
  /**
    * The certificate to be uploaded.
    */
  var Certificate: js.UndefOr[Certificate] = js.undefined
}

object ImportCertificateResponse {
  @scala.inline
  def apply(Certificate: Certificate = null): ImportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    __obj.asInstanceOf[ImportCertificateResponse]
  }
}

