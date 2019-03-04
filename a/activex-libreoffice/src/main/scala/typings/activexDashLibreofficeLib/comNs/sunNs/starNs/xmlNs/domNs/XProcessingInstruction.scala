package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XProcessingInstruction extends XNode {
  /** The content of this processing instruction. */
  var Data: java.lang.String
  /** The target of this processing instruction. */
  val Target: java.lang.String
  /** The content of this processing instruction. */
  def getData(): java.lang.String
  /** The target of this processing instruction. */
  def getTarget(): java.lang.String
  /** The content of this processing instruction. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. */
  def setData(data: java.lang.String): scala.Unit
}

object XProcessingInstruction {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Data: java.lang.String,
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
    Target: java.lang.String,
    acquire: js.Function0[scala.Unit],
    appendChild: js.Function1[XNode, XNode],
    cloneNode: js.Function1[scala.Boolean, XNode],
    getAttributes: js.Function0[XNamedNodeMap],
    getChildNodes: js.Function0[XNodeList],
    getData: js.Function0[java.lang.String],
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
    getTarget: js.Function0[java.lang.String],
    hasAttributes: js.Function0[scala.Boolean],
    hasChildNodes: js.Function0[scala.Boolean],
    insertBefore: js.Function2[XNode, XNode, XNode],
    isSupported: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    normalize: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChild: js.Function1[XNode, XNode],
    replaceChild: js.Function2[XNode, XNode, XNode],
    setData: js.Function1[java.lang.String, scala.Unit],
    setNodeValue: js.Function1[java.lang.String, scala.Unit],
    setPrefix: js.Function1[java.lang.String, scala.Unit]
  ): XProcessingInstruction = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, Data = Data, FirstChild = FirstChild, LastChild = LastChild, LocalName = LocalName, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, Target = Target, acquire = acquire, appendChild = appendChild, cloneNode = cloneNode, getAttributes = getAttributes, getChildNodes = getChildNodes, getData = getData, getFirstChild = getFirstChild, getLastChild = getLastChild, getLocalName = getLocalName, getNamespaceURI = getNamespaceURI, getNextSibling = getNextSibling, getNodeName = getNodeName, getNodeType = getNodeType, getNodeValue = getNodeValue, getOwnerDocument = getOwnerDocument, getParentNode = getParentNode, getPrefix = getPrefix, getPreviousSibling = getPreviousSibling, getTarget = getTarget, hasAttributes = hasAttributes, hasChildNodes = hasChildNodes, insertBefore = insertBefore, isSupported = isSupported, normalize = normalize, queryInterface = queryInterface, release = release, removeChild = removeChild, replaceChild = replaceChild, setData = setData, setNodeValue = setNodeValue, setPrefix = setPrefix)
  
    __obj.asInstanceOf[XProcessingInstruction]
  }
}

