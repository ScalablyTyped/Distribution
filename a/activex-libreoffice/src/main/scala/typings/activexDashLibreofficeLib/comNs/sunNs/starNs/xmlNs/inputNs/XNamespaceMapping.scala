package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.inputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to map XML namespace URI strings to ordinals (URI-id, short uid). */
trait XNamespaceMapping
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates a unique ordinal passing an XML namespace URI.
    * @param uri XML namespace URI
    * @returns uid
    */
  def getUidByUri(uri: java.lang.String): scala.Double
  /**
    * Gets the corresponding XML namespace URI passing a uid (created using {@link getUidByUri()} ).
    * @param uid uid
    * @returns XML namespace URI
    */
  def getUriByUid(uid: scala.Double): java.lang.String
}

object XNamespaceMapping {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getUidByUri: java.lang.String => scala.Double,
    getUriByUid: scala.Double => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XNamespaceMapping = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getUidByUri = js.Any.fromFunction1(getUidByUri), getUriByUid = js.Any.fromFunction1(getUriByUid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNamespaceMapping]
  }
}

