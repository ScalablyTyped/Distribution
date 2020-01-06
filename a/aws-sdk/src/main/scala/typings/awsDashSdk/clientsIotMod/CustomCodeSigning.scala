package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomCodeSigning extends js.Object {
  /**
    * The certificate chain.
    */
  var certificateChain: js.UndefOr[CodeSigningCertificateChain] = js.native
  /**
    * The hash algorithm used to code sign the file.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.native
  /**
    * The signature for the file.
    */
  var signature: js.UndefOr[CodeSigningSignature] = js.native
  /**
    * The signature algorithm used to code sign the file.
    */
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.native
}

object CustomCodeSigning {
  @scala.inline
  def apply(
    certificateChain: CodeSigningCertificateChain = null,
    hashAlgorithm: HashAlgorithm = null,
    signature: CodeSigningSignature = null,
    signatureAlgorithm: SignatureAlgorithm = null
  ): CustomCodeSigning = {
    val __obj = js.Dynamic.literal()
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (hashAlgorithm != null) __obj.updateDynamic("hashAlgorithm")(hashAlgorithm.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomCodeSigning]
  }
}

