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

object XDocument {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Doctype: XDocumentType,
    DocumentElement: XElement,
    FirstChild: XNode,
    Implementation: XDOMImplementation,
    LastChild: XNode,
    LocalName: java.lang.String,
    NamespaceURI: java.lang.String,
    NextSibling: XNode,
    NodeName: java.lang.String,
    NodeType: NodeType,
    NodeValue: java.lang.String,
    OwnerDocument: XDocument,
    ParentNode: XNode,
    Prefix: java.lang.String,
    PreviousSibling: XNode,
    acquire: js.Function0[scala.Unit],
    appendChild: js.Function1[XNode, XNode],
    cloneNode: js.Function1[scala.Boolean, XNode],
    createAttribute: js.Function1[java.lang.String, XAttr],
    createAttributeNS: js.Function2[java.lang.String, java.lang.String, XAttr],
    createCDATASection: js.Function1[java.lang.String, XCDATASection],
    createComment: js.Function1[java.lang.String, XComment],
    createDocumentFragment: js.Function0[XDocumentFragment],
    createElement: js.Function1[java.lang.String, XElement],
    createElementNS: js.Function2[java.lang.String, java.lang.String, XElement],
    createEntityReference: js.Function1[java.lang.String, XEntityReference],
    createProcessingInstruction: js.Function2[java.lang.String, java.lang.String, XProcessingInstruction],
    createTextNode: js.Function1[java.lang.String, XText],
    getAttributes: js.Function0[XNamedNodeMap],
    getChildNodes: js.Function0[XNodeList],
    getDoctype: js.Function0[XDocumentType],
    getDocumentElement: js.Function0[XElement],
    getElementById: js.Function1[java.lang.String, XElement],
    getElementsByTagName: js.Function1[java.lang.String, XNodeList],
    getElementsByTagNameNS: js.Function2[java.lang.String, java.lang.String, XNodeList],
    getFirstChild: js.Function0[XNode],
    getImplementation: js.Function0[XDOMImplementation],
    getLastChild: js.Function0[XNode],
    getLocalName: js.Function0[java.lang.String],
    getNamespaceURI: js.Function0[java.lang.String],
    getNextSibling: js.Function0[XNode],
    getNodeName: js.Function0[java.lang.String],
    getNodeType: js.Function0[NodeType],
    getNodeValue: js.Function0[java.lang.String],
    getOwnerDocument: js.Function0[XDocument],
    getParentNode: js.Function0[XNode],
    getPrefix: js.Function0[java.lang.String],
    getPreviousSibling: js.Function0[XNode],
    hasAttributes: js.Function0[scala.Boolean],
    hasChildNodes: js.Function0[scala.Boolean],
    importNode: js.Function2[XNode, scala.Boolean, XNode],
    insertBefore: js.Function2[XNode, XNode, XNode],
    isSupported: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    normalize: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChild: js.Function1[XNode, XNode],
    replaceChild: js.Function2[XNode, XNode, XNode],
    setNodeValue: js.Function1[java.lang.String, scala.Unit],
    setPrefix: js.Function1[java.lang.String, scala.Unit]
  ): XDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attributes")(Attributes)
    __obj.updateDynamic("ChildNodes")(ChildNodes)
    __obj.updateDynamic("Doctype")(Doctype)
    __obj.updateDynamic("DocumentElement")(DocumentElement)
    __obj.updateDynamic("FirstChild")(FirstChild)
    __obj.updateDynamic("Implementation")(Implementation)
    __obj.updateDynamic("LastChild")(LastChild)
    __obj.updateDynamic("LocalName")(LocalName)
    __obj.updateDynamic("NamespaceURI")(NamespaceURI)
    __obj.updateDynamic("NextSibling")(NextSibling)
    __obj.updateDynamic("NodeName")(NodeName)
    __obj.updateDynamic("NodeType")(NodeType)
    __obj.updateDynamic("NodeValue")(NodeValue)
    __obj.updateDynamic("OwnerDocument")(OwnerDocument)
    __obj.updateDynamic("ParentNode")(ParentNode)
    __obj.updateDynamic("Prefix")(Prefix)
    __obj.updateDynamic("PreviousSibling")(PreviousSibling)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("appendChild")(appendChild)
    __obj.updateDynamic("cloneNode")(cloneNode)
    __obj.updateDynamic("createAttribute")(createAttribute)
    __obj.updateDynamic("createAttributeNS")(createAttributeNS)
    __obj.updateDynamic("createCDATASection")(createCDATASection)
    __obj.updateDynamic("createComment")(createComment)
    __obj.updateDynamic("createDocumentFragment")(createDocumentFragment)
    __obj.updateDynamic("createElement")(createElement)
    __obj.updateDynamic("createElementNS")(createElementNS)
    __obj.updateDynamic("createEntityReference")(createEntityReference)
    __obj.updateDynamic("createProcessingInstruction")(createProcessingInstruction)
    __obj.updateDynamic("createTextNode")(createTextNode)
    __obj.updateDynamic("getAttributes")(getAttributes)
    __obj.updateDynamic("getChildNodes")(getChildNodes)
    __obj.updateDynamic("getDoctype")(getDoctype)
    __obj.updateDynamic("getDocumentElement")(getDocumentElement)
    __obj.updateDynamic("getElementById")(getElementById)
    __obj.updateDynamic("getElementsByTagName")(getElementsByTagName)
    __obj.updateDynamic("getElementsByTagNameNS")(getElementsByTagNameNS)
    __obj.updateDynamic("getFirstChild")(getFirstChild)
    __obj.updateDynamic("getImplementation")(getImplementation)
    __obj.updateDynamic("getLastChild")(getLastChild)
    __obj.updateDynamic("getLocalName")(getLocalName)
    __obj.updateDynamic("getNamespaceURI")(getNamespaceURI)
    __obj.updateDynamic("getNextSibling")(getNextSibling)
    __obj.updateDynamic("getNodeName")(getNodeName)
    __obj.updateDynamic("getNodeType")(getNodeType)
    __obj.updateDynamic("getNodeValue")(getNodeValue)
    __obj.updateDynamic("getOwnerDocument")(getOwnerDocument)
    __obj.updateDynamic("getParentNode")(getParentNode)
    __obj.updateDynamic("getPrefix")(getPrefix)
    __obj.updateDynamic("getPreviousSibling")(getPreviousSibling)
    __obj.updateDynamic("hasAttributes")(hasAttributes)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes)
    __obj.updateDynamic("importNode")(importNode)
    __obj.updateDynamic("insertBefore")(insertBefore)
    __obj.updateDynamic("isSupported")(isSupported)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChild")(removeChild)
    __obj.updateDynamic("replaceChild")(replaceChild)
    __obj.updateDynamic("setNodeValue")(setNodeValue)
    __obj.updateDynamic("setPrefix")(setPrefix)
    __obj.asInstanceOf[XDocument]
  }
}

