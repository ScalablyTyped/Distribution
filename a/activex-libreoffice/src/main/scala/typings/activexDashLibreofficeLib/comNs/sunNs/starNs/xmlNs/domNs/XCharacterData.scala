package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCharacterData extends XNode {
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  var Data: java.lang.String
  /** The number of 16-bit units that are available through data and the substringData method below. */
  val Length: scala.Double
  /**
    * Append the string to the end of the character data of the node. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is
    * readonly.
    */
  def appendData(arg: java.lang.String): scala.Unit
  /**
    * Remove a range of 16-bit units from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater
    * than the number of 16-bit units in data, or if the specified count is negative. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def deleteData(offset: scala.Double, count: scala.Double): scala.Unit
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def getData(): java.lang.String
  /** The number of 16-bit units that are available through data and the substringData method below. */
  def getLength(): scala.Double
  /**
    * Insert a string at the specified 16-bit unit offset. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or
    * greater than the number of 16-bit units in data. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def insertData(offset: scala.Double, arg: java.lang.String): scala.Unit
  /**
    * Replace the characters starting at the specified 16-bit unit offset with the specified string. Throws; {@link DOMException} - INDEX_SIZE_ERR: Raised
    * if the specified offset is negative or greater than the number of 16-bit units in data, or if the specified count is negative.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def replaceData(offset: scala.Double, count: scala.Double, arg: java.lang.String): scala.Unit
  /**
    * Set the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is
    * readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def setData(data: java.lang.String): scala.Unit
  /**
    * Extracts a range of data from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater than the
    * number of 16-bit units in data, or if the specified count is negative. DOMSTRING_SIZE_ERR: Raised if the specified range of text does not fit into a
    * DOMString.
    */
  def subStringData(offset: scala.Double, count: scala.Double): java.lang.String
}

object XCharacterData {
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
    acquire: () => scala.Unit,
    appendChild: XNode => XNode,
    appendData: java.lang.String => scala.Unit,
    cloneNode: scala.Boolean => XNode,
    deleteData: (scala.Double, scala.Double) => scala.Unit,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getData: () => java.lang.String,
    getFirstChild: () => XNode,
    getLastChild: () => XNode,
    getLength: () => scala.Double,
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
    hasAttributes: () => scala.Boolean,
    hasChildNodes: () => scala.Boolean,
    insertBefore: (XNode, XNode) => XNode,
    insertData: (scala.Double, java.lang.String) => scala.Unit,
    isSupported: (java.lang.String, java.lang.String) => scala.Boolean,
    normalize: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    replaceData: (scala.Double, scala.Double, java.lang.String) => scala.Unit,
    setData: java.lang.String => scala.Unit,
    setNodeValue: java.lang.String => scala.Unit,
    setPrefix: java.lang.String => scala.Unit,
    subStringData: (scala.Double, scala.Double) => java.lang.String
  ): XCharacterData = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, Data = Data, FirstChild = FirstChild, LastChild = LastChild, Length = Length, LocalName = LocalName, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1(appendData), cloneNode = js.Any.fromFunction1(cloneNode), deleteData = js.Any.fromFunction2(deleteData), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getData = js.Any.fromFunction0(getData), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLength = js.Any.fromFunction0(getLength), getLocalName = js.Any.fromFunction0(getLocalName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2(insertData), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3(replaceData), setData = js.Any.fromFunction1(setData), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix), subStringData = js.Any.fromFunction2(subStringData))
  
    __obj.asInstanceOf[XCharacterData]
  }
}

