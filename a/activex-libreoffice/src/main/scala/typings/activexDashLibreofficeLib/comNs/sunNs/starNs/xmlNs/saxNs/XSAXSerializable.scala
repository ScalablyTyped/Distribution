package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

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
  def serialize(
    handler: XDocumentHandler,
    namespaces: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
  ): scala.Unit
}

object XSAXSerializable {
  @scala.inline
  def apply(
    serialize: js.Function2[
      XDocumentHandler, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair], 
      scala.Unit
    ]
  ): XSAXSerializable = {
    val __obj = js.Dynamic.literal(serialize = serialize)
  
    __obj.asInstanceOf[XSAXSerializable]
  }
}

