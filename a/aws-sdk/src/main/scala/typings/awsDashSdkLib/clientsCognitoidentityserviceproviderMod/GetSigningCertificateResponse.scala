package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSigningCertificateResponse extends js.Object {
  /**
    * The signing certificate.
    */
  var Certificate: js.UndefOr[StringType] = js.undefined
}

object GetSigningCertificateResponse {
  @scala.inline
  def apply(Certificate: StringType = null): GetSigningCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    __obj.asInstanceOf[GetSigningCertificateResponse]
  }
}

