package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAttr extends XNode {
  /** Returns the name of this attribute. */
  val Name: java.lang.String
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  val OwnerElement: XElement
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  val Specified: scala.Boolean
  /** On retrieval, the value of the attribute is returned as a string. */
  var Value: java.lang.String
  /** Returns the name of this attribute. */
  def getName(): java.lang.String
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  def getOwnerElement(): XElement
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  def getSpecified(): scala.Boolean
  /** On retrieval, the value of the attribute is returned as a string. */
  def getValue(): java.lang.String
  /** Sets the value of the attribute from a string. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. */
  def setValue(value: java.lang.String): scala.Unit
}

object XAttr {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    FirstChild: XNode,
    LastChild: XNode,
    LocalName: java.lang.String,
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NextSibling: XNode,
    NodeName: java.lang.String,
    NodeType: NodeType,
    NodeValue: java.lang.String,
    OwnerDocument: XDocument,
    OwnerElement: XElement,
    ParentNode: XNode,
    Prefix: java.lang.String,
    PreviousSibling: XNode,
    Specified: scala.Boolean,
    Value: java.lang.String,
    acquire: () => scala.Unit,
    appendChild: XNode => XNode,
    cloneNode: scala.Boolean => XNode,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getFirstChild: () => XNode,
    getLastChild: () => XNode,
    getLocalName: () => java.lang.String,
    getName: () => java.lang.String,
    getNamespaceURI: () => java.lang.String,
    getNextSibling: () => XNode,
    getNodeName: () => java.lang.String,
    getNodeType: () => NodeType,
    getNodeValue: () => java.lang.String,
    getOwnerDocument: () => XDocument,
    getOwnerElement: () => XElement,
    getParentNode: () => XNode,
    getPrefix: () => java.lang.String,
    getPreviousSibling: () => XNode,
    getSpecified: () => scala.Boolean,
    getValue: () => java.lang.String,
    hasAttributes: () => scala.Boolean,
    hasChildNodes: () => scala.Boolean,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (java.lang.String, java.lang.String) => scala.Boolean,
    normalize: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setNodeValue: java.lang.String => scala.Unit,
    setPrefix: java.lang.String => scala.Unit,
    setValue: java.lang.String => scala.Unit
  ): XAttr = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, FirstChild = FirstChild, LastChild = LastChild, LocalName = LocalName, Name = Name, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, OwnerElement = OwnerElement, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, Specified = Specified, Value = Value, acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getName = js.Any.fromFunction0(getName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getOwnerElement = js.Any.fromFunction0(getOwnerElement), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getSpecified = js.Any.fromFunction0(getSpecified), getValue = js.Any.fromFunction0(getValue), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[XAttr]
  }
}

