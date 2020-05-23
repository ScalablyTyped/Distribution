package typings.activexLibreoffice.com_.sun.star.xml.crypto

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
trait XXMLSignature extends XInterface {
  /** Perform signature in the environment of signature template and context. */
  def generate(aTemplate: XXMLSignatureTemplate, aEnvironment: XSecurityEnvironment): XXMLSignatureTemplate
  /** Perform validation in the environment of signature template and context. */
  def validate(aTemplate: XXMLSignatureTemplate, aContext: XXMLSecurityContext): XXMLSignatureTemplate
}

object XXMLSignature {
  @scala.inline
  def apply(
    acquire: () => Unit,
    generate: (XXMLSignatureTemplate, XSecurityEnvironment) => XXMLSignatureTemplate,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    validate: (XXMLSignatureTemplate, XXMLSecurityContext) => XXMLSignatureTemplate
  ): XXMLSignature = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), generate = js.Any.fromFunction2(generate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[XXMLSignature]
  }
}

