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
    acquire: js.Function0[scala.Unit],
    getUidByUri: js.Function1[java.lang.String, scala.Double],
    getUriByUid: js.Function1[scala.Double, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XNamespaceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getUidByUri")(getUidByUri)
    __obj.updateDynamic("getUriByUid")(getUriByUid)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XNamespaceMapping]
  }
}

