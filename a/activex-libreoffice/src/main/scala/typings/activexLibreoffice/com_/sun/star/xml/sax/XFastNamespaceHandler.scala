package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XFastNamespaceHandlerMutableBuilder[Self <: XFastNamespaceHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNamespaceURI(value: String => String): Self = StObject.set(x, "getNamespaceURI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterNamespace(value: (String, String) => Unit): Self = StObject.set(x, "registerNamespace", js.Any.fromFunction2(value))
  }
}
