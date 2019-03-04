package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XText extends XCharacterData {
  /**
    * Breaks this node into two nodes at the specified offset, keeping both in the tree as siblings. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised
    * if the specified offset is negative or greater than the number of 16-bit units in data. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def splitText(offset: scala.Double): XText
}

object XText {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Data: java.lang.String,
    FirstChild: XNode,
    LastChild: XNode,
    Length: scala.Double,
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
    appendData: js.Function1[java.lang.String, scala.Unit],
    cloneNode: js.Function1[scala.Boolean, XNode],
    deleteData: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAttributes: js.Function0[XNamedNodeMap],
    getChildNodes: js.Function0[XNodeList],
    getData: js.Function0[java.lang.String],
    getFirstChild: js.Function0[XNode],
    getLastChild: js.Function0[XNode],
    getLength: js.Function0[scala.Double],
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
    insertBefore: js.Function2[XNode, XNode, XNode],
    insertData: js.Function2[scala.Double, java.lang.String, scala.Unit],
    isSupported: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    normalize: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChild: js.Function1[XNode, XNode],
    replaceChild: js.Function2[XNode, XNode, XNode],
    replaceData: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Unit],
    setData: js.Function1[java.lang.String, scala.Unit],
    setNodeValue: js.Function1[java.lang.String, scala.Unit],
    setPrefix: js.Function1[java.lang.String, scala.Unit],
    splitText: js.Function1[scala.Double, XText],
    subStringData: js.Function2[scala.Double, scala.Double, java.lang.String]
  ): XText = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, Data = Data, FirstChild = FirstChild, LastChild = LastChild, Length = Length, LocalName = LocalName, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, acquire = acquire, appendChild = appendChild, appendData = appendData, cloneNode = cloneNode, deleteData = deleteData, getAttributes = getAttributes, getChildNodes = getChildNodes, getData = getData, getFirstChild = getFirstChild, getLastChild = getLastChild, getLength = getLength, getLocalName = getLocalName, getNamespaceURI = getNamespaceURI, getNextSibling = getNextSibling, getNodeName = getNodeName, getNodeType = getNodeType, getNodeValue = getNodeValue, getOwnerDocument = getOwnerDocument, getParentNode = getParentNode, getPrefix = getPrefix, getPreviousSibling = getPreviousSibling, hasAttributes = hasAttributes, hasChildNodes = hasChildNodes, insertBefore = insertBefore, insertData = insertData, isSupported = isSupported, normalize = normalize, queryInterface = queryInterface, release = release, removeChild = removeChild, replaceChild = replaceChild, replaceData = replaceData, setData = setData, setNodeValue = setNodeValue, setPrefix = setPrefix, splitText = splitText, subStringData = subStringData)
  
    __obj.asInstanceOf[XText]
  }
}

