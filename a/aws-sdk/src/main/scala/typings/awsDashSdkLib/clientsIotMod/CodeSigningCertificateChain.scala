package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeSigningCertificateChain extends js.Object {
  /**
    * The name of the certificate.
    */
  var certificateName: js.UndefOr[CertificateName] = js.undefined
  /**
    * A base64 encoded binary representation of the code signing certificate chain.
    */
  var inlineDocument: js.UndefOr[InlineDocument] = js.undefined
}

object CodeSigningCertificateChain {
  @scala.inline
  def apply(certificateName: CertificateName = null, inlineDocument: InlineDocument = null): CodeSigningCertificateChain = {
    val __obj = js.Dynamic.literal()
    if (certificateName != null) __obj.updateDynamic("certificateName")(certificateName)
    if (inlineDocument != null) __obj.updateDynamic("inlineDocument")(inlineDocument)
    __obj.asInstanceOf[CodeSigningCertificateChain]
  }
}

