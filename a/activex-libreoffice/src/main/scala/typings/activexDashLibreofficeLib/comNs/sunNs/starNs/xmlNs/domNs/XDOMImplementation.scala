package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDOMImplementation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def createDocument(namespaceURI: java.lang.String, qualifiedName: java.lang.String, doctype: XDocumentType): XDocument
  /**
    * Creates an empty DocumentType node. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified qualified name contains an illegal
    * character. NAMESPACE_ERR: Raised if the qualifiedName is malformed. NOT_SUPPORTED_ERR: May be raised by DOM implementations which do not support the
    * "XML" feature, if they choose not to support this method. Other features introduced in the future, by the DOM WG or in extensions defined by other
    * groups, may also demand support for this method; please consult the definition of the feature to see if it requires this method.
    */
  def createDocumentType(qualifiedName: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): XDocumentType
  /** Test if the DOM implementation implements a specific feature. */
  def hasFeature(feature: java.lang.String, ver: java.lang.String): scala.Boolean
}

object XDOMImplementation {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createDocument: js.Function3[java.lang.String, java.lang.String, XDocumentType, XDocument],
    createDocumentType: js.Function3[java.lang.String, java.lang.String, java.lang.String, XDocumentType],
    hasFeature: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDOMImplementation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createDocument")(createDocument)
    __obj.updateDynamic("createDocumentType")(createDocumentType)
    __obj.updateDynamic("hasFeature")(hasFeature)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDOMImplementation]
  }
}

