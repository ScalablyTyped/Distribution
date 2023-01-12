package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXMLDOMDocument extends StObject {
  
  /* private */ @JSName("MSXML2.IXMLDOMDocument_typekey")
  var MSXML2DotIXMLDOMDocument_typekey: IXMLDOMDocument
  
  /** abort an asynchronous download */
  def abort(): Unit
  
  /** append a child node */
  def appendChild(newChild: IXMLDOMNode): IXMLDOMNode
  
  /** flag for asynchronous download */
  var async: Boolean
  
  /** collection of nodes */
  /** the collection of the node's attributes */
  def attributes(index: Double): IXMLDOMNode
  /** the collection of the node's attributes */
  @JSName("attributes")
  val attributes_Original: IXMLDOMNamedNodeMap
  
  /** the base name of the node (nodename with the prefix stripped off) */
  val baseName: String
  
  /** collection of nodes */
  /** the collection of the node's children */
  def childNodes(index: Double): IXMLDOMNode
  /** the collection of the node's children */
  @JSName("childNodes")
  val childNodes_Original: IXMLDOMNodeList
  
  def cloneNode(deep: Boolean): IXMLDOMNode
  
  /** create an attribute node */
  def createAttribute(name: String): IXMLDOMAttribute
  
  /** create a CDATA section node */
  def createCDATASection(data: String): IXMLDOMCDATASection
  
  /** create a comment node */
  def createComment(data: String): IXMLDOMComment
  
  /** create a DocumentFragment node */
  def createDocumentFragment(): IXMLDOMDocumentFragment
  
  /** create an Element node */
  def createElement(tagName: String): IXMLDOMElement
  
  /** create an entity reference node */
  def createEntityReference(name: String): IXMLDOMEntityReference
  
  /** create a node of the specified node type and name */
  def createNode(`type`: Any, name: String, namespaceURI: String): IXMLDOMNode
  
  /** create a processing instruction node */
  def createProcessingInstruction(target: String, data: String): IXMLDOMProcessingInstruction
  
  /** create a text node */
  def createTextNode(data: String): IXMLDOMText
  
  /** the data type of the node */
  var dataType: Any
  
  /** pointer to the definition of the node in the DTD or schema */
  val definition: IXMLDOMNode
  
  /** node corresponding to the DOCTYPE */
  val doctype: IXMLDOMDocumentType
  
  /** the root of the tree */
  var documentElement: IXMLDOMElement
  
  /** first child of the node */
  val firstChild: IXMLDOMNode
  
  /** build a list of elements by name */
  def getElementsByTagName(tagName: String): IXMLDOMNodeList
  
  def hasChildNodes(): Boolean
  
  /** info on this DOM implementation */
  val implementation: IXMLDOMImplementation
  
  /** insert a child node */
  def insertBefore(newChild: IXMLDOMNode, refChild: Any): IXMLDOMNode
  
  /** last child of the node */
  val lastChild: IXMLDOMNode
  
  /** load document from the specified XML source */
  def load(xmlSource: Any): Boolean
  
  /** load the document from a string */
  def loadXML(bstrXML: String): Boolean
  
  /** the URI for the namespace applying to the node */
  val namespaceURI: String
  
  /** right sibling of the node */
  val nextSibling: IXMLDOMNode
  
  /** retrieve node from it's ID */
  def nodeFromID(idString: String): IXMLDOMNode
  
  /** name of the node */
  val nodeName: String
  
  /** the node's type */
  val nodeType: DOMNodeType
  
  /** the type of node in string form */
  val nodeTypeString: String
  
  /** get the strongly typed value of the node */
  var nodeTypedValue: Any
  
  /** value stored in the node */
  var nodeValue: Any
  
  /** register an ondataavailable event handler */
  val ondataavailable: Any
  
  /** register a readystatechange event handler */
  val onreadystatechange: Any
  
  /** register an ontransformnode event handler */
  val ontransformnode: Any
  
  /** document that contains the node */
  val ownerDocument: IXMLDOMDocument
  
  /** parent of the node */
  val parentNode: IXMLDOMNode
  
  /** get the last parser error */
  val parseError: IXMLDOMParseError
  
  /** has sub-tree been completely parsed */
  val parsed: Boolean
  
  /** the prefix for the namespace applying to the node */
  val prefix: String
  
  /** indicates whether the parser preserves whitespace */
  var preserveWhiteSpace: Boolean
  
  /** left sibling of the node */
  val previousSibling: IXMLDOMNode
  
  /** get the state of the XML document */
  val readyState: Double
  
  /** remove a child node */
  def removeChild(childNode: IXMLDOMNode): IXMLDOMNode
  
  /** replace a child node */
  def replaceChild(newChild: IXMLDOMNode, oldChild: IXMLDOMNode): IXMLDOMNode
  
  /** indicates whether the parser resolves references to external DTD/Entities/Schema */
  var resolveExternals: Boolean
  
  /** save the document to a specified destination */
  def save(destination: Any): Unit
  
  /** execute query on the subtree */
  def selectNodes(queryString: String): IXMLDOMNodeList
  
  /** execute query on the subtree */
  def selectSingleNode(queryString: String): IXMLDOMNode
  
  /** indicates whether node is a default value */
  val specified: Boolean
  
  /** text content of the node and subtree */
  var text: String
  
  /** apply the stylesheet to the subtree */
  def transformNode(stylesheet: IXMLDOMNode): String
  
  /** apply the stylesheet to the subtree, returning the result through a document or a stream */
  def transformNodeToObject(stylesheet: IXMLDOMNode, outputObject: Any): Unit
  
  /** get the URL for the loaded XML document */
  val url: String
  
  /** indicates whether the parser performs validation */
  var validateOnParse: Boolean
  
  /** return the XML source for the node and each of its descendants */
  val xml: String
}
object IXMLDOMDocument {
  
