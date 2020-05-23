package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXMLDOMText extends js.Object {
  @JSName("MSXML2.IXMLDOMText_typekey")
  var MSXML2DotIXMLDOMText_typekey: IXMLDOMText = js.native
  /** the collection of the node's attributes */
  @JSName("attributes")
  val attributes_Original: IXMLDOMNamedNodeMap = js.native
  /** the base name of the node (nodename with the prefix stripped off) */
  val baseName: String = js.native
  /** the collection of the node's children */
  @JSName("childNodes")
  val childNodes_Original: IXMLDOMNodeList = js.native
  /** value of the node */
  var data: String = js.native
  /** the data type of the node */
  var dataType: js.Any = js.native
  /** pointer to the definition of the node in the DTD or schema */
  val definition: IXMLDOMNode = js.native
  /** first child of the node */
  val firstChild: IXMLDOMNode = js.native
  /** last child of the node */
  val lastChild: IXMLDOMNode = js.native
  /** number of characters in value */
  val length: Double = js.native
  /** the URI for the namespace applying to the node */
  val namespaceURI: String = js.native
  /** right sibling of the node */
  val nextSibling: IXMLDOMNode = js.native
  /** name of the node */
  val nodeName: String = js.native
  /** the node's type */
  val nodeType: DOMNodeType = js.native
  /** the type of node in string form */
  val nodeTypeString: String = js.native
  /** get the strongly typed value of the node */
  var nodeTypedValue: js.Any = js.native
  /** value stored in the node */
  var nodeValue: js.Any = js.native
  /** document that contains the node */
  val ownerDocument: IXMLDOMDocument = js.native
  /** parent of the node */
  val parentNode: IXMLDOMNode = js.native
  /** has sub-tree been completely parsed */
  val parsed: Boolean = js.native
  /** the prefix for the namespace applying to the node */
  val prefix: String = js.native
  /** left sibling of the node */
  val previousSibling: IXMLDOMNode = js.native
  /** indicates whether node is a default value */
  val specified: Boolean = js.native
  /** text content of the node and subtree */
  var text: String = js.native
  /** return the XML source for the node and each of its descendants */
  val xml: String = js.native
  /** append a child node */
  def appendChild(newChild: IXMLDOMNode): IXMLDOMNode = js.native
  /** append string to value */
  def appendData(data: String): Unit = js.native
  /** collection of nodes */
  /** the collection of the node's attributes */
  def attributes(index: Double): IXMLDOMNode = js.native
  /** collection of nodes */
  /** the collection of the node's children */
  def childNodes(index: Double): IXMLDOMNode = js.native
  def cloneNode(deep: Boolean): IXMLDOMNode = js.native
  /** delete string within the value */
  def deleteData(offset: Double, count: Double): Unit = js.native
  def hasChildNodes(): Boolean = js.native
  /** insert a child node */
  def insertBefore(newChild: IXMLDOMNode, refChild: js.Any): IXMLDOMNode = js.native
  /** insert string into value */
  def insertData(offset: Double, data: String): Unit = js.native
  /** remove a child node */
  def removeChild(childNode: IXMLDOMNode): IXMLDOMNode = js.native
  /** replace a child node */
  def replaceChild(newChild: IXMLDOMNode, oldChild: IXMLDOMNode): IXMLDOMNode = js.native
  /** replace string within the value */
  def replaceData(offset: Double, count: Double, data: String): Unit = js.native
  /** execute query on the subtree */
  def selectNodes(queryString: String): IXMLDOMNodeList = js.native
  /** execute query on the subtree */
  def selectSingleNode(queryString: String): IXMLDOMNode = js.native
  /** split the text node into two text nodes at the position specified */
  def splitText(offset: Double): IXMLDOMText = js.native
  /** retrieve substring of value */
  def substringData(offset: Double, count: Double): String = js.native
  /** apply the stylesheet to the subtree */
  def transformNode(stylesheet: IXMLDOMNode): String = js.native
  /** apply the stylesheet to the subtree, returning the result through a document or a stream */
  def transformNodeToObject(stylesheet: IXMLDOMNode, outputObject: js.Any): Unit = js.native
}

