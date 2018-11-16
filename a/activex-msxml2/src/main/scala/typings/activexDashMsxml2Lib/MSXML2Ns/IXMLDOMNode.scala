package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Core DOM node interface */
@JSGlobal("MSXML2.IXMLDOMNode")
@js.native
class IXMLDOMNode protected () extends js.Object {
  var `MSXML2.IXMLDOMNode_typekey`: IXMLDOMNode = js.native
  /** the collection of the node's attributes */
  @JSName("attributes")
  val attributes_Original: IXMLDOMNamedNodeMap = js.native
  /** the base name of the node (nodename with the prefix stripped off) */
  val baseName: java.lang.String = js.native
  /** the collection of the node's children */
  @JSName("childNodes")
  val childNodes_Original: IXMLDOMNodeList = js.native
  /** the data type of the node */
  var dataType: js.Any = js.native
  /** pointer to the definition of the node in the DTD or schema */
  val definition: IXMLDOMNode = js.native
  /** first child of the node */
  val firstChild: IXMLDOMNode = js.native
  /** last child of the node */
  val lastChild: IXMLDOMNode = js.native
  /** the URI for the namespace applying to the node */
  val namespaceURI: java.lang.String = js.native
  /** right sibling of the node */
  val nextSibling: IXMLDOMNode = js.native
  /** name of the node */
  val nodeName: java.lang.String = js.native
  /** the node's type */
  val nodeType: DOMNodeType = js.native
  /** the type of node in string form */
  val nodeTypeString: java.lang.String = js.native
  /** get the strongly typed value of the node */
  var nodeTypedValue: js.Any = js.native
  /** value stored in the node */
  var nodeValue: js.Any = js.native
  /** document that contains the node */
  val ownerDocument: IXMLDOMDocument = js.native
  /** parent of the node */
  val parentNode: IXMLDOMNode = js.native
  /** has sub-tree been completely parsed */
  val parsed: scala.Boolean = js.native
  /** the prefix for the namespace applying to the node */
  val prefix: java.lang.String = js.native
  /** left sibling of the node */
  val previousSibling: IXMLDOMNode = js.native
  /** indicates whether node is a default value */
  val specified: scala.Boolean = js.native
  /** text content of the node and subtree */
  var text: java.lang.String = js.native
  /** return the XML source for the node and each of its descendants */
  val xml: java.lang.String = js.native
  /** append a child node */
  def appendChild(newChild: IXMLDOMNode): IXMLDOMNode = js.native
  /** collection of nodes */
  /** the collection of the node's attributes */
  def attributes(index: scala.Double): IXMLDOMNode = js.native
  /** collection of nodes */
  /** the collection of the node's children */
  def childNodes(index: scala.Double): IXMLDOMNode = js.native
  def cloneNode(deep: scala.Boolean): IXMLDOMNode = js.native
  def hasChildNodes(): scala.Boolean = js.native
  /** insert a child node */
  def insertBefore(newChild: IXMLDOMNode, refChild: js.Any): IXMLDOMNode = js.native
  /** remove a child node */
  def removeChild(childNode: IXMLDOMNode): IXMLDOMNode = js.native
  /** replace a child node */
  def replaceChild(newChild: IXMLDOMNode, oldChild: IXMLDOMNode): IXMLDOMNode = js.native
  /** execute query on the subtree */
  def selectNodes(queryString: java.lang.String): IXMLDOMNodeList = js.native
  /** execute query on the subtree */
  def selectSingleNode(queryString: java.lang.String): IXMLDOMNode = js.native
  /** apply the stylesheet to the subtree */
  def transformNode(stylesheet: IXMLDOMNode): java.lang.String = js.native
  /** apply the stylesheet to the subtree, returning the result through a document or a stream */
  def transformNodeToObject(stylesheet: IXMLDOMNode, outputObject: js.Any): scala.Unit = js.native
}