  inline def apply(
    MSXML2DotIXMLDOMDocument_typekey: IXMLDOMDocument,
    abort: () => Unit,
    appendChild: IXMLDOMNode => IXMLDOMNode,
    async: Boolean,
    attributes: IXMLDOMNamedNodeMap,
    baseName: String,
    childNodes: IXMLDOMNodeList,
    cloneNode: Boolean => IXMLDOMNode,
    createAttribute: String => IXMLDOMAttribute,
    createCDATASection: String => IXMLDOMCDATASection,
    createComment: String => IXMLDOMComment,
    createDocumentFragment: () => IXMLDOMDocumentFragment,
    createElement: String => IXMLDOMElement,
    createEntityReference: String => IXMLDOMEntityReference,
    createNode: (Any, String, String) => IXMLDOMNode,
    createProcessingInstruction: (String, String) => IXMLDOMProcessingInstruction,
    createTextNode: String => IXMLDOMText,
    dataType: Any,
    definition: IXMLDOMNode,
    doctype: IXMLDOMDocumentType,
    documentElement: IXMLDOMElement,
    firstChild: IXMLDOMNode,
    getElementsByTagName: String => IXMLDOMNodeList,
    hasChildNodes: () => Boolean,
    implementation: IXMLDOMImplementation,
    insertBefore: (IXMLDOMNode, Any) => IXMLDOMNode,
    lastChild: IXMLDOMNode,
    load: Any => Boolean,
    loadXML: String => Boolean,
    namespaceURI: String,
    nextSibling: IXMLDOMNode,
    nodeFromID: String => IXMLDOMNode,
    nodeName: String,
    nodeType: DOMNodeType,
    nodeTypeString: String,
    nodeTypedValue: Any,
    nodeValue: Any,
    ondataavailable: Any,
    onreadystatechange: Any,
    ontransformnode: Any,
    ownerDocument: IXMLDOMDocument,
    parentNode: IXMLDOMNode,
    parseError: IXMLDOMParseError,
    parsed: Boolean,
    prefix: String,
    preserveWhiteSpace: Boolean,
    previousSibling: IXMLDOMNode,
    readyState: Double,
    removeChild: IXMLDOMNode => IXMLDOMNode,
    replaceChild: (IXMLDOMNode, IXMLDOMNode) => IXMLDOMNode,
    resolveExternals: Boolean,
    save: Any => Unit,
    selectNodes: String => IXMLDOMNodeList,
    selectSingleNode: String => IXMLDOMNode,
    specified: Boolean,
    text: String,
    transformNode: IXMLDOMNode => String,
    transformNodeToObject: (IXMLDOMNode, Any) => Unit,
    url: String,
    validateOnParse: Boolean,
    xml: String
  ): IXMLDOMDocument = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), appendChild = js.Any.fromFunction1(appendChild), async = async.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), createAttribute = js.Any.fromFunction1(createAttribute), createCDATASection = js.Any.fromFunction1(createCDATASection), createComment = js.Any.fromFunction1(createComment), createDocumentFragment = js.Any.fromFunction0(createDocumentFragment), createElement = js.Any.fromFunction1(createElement), createEntityReference = js.Any.fromFunction1(createEntityReference), createNode = js.Any.fromFunction3(createNode), createProcessingInstruction = js.Any.fromFunction2(createProcessingInstruction), createTextNode = js.Any.fromFunction1(createTextNode), dataType = dataType.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], doctype = doctype.asInstanceOf[js.Any], documentElement = documentElement.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), hasChildNodes = js.Any.fromFunction0(hasChildNodes), implementation = implementation.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), loadXML = js.Any.fromFunction1(loadXML), namespaceURI = namespaceURI.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeFromID = js.Any.fromFunction1(nodeFromID), nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeTypeString = nodeTypeString.asInstanceOf[js.Any], nodeTypedValue = nodeTypedValue.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], ondataavailable = ondataavailable.asInstanceOf[js.Any], onreadystatechange = onreadystatechange.asInstanceOf[js.Any], ontransformnode = ontransformnode.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], parseError = parseError.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], preserveWhiteSpace = preserveWhiteSpace.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), resolveExternals = resolveExternals.asInstanceOf[js.Any], save = js.Any.fromFunction1(save), selectNodes = js.Any.fromFunction1(selectNodes), selectSingleNode = js.Any.fromFunction1(selectSingleNode), specified = specified.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transformNode = js.Any.fromFunction1(transformNode), transformNodeToObject = js.Any.fromFunction2(transformNodeToObject), url = url.asInstanceOf[js.Any], validateOnParse = validateOnParse.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.IXMLDOMDocument_typekey")(MSXML2DotIXMLDOMDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLDOMDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IXMLDOMDocument] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setAppendChild(value: IXMLDOMNode => IXMLDOMNode): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: IXMLDOMNamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setBaseName(value: String): Self = StObject.set(x, "baseName", value.asInstanceOf[js.Any])
    
    inline def setChildNodes(value: IXMLDOMNodeList): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setCloneNode(value: Boolean => IXMLDOMNode): Self = StObject.set(x, "cloneNode", js.Any.fromFunction1(value))
    
    inline def setCreateAttribute(value: String => IXMLDOMAttribute): Self = StObject.set(x, "createAttribute", js.Any.fromFunction1(value))
    
    inline def setCreateCDATASection(value: String => IXMLDOMCDATASection): Self = StObject.set(x, "createCDATASection", js.Any.fromFunction1(value))
    
    inline def setCreateComment(value: String => IXMLDOMComment): Self = StObject.set(x, "createComment", js.Any.fromFunction1(value))
    
    inline def setCreateDocumentFragment(value: () => IXMLDOMDocumentFragment): Self = StObject.set(x, "createDocumentFragment", js.Any.fromFunction0(value))
    
    inline def setCreateElement(value: String => IXMLDOMElement): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
    
    inline def setCreateEntityReference(value: String => IXMLDOMEntityReference): Self = StObject.set(x, "createEntityReference", js.Any.fromFunction1(value))
    
    inline def setCreateNode(value: (Any, String, String) => IXMLDOMNode): Self = StObject.set(x, "createNode", js.Any.fromFunction3(value))
    
    inline def setCreateProcessingInstruction(value: (String, String) => IXMLDOMProcessingInstruction): Self = StObject.set(x, "createProcessingInstruction", js.Any.fromFunction2(value))
    
    inline def setCreateTextNode(value: String => IXMLDOMText): Self = StObject.set(x, "createTextNode", js.Any.fromFunction1(value))
    
    inline def setDataType(value: Any): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: IXMLDOMNode): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDoctype(value: IXMLDOMDocumentType): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
    
    inline def setDocumentElement(value: IXMLDOMElement): Self = StObject.set(x, "documentElement", value.asInstanceOf[js.Any])
    
    inline def setFirstChild(value: IXMLDOMNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    inline def setGetElementsByTagName(value: String => IXMLDOMNodeList): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    
    inline def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
    
    inline def setImplementation(value: IXMLDOMImplementation): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setInsertBefore(value: (IXMLDOMNode, Any) => IXMLDOMNode): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    inline def setLastChild(value: IXMLDOMNode): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: Any => Boolean): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setLoadXML(value: String => Boolean): Self = StObject.set(x, "loadXML", js.Any.fromFunction1(value))
    
    inline def setMSXML2DotIXMLDOMDocument_typekey(value: IXMLDOMDocument): Self = StObject.set(x, "MSXML2.IXMLDOMDocument_typekey", value.asInstanceOf[js.Any])
    
    inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    inline def setNextSibling(value: IXMLDOMNode): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    inline def setNodeFromID(value: String => IXMLDOMNode): Self = StObject.set(x, "nodeFromID", js.Any.fromFunction1(value))
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeType(value: DOMNodeType): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeString(value: String): Self = StObject.set(x, "nodeTypeString", value.asInstanceOf[js.Any])
    
    inline def setNodeTypedValue(value: Any): Self = StObject.set(x, "nodeTypedValue", value.asInstanceOf[js.Any])
    
    inline def setNodeValue(value: Any): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setOndataavailable(value: Any): Self = StObject.set(x, "ondataavailable", value.asInstanceOf[js.Any])
    
    inline def setOnreadystatechange(value: Any): Self = StObject.set(x, "onreadystatechange", value.asInstanceOf[js.Any])
    
    inline def setOntransformnode(value: Any): Self = StObject.set(x, "ontransformnode", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocument(value: IXMLDOMDocument): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setParentNode(value: IXMLDOMNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParseError(value: IXMLDOMParseError): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
    
    inline def setParsed(value: Boolean): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhiteSpace(value: Boolean): Self = StObject.set(x, "preserveWhiteSpace", value.asInstanceOf[js.Any])
    
    inline def setPreviousSibling(value: IXMLDOMNode): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    inline def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    inline def setRemoveChild(value: IXMLDOMNode => IXMLDOMNode): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    inline def setReplaceChild(value: (IXMLDOMNode, IXMLDOMNode) => IXMLDOMNode): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    inline def setResolveExternals(value: Boolean): Self = StObject.set(x, "resolveExternals", value.asInstanceOf[js.Any])
    
    inline def setSave(value: Any => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    inline def setSelectNodes(value: String => IXMLDOMNodeList): Self = StObject.set(x, "selectNodes", js.Any.fromFunction1(value))
    
    inline def setSelectSingleNode(value: String => IXMLDOMNode): Self = StObject.set(x, "selectSingleNode", js.Any.fromFunction1(value))
    
    inline def setSpecified(value: Boolean): Self = StObject.set(x, "specified", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTransformNode(value: IXMLDOMNode => String): Self = StObject.set(x, "transformNode", js.Any.fromFunction1(value))
    
    inline def setTransformNodeToObject(value: (IXMLDOMNode, Any) => Unit): Self = StObject.set(x, "transformNodeToObject", js.Any.fromFunction2(value))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setValidateOnParse(value: Boolean): Self = StObject.set(x, "validateOnParse", value.asInstanceOf[js.Any])
    
    inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
