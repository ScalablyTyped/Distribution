package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 5.3 */
@js.native
trait XFastNamespaceHandler extends XInterface {
  def getNamespaceURI(NamespacePrefix: String): String = js.native
  def registerNamespace(NamespacePrefix: String, NamespaceURI: String): Unit = js.native
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
  @scala.inline
  implicit class XFastNamespaceHandlerOps[Self <: XFastNamespaceHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetNamespaceURI(value: String => String): Self = this.set("getNamespaceURI", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterNamespace(value: (String, String) => Unit): Self = this.set("registerNamespace", js.Any.fromFunction2(value))
  }
  
}

