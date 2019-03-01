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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attributes")(Attributes)
    __obj.updateDynamic("ChildNodes")(ChildNodes)
    __obj.updateDynamic("Data")(Data)
    __obj.updateDynamic("FirstChild")(FirstChild)
    __obj.updateDynamic("LastChild")(LastChild)
    __obj.updateDynamic("Length")(Length)
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
    __obj.updateDynamic("appendData")(appendData)
    __obj.updateDynamic("cloneNode")(cloneNode)
    __obj.updateDynamic("deleteData")(deleteData)
    __obj.updateDynamic("getAttributes")(getAttributes)
    __obj.updateDynamic("getChildNodes")(getChildNodes)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getFirstChild")(getFirstChild)
    __obj.updateDynamic("getLastChild")(getLastChild)
    __obj.updateDynamic("getLength")(getLength)
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
    __obj.updateDynamic("insertBefore")(insertBefore)
    __obj.updateDynamic("insertData")(insertData)
    __obj.updateDynamic("isSupported")(isSupported)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChild")(removeChild)
    __obj.updateDynamic("replaceChild")(replaceChild)
    __obj.updateDynamic("replaceData")(replaceData)
    __obj.updateDynamic("setData")(setData)
    __obj.updateDynamic("setNodeValue")(setNodeValue)
    __obj.updateDynamic("setPrefix")(setPrefix)
    __obj.updateDynamic("splitText")(splitText)
    __obj.updateDynamic("subStringData")(subStringData)
    __obj.asInstanceOf[XText]
  }
}

