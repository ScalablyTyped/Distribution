package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XElement extends XNode {
  /** The name of the element. */
  val TagName: java.lang.String
  /** Retrieves an attribute value by name. */
  def getAttribute(name: java.lang.String): java.lang.String
  /** Retrieves an attribute value by local name and namespace URI. */
  def getAttributeNS(namespaceURI: java.lang.String, localName: java.lang.String): java.lang.String
  /** Retrieves an attribute node by name. */
  def getAttributeNode(name: java.lang.String): XAttr
  /** Retrieves an Attr node by local name and namespace URI. */
  def getAttributeNodeNS(namespaceURI: java.lang.String, localName: java.lang.String): XAttr
  /**
    * Returns a NodeList of all descendant Elements with a given tag name, in the order in which they are encountered in a preorder traversal of this
    * Element tree.
    */
  def getElementsByTagName(name: java.lang.String): XNodeList
  /**
    * Returns a NodeList of all the descendant Elements with a given local name and namespace URI in the order in which they are encountered in a preorder
    * traversal of this Element tree.
    */
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): XNodeList
  /** The name of the element. */
  def getTagName(): java.lang.String
  /** Returns true when an attribute with a given name is specified on this element or has a default value, false otherwise. */
  def hasAttribute(name: java.lang.String): scala.Boolean
  /** Returns true when an attribute with a given local name and namespace URI is specified on this element or has a default value, false otherwise. */
  def hasAttributeNS(namespaceURI: java.lang.String, localName: java.lang.String): scala.Boolean
  /** Removes an attribute by name. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */
  def removeAttribute(name: java.lang.String): scala.Unit
  /** Removes an attribute by local name and namespace URI. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */
  def removeAttributeNS(namespaceURI: java.lang.String, localName: java.lang.String): scala.Unit
  /**
    * Removes the specified attribute node. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. NOT_FOUND_ERR:
    * Raised if oldAttr is not an attribute of the element.
    */
  def removeAttributeNode(oldAttr: XAttr): XAttr
  /**
    * Adds a new attribute. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal character.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def setAttribute(name: java.lang.String, value: java.lang.String): scala.Unit
  /**
    * Adds a new attribute. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified qualified name contains an illegal character, per
    * the XML 1.0 specification . NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. NAMESPACE_ERR: Raised if the qualifiedName is malformed per
    * the Namespaces in XML specification, if the qualifiedName has a prefix and the namespaceURI is null, if the qualifiedName has a prefix that is "xml"
    * and the namespaceURI is different from " http://www.w3.org/XML/1998/namespace", or if the qualifiedName, or its prefix, is "xmlns" and the
    * namespaceURI is different from " http://www.w3.org/2000/xmlns/". NOT_SUPPORTED_ERR: Always thrown if the current document does not support the "XML"
    * feature, since namespaces were defined by XML.
    */
  def setAttributeNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit
  /**
    * Adds a new attribute node. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if newAttr was created from a different document than the one
    * that created the element. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. INUSE_ATTRIBUTE_ERR: Raised if newAttr is already an attribute
    * of another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements.
    */
  def setAttributeNode(newAttr: XAttr): XAttr
  /**
    * Adds a new attribute. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if newAttr was created from a different document than the one that
    * created the element. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. INUSE_ATTRIBUTE_ERR: Raised if newAttr is already an attribute of
    * another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements. NOT_SUPPORTED_ERR: Always thrown if the
    * current document does not support the "XML" feature, since namespaces were defined by XML.
    */
  def setAttributeNodeNS(newAttr: XAttr): XAttr
}

object XElement {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    FirstChild: XNode,
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
    TagName: java.lang.String,
    acquire: () => scala.Unit,
    appendChild: XNode => XNode,
    cloneNode: scala.Boolean => XNode,
    getAttribute: java.lang.String => java.lang.String,
    getAttributeNS: (java.lang.String, java.lang.String) => java.lang.String,
    getAttributeNode: java.lang.String => XAttr,
    getAttributeNodeNS: (java.lang.String, java.lang.String) => XAttr,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getElementsByTagName: java.lang.String => XNodeList,
    getElementsByTagNameNS: (java.lang.String, java.lang.String) => XNodeList,
    getFirstChild: () => XNode,
    getLastChild: () => XNode,
    getLocalName: () => java.lang.String,
    getNamespaceURI: () => java.lang.String,
    getNextSibling: () => XNode,
    getNodeName: () => java.lang.String,
    getNodeType: () => NodeType,
    getNodeValue: () => java.lang.String,
    getOwnerDocument: () => XDocument,
    getParentNode: () => XNode,
    getPrefix: () => java.lang.String,
    getPreviousSibling: () => XNode,
    getTagName: () => java.lang.String,
    hasAttribute: java.lang.String => scala.Boolean,
    hasAttributeNS: (java.lang.String, java.lang.String) => scala.Boolean,
    hasAttributes: () => scala.Boolean,
    hasChildNodes: () => scala.Boolean,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (java.lang.String, java.lang.String) => scala.Boolean,
    normalize: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeAttribute: java.lang.String => scala.Unit,
    removeAttributeNS: (java.lang.String, java.lang.String) => scala.Unit,
    removeAttributeNode: XAttr => XAttr,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setAttribute: (java.lang.String, java.lang.String) => scala.Unit,
    setAttributeNS: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    setAttributeNode: XAttr => XAttr,
    setAttributeNodeNS: XAttr => XAttr,
    setNodeValue: java.lang.String => scala.Unit,
    setPrefix: java.lang.String => scala.Unit
  ): XElement = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, FirstChild = FirstChild, LastChild = LastChild, LocalName = LocalName, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, TagName = TagName, acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getTagName = js.Any.fromFunction0(getTagName), hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix))
  
    __obj.asInstanceOf[XElement]
  }
}

