package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerCertificate extends js.Object {
  /**
    * The contents of the public key certificate.
    */
  var CertificateBody: certificateBodyType
  /**
    * The contents of the public key certificate chain.
    */
  var CertificateChain: js.UndefOr[certificateChainType] = js.undefined
  /**
    * The meta information of the server certificate, such as its name, path, ID, and ARN.
    */
  var ServerCertificateMetadata: awsDashSdkLib.clientsIamMod.ServerCertificateMetadata
}

object ServerCertificate {
  @scala.inline
  def apply(
    CertificateBody: certificateBodyType,
    ServerCertificateMetadata: ServerCertificateMetadata,
    CertificateChain: certificateChainType = null
  ): ServerCertificate = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody, ServerCertificateMetadata = ServerCertificateMetadata)
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain)
    __obj.asInstanceOf[ServerCertificate]
  }
}

