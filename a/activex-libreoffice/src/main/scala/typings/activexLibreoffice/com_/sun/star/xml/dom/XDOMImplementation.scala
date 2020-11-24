package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDOMImplementation extends XInterface {
  
  /**
    * Creates a DOM Document object of the specified type with its document element. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the
    * specified qualified name contains an illegal character. NAMESPACE_ERR: Raised if the qualifiedName is malformed, if the qualifiedName has a prefix and
    * the namespaceURI is null, or if the qualifiedName has a prefix that is "xml" and the namespaceURI is different from "
    * http://www.w3.org/XML/1998/namespace" , or if the DOM implementation does not support the "XML" feature but a non-null namespace URI was provided,
    * since namespaces were defined by XML. WRONG_DOCUMENT_ERR: Raised if doctype has already been used with a different document or was created from a
    * different implementation. NOT_SUPPORTED_ERR: May be raised by DOM implementations which do not support the "XML" feature, if they choose not to
    * support this method. Other features introduced in the future, by the DOM WG or in extensions defined by other groups, may also demand support for this
    * method; please consult the definition of the feature to see if it requires this method.
    */
  def createDocument(namespaceURI: String, qualifiedName: String, doctype: XDocumentType): XDocument = js.native
  
  /**
    * Creates an empty DocumentType node. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified qualified name contains an illegal
    * character. NAMESPACE_ERR: Raised if the qualifiedName is malformed. NOT_SUPPORTED_ERR: May be raised by DOM implementations which do not support the
    * "XML" feature, if they choose not to support this method. Other features introduced in the future, by the DOM WG or in extensions defined by other
    * groups, may also demand support for this method; please consult the definition of the feature to see if it requires this method.
    */
  def createDocumentType(qualifiedName: String, publicId: String, systemId: String): XDocumentType = js.native
  
  /** Test if the DOM implementation implements a specific feature. */
  def hasFeature(feature: String, ver: String): Boolean = js.native
}
object XDOMImplementation {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDocument: (String, String, XDocumentType) => XDocument,
    createDocumentType: (String, String, String) => XDocumentType,
    hasFeature: (String, String) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDOMImplementation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDocument = js.Any.fromFunction3(createDocument), createDocumentType = js.Any.fromFunction3(createDocumentType), hasFeature = js.Any.fromFunction2(hasFeature), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDOMImplementation]
  }
  
  @scala.inline
  implicit class XDOMImplementationOps[Self <: XDOMImplementation] (val x: Self) extends AnyVal {
    
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
    def setCreateDocument(value: (String, String, XDocumentType) => XDocument): Self = this.set("createDocument", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateDocumentType(value: (String, String, String) => XDocumentType): Self = this.set("createDocumentType", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHasFeature(value: (String, String) => Boolean): Self = this.set("hasFeature", js.Any.fromFunction2(value))
  }
}
