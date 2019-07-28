package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomCodeSigning extends js.Object {
  /**
    * The certificate chain.
    */
  var certificateChain: js.UndefOr[CodeSigningCertificateChain] = js.undefined
  /**
    * The hash algorithm used to code sign the file.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined
  /**
    * The signature for the file.
    */
  var signature: js.UndefOr[CodeSigningSignature] = js.undefined
  /**
    * The signature algorithm used to code sign the file.
    */
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.undefined
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
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain)
    if (hashAlgorithm != null) __obj.updateDynamic("hashAlgorithm")(hashAlgorithm)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm)
    __obj.asInstanceOf[CustomCodeSigning]
  }
}

