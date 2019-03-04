package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of XML signature
  *
  * This interface represents a XML signer or verifier.
  *
  * The signer or verifier concrete a key by retrieve signature context and signature template.
  *
  * In some cases, the signer or verifier can determine and locate the contents to be signed from the signature template by dereference the URI.
  *
  * In some cases, the contents to be signed need to be clearly pointed out by the signature template.
  */
trait XXMLSignature
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Perform signature in the environment of signature template and context. */
  def generate(aTemplate: XXMLSignatureTemplate, aEnvironment: XSecurityEnvironment): XXMLSignatureTemplate
  /** Perform validation in the environment of signature template and context. */
  def validate(aTemplate: XXMLSignatureTemplate, aContext: XXMLSecurityContext): XXMLSignatureTemplate
}

object XXMLSignature {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    generate: js.Function2[XXMLSignatureTemplate, XSecurityEnvironment, XXMLSignatureTemplate],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    validate: js.Function2[XXMLSignatureTemplate, XXMLSecurityContext, XXMLSignatureTemplate]
  ): XXMLSignature = {
    val __obj = js.Dynamic.literal(acquire = acquire, generate = generate, queryInterface = queryInterface, release = release, validate = validate)
  
    __obj.asInstanceOf[XXMLSignature]
  }
}

