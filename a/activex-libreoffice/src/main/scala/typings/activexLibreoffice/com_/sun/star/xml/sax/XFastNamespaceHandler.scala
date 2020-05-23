package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 5.3 */
trait XFastNamespaceHandler extends XInterface {
  def getNamespaceURI(NamespacePrefix: String): String
  def registerNamespace(NamespacePrefix: String, NamespaceURI: String): Unit
}

object XFastNamespaceHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getNamespaceURI: String => String,
    queryInterface: `type` => js.Any,
    registerNamespace: (String, String) => Unit,
    release: () => Unit
  ): XFastNamespaceHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getNamespaceURI = js.Any.fromFunction1(getNamespaceURI), queryInterface = js.Any.fromFunction1(queryInterface), registerNamespace = js.Any.fromFunction2(registerNamespace), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFastNamespaceHandler]
  }
}

