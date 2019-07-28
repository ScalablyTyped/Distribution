package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs.EncryptionException
import typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs.SignatureException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoNs {
  /** @since LibreOffice 4.0 */
  type NSSInitializer = XNSSInitializer
  /** Service of {@link SEInitializer} */
  type SEInitializer = XSEInitializer
  /** Service of {@link XSecurityEnvironment} */
  type SecurityEnvironment = XSecurityEnvironment
  type XMLEncryptionException = EncryptionException
  /** Service of {@link XMLEncryptionTemplate} */
  type XMLEncryptionTemplate = XXMLEncryptionTemplate
  /** Service of {@link XMLSecurityContext} */
  type XMLSecurityContext = XXMLSecurityContext
  type XMLSignatureException = SignatureException
  /** Service of {@link XMLSignatureTemplate} */
  type XMLSignatureTemplate = XXMLSignatureTemplate
}
