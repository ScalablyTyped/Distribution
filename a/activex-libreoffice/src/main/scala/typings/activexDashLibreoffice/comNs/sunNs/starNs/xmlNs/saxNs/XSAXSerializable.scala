package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.StringPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * serializes a DOM tree by generating SAX events.
  * @since OOo 3.0
  */
trait XSAXSerializable extends js.Object {
  /**
    * serializes an object (e.g. a DOM tree) that represents an XML document by generating SAX events.
    * @param handler the SAX event handler that should receive the generated events
    * @param namespaces a list of namespace declarations that will be added to the root element node of the XML document This is necessary mostly because the
    * @throws com::sun::star::xml::sax::SAXException if serializing the XML document fails
    */
  def serialize(handler: XDocumentHandler, namespaces: SeqEquiv[StringPair]): Unit
}

object XSAXSerializable {
  @scala.inline
  def apply(serialize: (XDocumentHandler, SeqEquiv[StringPair]) => Unit): XSAXSerializable = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction2(serialize))
  
    __obj.asInstanceOf[XSAXSerializable]
  }
}

