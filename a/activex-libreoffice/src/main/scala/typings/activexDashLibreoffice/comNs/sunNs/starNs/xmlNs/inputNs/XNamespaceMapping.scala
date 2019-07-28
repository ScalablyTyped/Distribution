package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.inputNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to map XML namespace URI strings to ordinals (URI-id, short uid). */
trait XNamespaceMapping extends XInterface {
  /**
    * Creates a unique ordinal passing an XML namespace URI.
    * @param uri XML namespace URI
    * @returns uid
    */
  def getUidByUri(uri: String): Double
  /**
    * Gets the corresponding XML namespace URI passing a uid (created using {@link getUidByUri()} ).
    * @param uid uid
    * @returns XML namespace URI
    */
  def getUriByUid(uid: Double): String
}

object XNamespaceMapping {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getUidByUri: String => Double,
    getUriByUid: Double => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNamespaceMapping = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getUidByUri = js.Any.fromFunction1(getUidByUri), getUriByUid = js.Any.fromFunction1(getUriByUid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNamespaceMapping]
  }
}

