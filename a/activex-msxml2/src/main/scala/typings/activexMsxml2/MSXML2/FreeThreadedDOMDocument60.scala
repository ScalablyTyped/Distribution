package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** W3C-DOM XML Document 6.0 (Free threaded) */
@JSGlobal("MSXML2.FreeThreadedDOMDocument60")
@js.native
class FreeThreadedDOMDocument60 protected () extends js.Object {
  @JSName("MSXML2.FreeThreadedDOMDocument60_typekey")
  var MSXML2DotFreeThreadedDOMDocument60_typekey: FreeThreadedDOMDocument60 = js.native
  /** flag for asynchronous download */
  var async: Boolean = js.native
  /** the collection of the node's attributes */
  @JSName("attributes")
  val attributes_Original: IXMLDOMNamedNodeMap = js.native
  /** the base name of the node (nodename with the prefix stripped off) */
  val baseName: String = js.native
  /** the collection of the node's children */
  @JSName("childNodes")
  val childNodes_Original: IXMLDOMNodeList = js.native
  /** the data type of the node */
  var dataType: js.Any = js.native
  /** pointer to the definition of the node in the DTD or schema */
  val definition: IXMLDOMNode = js.native
  /** node corresponding to the DOCTYPE */
  val doctype: IXMLDOMDocumentType = js.native
  /** the root of the tree */
  var documentElement: IXMLDOMElement = js.native
  /** first child of the node */
  val firstChild: IXMLDOMNode = js.native
  /** info on this DOM implementation */
  val implementation: IXMLDOMImplementation = js.native
  /** last child of the node */
  val lastChild: IXMLDOMNode = js.native
  /** the URI for the namespace applying to the node */
  val namespaceURI: String = js.native
  /** A collection of all namespaces for this document */
  @JSName("namespaces")
  val namespaces_Original: IXMLDOMSchemaCollection = js.native
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
  /** register an ondataavailable event handler */
  val ondataavailable: js.Any = js.native
  /** register a readystatechange event handler */
  val onreadystatechange: js.Any = js.native
  /** register an ontransformnode event handler */
  val ontransformnode: js.Any = js.native
  /** document that contains the node */
  val ownerDocument: IXMLDOMDocument = js.native
  /** parent of the node */
  val parentNode: IXMLDOMNode = js.native
  /** get the last parser error */
  val parseError: IXMLDOMParseError = js.native
  /** has sub-tree been completely parsed */
  val parsed: Boolean = js.native
  /** the prefix for the namespace applying to the node */
  val prefix: String = js.native
  /** indicates whether the parser preserves whitespace */
  var preserveWhiteSpace: Boolean = js.native
  /** left sibling of the node */
  val previousSibling: IXMLDOMNode = js.native
  /** get the state of the XML document */
  val readyState: Double = js.native
  /** indicates whether the parser resolves references to external DTD/Entities/Schema */
  var resolveExternals: Boolean = js.native
  /** The associated schema cache */
  var schemas: js.Any = js.native
  /** indicates whether node is a default value */
  val specified: Boolean = js.native
  /** text content of the node and subtree */
  var text: String = js.native
  /** get the URL for the loaded XML document */
  val url: String = js.native
  /** indicates whether the parser performs validation */
  var validateOnParse: Boolean = js.native
  /** return the XML source for the node and each of its descendants */
  val xml: String = js.native
  /** abort an asynchronous download */
  def abort(): Unit = js.native
  /** append a child node */
  def appendChild(newChild: IXMLDOMNode): IXMLDOMNode = js.native
  /** collection of nodes */
  /** the collection of the node's attributes */
  def attributes(index: Double): IXMLDOMNode = js.native
  /** collection of nodes */
  /** the collection of the node's children */
  def childNodes(index: Double): IXMLDOMNode = js.native
  def cloneNode(deep: Boolean): IXMLDOMNode = js.native
  /** create an attribute node */
  def createAttribute(name: String): IXMLDOMAttribute = js.native
  /** create a CDATA section node */
  def createCDATASection(data: String): IXMLDOMCDATASection = js.native
  /** create a comment node */
  def createComment(data: String): IXMLDOMComment = js.native
  /** create a DocumentFragment node */
  def createDocumentFragment(): IXMLDOMDocumentFragment = js.native
  /** create an Element node */
  def createElement(tagName: String): IXMLDOMElement = js.native
  /** create an entity reference node */
  def createEntityReference(name: String): IXMLDOMEntityReference = js.native
  /** create a node of the specified node type and name */
  def createNode(`type`: js.Any, name: String, namespaceURI: String): IXMLDOMNode = js.native
  /** create a processing instruction node */
  def createProcessingInstruction(target: String, data: String): IXMLDOMProcessingInstruction = js.native
  /** create a text node */
  def createTextNode(data: String): IXMLDOMText = js.native
  /** build a list of elements by name */
  def getElementsByTagName(tagName: String): IXMLDOMNodeList = js.native
  /** get the value of the named property */
  def getProperty(name: String): js.Any = js.native
  def hasChildNodes(): Boolean = js.native
  /** clone node such that clones ownerDocument is this document */
  def importNode(node: IXMLDOMNode, deep: Boolean): IXMLDOMNode = js.native
  /** insert a child node */
  def insertBefore(newChild: IXMLDOMNode, refChild: js.Any): IXMLDOMNode = js.native
  /** load document from the specified XML source */
  def load(xmlSource: js.Any): Boolean = js.native
  /** load the document from a string */
  def loadXML(bstrXML: String): Boolean = js.native
  /** Get namespaceURI for schema by index */
  /** A collection of all namespaces for this document */
  def namespaces(index: Double): String = js.native
  /** retrieve node from it's ID */
  def nodeFromID(idString: String): IXMLDOMNode = js.native
  /** remove a child node */
  def removeChild(childNode: IXMLDOMNode): IXMLDOMNode = js.native
  /** replace a child node */
  def replaceChild(newChild: IXMLDOMNode, oldChild: IXMLDOMNode): IXMLDOMNode = js.native
  /** save the document to a specified destination */
  def save(destination: js.Any): Unit = js.native
  /** execute query on the subtree */
  def selectNodes(queryString: String): IXMLDOMNodeList = js.native
  /** execute query on the subtree */
  def selectSingleNode(queryString: String): IXMLDOMNode = js.native
  /** set the value of the named property */
  def setProperty(name: String, value: js.Any): Unit = js.native
  /** apply the stylesheet to the subtree */
  def transformNode(stylesheet: IXMLDOMNode): String = js.native
  /** apply the stylesheet to the subtree, returning the result through a document or a stream */
  def transformNodeToObject(stylesheet: IXMLDOMNode, outputObject: js.Any): Unit = js.native
  /** perform runtime validation on the currently loaded XML document */
  def validate(): IXMLDOMParseError = js.native
  /** perform runtime validation on the currently loaded XML document node */
  def validateNode(node: IXMLDOMNode): IXMLDOMParseError = js.native
}

