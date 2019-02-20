package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link DocumentDigitalSignatures} */
trait DocumentDigitalSignatures extends XDocumentDigitalSignatures {
  def createDefault(): scala.Unit
  /** @param ODFVersion the version of the signature */
  def createWithVersion(ODFVersion: java.lang.String): scala.Unit
  /**
    * @param ODFVersion the version of the signature
    * @param HasValidDocumentSignature indicates if the document already contains a document signature.
    */
  def createWithVersionAndValidSignature(ODFVersion: java.lang.String, HasValidDocumentSignature: scala.Boolean): scala.Unit
}

