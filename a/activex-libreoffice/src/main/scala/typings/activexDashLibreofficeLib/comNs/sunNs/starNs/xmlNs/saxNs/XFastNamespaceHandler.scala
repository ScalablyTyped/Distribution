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
    acquire: () => scala.Unit,
    getNamespaceURI: java.lang.String => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerNamespace: (java.lang.String, java.lang.String) => scala.Unit,
    release: () => scala.Unit
  ): XFastNamespaceHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getNamespaceURI = js.Any.fromFunction1(getNamespaceURI), queryInterface = js.Any.fromFunction1(queryInterface), registerNamespace = js.Any.fromFunction2(registerNamespace), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFastNamespaceHandler]
  }
}

