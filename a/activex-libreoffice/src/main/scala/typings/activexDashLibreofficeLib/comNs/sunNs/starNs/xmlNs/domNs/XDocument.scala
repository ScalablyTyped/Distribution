package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocument extends XNode {
  /** The Document Type Declaration (see DocumentType) associated with this document. */
  val Doctype: XDocumentType
  /** This is a convenience attribute that allows direct access to the child node that is the root element of the document. */
  val DocumentElement: XElement
  /** The DOMImplementation object that handles this document. */
  val Implementation: XDOMImplementation
  /** Creates an Attr of the given name. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal character. */
  def createAttribute(name: java.lang.String): XAttr
  /**
    * Creates an attribute of the given qualified name and namespace URI. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified
    * qualified name contains an illegal character, per the XML 1.0 specification . NAMESPACE_ERR: Raised if the qualifiedName is malformed per the
    * Namespaces in XML specification, if the qualifiedName has a prefix and the namespaceURI is null, if the qualifiedName has a prefix that is "xml" and
    * the namespaceURI is different from " http://www.w3.org/XML/1998/namespace", or if the qualifiedName, or its prefix, is "xmlns" and the namespaceURI is
    * different from " http://www.w3.org/2000/xmlns/". NOT_SUPPORTED_ERR: Always thrown if the current document does not support the "XML" feature, since
    * namespaces were defined by XML.
    */
  def createAttributeNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String): XAttr
  /**
    * Creates a CDATASection node whose value is the specified string. Throws: {@link DOMException} - NOT_SUPPORTED_ERR: Raised if this document is an HTML
    * document.
    */
  def createCDATASection(data: java.lang.String): XCDATASection
  /** Creates a Comment node given the specified string. */
  def createComment(data: java.lang.String): XComment
  /** Creates an empty DocumentFragment object. */
  def createDocumentFragment(): XDocumentFragment
  /**
    * Creates an element of the type specified. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal
    * character.
    */
  def createElement(tagName: java.lang.String): XElement
  /**
    * Creates an element of the given qualified name and namespace URI. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified
    * qualified name contains an illegal character, per the XML 1.0 specification . NAMESPACE_ERR: Raised if the qualifiedName is malformed per the
    * Namespaces in XML specification, if the qualifiedName has a prefix and the namespaceURI is null, or if the qualifiedName has a prefix that is "xml"
    * and the namespaceURI is different from " http://www.w3.org/XML/1998/namespace" . NOT_SUPPORTED_ERR: Always thrown if the current document does not
    * support the "XML" feature, since namespaces were defined by XML.
    */
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String): XElement
  /**
    * Throws: {@link DOMException} - NOT_SUPPORTED_ERR: Raised if the type of node being imported is not supported. Creates an EntityReference object.
    * Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal character. NOT_SUPPORTED_ERR: Raised if this
    * document is an HTML document.
    */
  def createEntityReference(name: java.lang.String): XEntityReference
  /**
    * Creates a ProcessingInstruction node given the specified name and data strings. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the
    * specified target contains an illegal character. NOT_SUPPORTED_ERR: Raised if this document is an HTML document.
    */
  def createProcessingInstruction(target: java.lang.String, data: java.lang.String): XProcessingInstruction
  /** Creates a Text node given the specified string. */
  def createTextNode(data: java.lang.String): XText
  /** The Document Type Declaration (see DocumentType) associated with this document. */
  def getDoctype(): XDocumentType
  /** This is a convenience attribute that allows direct access to the child node that is the root element of the document. */
  def getDocumentElement(): XElement
  /** Returns the Element whose ID is given by elementId. */
  def getElementById(elementId: java.lang.String): XElement
  /** Returns a NodeList of all the Elements with a given tag name in the order in which they are encountered in a preorder traversal of the Document tree. */
  def getElementsByTagName(tagname: java.lang.String): XNodeList
  /**
    * Returns a NodeList of all the Elements with a given local name and namespace URI in the order in which they are encountered in a preorder traversal of
    * the Document tree.
    */
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): XNodeList
  /** The DOMImplementation object that handles this document. */
  def getImplementation(): XDOMImplementation
  /**
    * Imports a node from another document to this document. Throws: {@link DOMException} - NOT_SUPPORTED_ERR: Raised if the type of node being imported is
    * not supported.
    */
  def importNode(importedNode: XNode, deep: scala.Boolean): XNode
}

