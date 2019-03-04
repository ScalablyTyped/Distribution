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
    acquire: js.Function0[scala.Unit],
    appendChild: js.Function1[XNode, XNode],
    cloneNode: js.Function1[scala.Boolean, XNode],
    getAttribute: js.Function1[java.lang.String, java.lang.String],
    getAttributeNS: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    getAttributeNode: js.Function1[java.lang.String, XAttr],
    getAttributeNodeNS: js.Function2[java.lang.String, java.lang.String, XAttr],
    getAttributes: js.Function0[XNamedNodeMap],
    getChildNodes: js.Function0[XNodeList],
    getElementsByTagName: js.Function1[java.lang.String, XNodeList],
    getElementsByTagNameNS: js.Function2[java.lang.String, java.lang.String, XNodeList],
    getFirstChild: js.Function0[XNode],
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
    getTagName: js.Function0[java.lang.String],
    hasAttribute: js.Function1[java.lang.String, scala.Boolean],
    hasAttributeNS: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    hasAttributes: js.Function0[scala.Boolean],
    hasChildNodes: js.Function0[scala.Boolean],
    insertBefore: js.Function2[XNode, XNode, XNode],
    isSupported: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    normalize: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAttribute: js.Function1[java.lang.String, scala.Unit],
    removeAttributeNS: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    removeAttributeNode: js.Function1[XAttr, XAttr],
    removeChild: js.Function1[XNode, XNode],
    replaceChild: js.Function2[XNode, XNode, XNode],
    setAttribute: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setAttributeNS: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    setAttributeNode: js.Function1[XAttr, XAttr],
    setAttributeNodeNS: js.Function1[XAttr, XAttr],
    setNodeValue: js.Function1[java.lang.String, scala.Unit],
    setPrefix: js.Function1[java.lang.String, scala.Unit]
  ): XElement = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, FirstChild = FirstChild, LastChild = LastChild, LocalName = LocalName, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, TagName = TagName, acquire = acquire, appendChild = appendChild, cloneNode = cloneNode, getAttribute = getAttribute, getAttributeNS = getAttributeNS, getAttributeNode = getAttributeNode, getAttributeNodeNS = getAttributeNodeNS, getAttributes = getAttributes, getChildNodes = getChildNodes, getElementsByTagName = getElementsByTagName, getElementsByTagNameNS = getElementsByTagNameNS, getFirstChild = getFirstChild, getLastChild = getLastChild, getLocalName = getLocalName, getNamespaceURI = getNamespaceURI, getNextSibling = getNextSibling, getNodeName = getNodeName, getNodeType = getNodeType, getNodeValue = getNodeValue, getOwnerDocument = getOwnerDocument, getParentNode = getParentNode, getPrefix = getPrefix, getPreviousSibling = getPreviousSibling, getTagName = getTagName, hasAttribute = hasAttribute, hasAttributeNS = hasAttributeNS, hasAttributes = hasAttributes, hasChildNodes = hasChildNodes, insertBefore = insertBefore, isSupported = isSupported, normalize = normalize, queryInterface = queryInterface, release = release, removeAttribute = removeAttribute, removeAttributeNS = removeAttributeNS, removeAttributeNode = removeAttributeNode, removeChild = removeChild, replaceChild = replaceChild, setAttribute = setAttribute, setAttributeNS = setAttributeNS, setAttributeNode = setAttributeNode, setAttributeNodeNS = setAttributeNodeNS, setNodeValue = setNodeValue, setPrefix = setPrefix)
  
    __obj.asInstanceOf[XElement]
  }
}

