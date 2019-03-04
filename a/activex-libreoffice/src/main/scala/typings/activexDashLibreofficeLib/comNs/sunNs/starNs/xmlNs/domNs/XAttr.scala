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
    acquire: js.Function0[scala.Unit],
    appendChild: js.Function1[XNode, XNode],
    cloneNode: js.Function1[scala.Boolean, XNode],
    getAttributes: js.Function0[XNamedNodeMap],
    getChildNodes: js.Function0[XNodeList],
    getFirstChild: js.Function0[XNode],
    getLastChild: js.Function0[XNode],
    getLocalName: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getNamespaceURI: js.Function0[java.lang.String],
    getNextSibling: js.Function0[XNode],
    getNodeName: js.Function0[java.lang.String],
    getNodeType: js.Function0[NodeType],
    getNodeValue: js.Function0[java.lang.String],
    getOwnerDocument: js.Function0[XDocument],
    getOwnerElement: js.Function0[XElement],
    getParentNode: js.Function0[XNode],
    getPrefix: js.Function0[java.lang.String],
    getPreviousSibling: js.Function0[XNode],
    getSpecified: js.Function0[scala.Boolean],
    getValue: js.Function0[java.lang.String],
    hasAttributes: js.Function0[scala.Boolean],
    hasChildNodes: js.Function0[scala.Boolean],
    insertBefore: js.Function2[XNode, XNode, XNode],
    isSupported: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    normalize: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChild: js.Function1[XNode, XNode],
    replaceChild: js.Function2[XNode, XNode, XNode],
    setNodeValue: js.Function1[java.lang.String, scala.Unit],
    setPrefix: js.Function1[java.lang.String, scala.Unit],
    setValue: js.Function1[java.lang.String, scala.Unit]
  ): XAttr = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, FirstChild = FirstChild, LastChild = LastChild, LocalName = LocalName, Name = Name, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, OwnerElement = OwnerElement, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, Specified = Specified, Value = Value, acquire = acquire, appendChild = appendChild, cloneNode = cloneNode, getAttributes = getAttributes, getChildNodes = getChildNodes, getFirstChild = getFirstChild, getLastChild = getLastChild, getLocalName = getLocalName, getName = getName, getNamespaceURI = getNamespaceURI, getNextSibling = getNextSibling, getNodeName = getNodeName, getNodeType = getNodeType, getNodeValue = getNodeValue, getOwnerDocument = getOwnerDocument, getOwnerElement = getOwnerElement, getParentNode = getParentNode, getPrefix = getPrefix, getPreviousSibling = getPreviousSibling, getSpecified = getSpecified, getValue = getValue, hasAttributes = hasAttributes, hasChildNodes = hasChildNodes, insertBefore = insertBefore, isSupported = isSupported, normalize = normalize, queryInterface = queryInterface, release = release, removeChild = removeChild, replaceChild = replaceChild, setNodeValue = setNodeValue, setPrefix = setPrefix, setValue = setValue)
  
    __obj.asInstanceOf[XAttr]
  }
}

