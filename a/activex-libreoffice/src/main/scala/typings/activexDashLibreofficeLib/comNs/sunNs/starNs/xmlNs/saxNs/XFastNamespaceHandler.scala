package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 5.3 */
trait XFastNamespaceHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def getNamespaceURI(NamespacePrefix: java.lang.String): java.lang.String
  def registerNamespace(NamespacePrefix: java.lang.String, NamespaceURI: java.lang.String): scala.Unit
}

object XFastNamespaceHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getNamespaceURI: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerNamespace: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XFastNamespaceHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getNamespaceURI")(getNamespaceURI)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerNamespace")(registerNamespace)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XFastNamespaceHandler]
  }
}

