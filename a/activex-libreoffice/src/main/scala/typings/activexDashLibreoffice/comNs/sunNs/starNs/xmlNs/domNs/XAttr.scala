package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAttr extends XNode {
  /** Returns the name of this attribute. */
  val Name: String
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  val OwnerElement: XElement
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  val Specified: Boolean
  /** On retrieval, the value of the attribute is returned as a string. */
  var Value: String
  /** Returns the name of this attribute. */
  def getName(): String
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  def getOwnerElement(): XElement
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  def getSpecified(): Boolean
  /** On retrieval, the value of the attribute is returned as a string. */
  def getValue(): String
  /** Sets the value of the attribute from a string. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. */
  def setValue(value: String): Unit
}

object XAttr {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    FirstChild: XNode,
    LastChild: XNode,
    LocalName: String,
    Name: String,
    NamespaceURI: String,
    NextSibling: XNode,
    NodeName: String,
    NodeType: NodeType,
    NodeValue: String,
    OwnerDocument: XDocument,
    OwnerElement: XElement,
    ParentNode: XNode,
    Prefix: String,
    PreviousSibling: XNode,
    Specified: Boolean,
    Value: String,
    acquire: () => Unit,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getFirstChild: () => XNode,
    getLastChild: () => XNode,
    getLocalName: () => String,
    getName: () => String,
    getNamespaceURI: () => String,
    getNextSibling: () => XNode,
    getNodeName: () => String,
    getNodeType: () => NodeType,
    getNodeValue: () => String,
    getOwnerDocument: () => XDocument,
    getOwnerElement: () => XElement,
    getParentNode: () => XNode,
    getPrefix: () => String,
    getPreviousSibling: () => XNode,
    getSpecified: () => Boolean,
    getValue: () => String,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setNodeValue: String => Unit,
    setPrefix: String => Unit,
    setValue: String => Unit
  ): XAttr = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, FirstChild = FirstChild, LastChild = LastChild, LocalName = LocalName, Name = Name, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, OwnerElement = OwnerElement, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, Specified = Specified, Value = Value, acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getName = js.Any.fromFunction0(getName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getOwnerElement = js.Any.fromFunction0(getOwnerElement), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getSpecified = js.Any.fromFunction0(getSpecified), getValue = js.Any.fromFunction0(getValue), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[XAttr]
  }
}

