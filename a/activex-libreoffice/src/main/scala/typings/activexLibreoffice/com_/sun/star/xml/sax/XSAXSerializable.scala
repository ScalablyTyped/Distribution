package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.beans.StringPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * serializes a DOM tree by generating SAX events.
  * @since OOo 3.0
  */
@js.native
trait XSAXSerializable extends StObject {
  
  /**
    * serializes an object (e.g. a DOM tree) that represents an XML document by generating SAX events.
    * @param handler the SAX event handler that should receive the generated events
    * @param namespaces a list of namespace declarations that will be added to the root element node of the XML document This is necessary mostly because the
    * @throws com::sun::star::xml::sax::SAXException if serializing the XML document fails
    */
  def serialize(handler: XDocumentHandler, namespaces: SeqEquiv[StringPair]): Unit = js.native
}
object XSAXSerializable {
  
  @scala.inline
  def apply(serialize: (XDocumentHandler, SeqEquiv[StringPair]) => Unit): XSAXSerializable = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[XSAXSerializable]
  }
  
  @scala.inline
  implicit class XSAXSerializableMutableBuilder[Self <: XSAXSerializable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerialize(value: (XDocumentHandler, SeqEquiv[StringPair]) => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
  }
}
