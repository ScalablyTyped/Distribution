package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.beans.Pair
import typings.activexLibreoffice.com_.sun.star.beans.StringPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * serializes a DOM tree by generating FastSAX events.
  * @since OOo 3.1
  */
@js.native
trait XFastSAXSerializable extends js.Object {
  
  /**
    * serializes an object (e.g. a DOM tree) that represents an XML document by generating fast SAX events.
    * @param handler the SAX event handler that should receive the generated events
    * @param tokenHandler the fast SAX token handler that is used to translate names
    * @param namespaces a list of namespace declarations that will be added to the root element node of the XML document This is necessary mostly because the
    * @param registerNamespaces a list of namespace url / namespace token pairs. you need to register all namespace in order to have them recognized during ex
    * @throws com::sun::star::xml::sax::SAXException if serializing the XML document fails
    */
  def fastSerialize(
    handler: XFastDocumentHandler,
    tokenHandler: XFastTokenHandler,
    namespaces: SeqEquiv[StringPair],
    registerNamespaces: SeqEquiv[Pair[String, Double]]
  ): Unit = js.native
}
object XFastSAXSerializable {
  
  @scala.inline
  def apply(
    fastSerialize: (XFastDocumentHandler, XFastTokenHandler, SeqEquiv[StringPair], SeqEquiv[Pair[String, Double]]) => Unit
  ): XFastSAXSerializable = {
    val __obj = js.Dynamic.literal(fastSerialize = js.Any.fromFunction4(fastSerialize))
    __obj.asInstanceOf[XFastSAXSerializable]
  }
  
  @scala.inline
  implicit class XFastSAXSerializableOps[Self <: XFastSAXSerializable] (val x: Self) extends AnyVal {
    
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
    def setFastSerialize(
      value: (XFastDocumentHandler, XFastTokenHandler, SeqEquiv[StringPair], SeqEquiv[Pair[String, Double]]) => Unit
    ): Self = this.set("fastSerialize", js.Any.fromFunction4(value))
  }
}
