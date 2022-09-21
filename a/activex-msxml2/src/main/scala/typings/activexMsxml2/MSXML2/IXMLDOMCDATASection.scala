package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXMLDOMCDATASection extends StObject {
  
  /* private */ @JSName("MSXML2.IXMLDOMCDATASection_typekey")
  var MSXML2DotIXMLDOMCDATASection_typekey: IXMLDOMCDATASection
  
  /** append a child node */
  def appendChild(newChild: IXMLDOMNode): IXMLDOMNode
  
  /** append string to value */
  def appendData(data: String): Unit
  
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
  
  /** value of the node */
  var data: String
  
  /** the data type of the node */
  var dataType: Any
  
  /** pointer to the definition of the node in the DTD or schema */
  val definition: IXMLDOMNode
  
  /** delete string within the value */
  def deleteData(offset: Double, count: Double): Unit
  
  /** first child of the node */
  val firstChild: IXMLDOMNode
  
  def hasChildNodes(): Boolean
  
  /** insert a child node */
  def insertBefore(newChild: IXMLDOMNode, refChild: Any): IXMLDOMNode
  
  /** insert string into value */
  def insertData(offset: Double, data: String): Unit
  
  /** last child of the node */
  val lastChild: IXMLDOMNode
  
  /** number of characters in value */
  val length: Double
  
  /** the URI for the namespace applying to the node */
  val namespaceURI: String
  
  /** right sibling of the node */
  val nextSibling: IXMLDOMNode
  
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
  
  /** document that contains the node */
  val ownerDocument: IXMLDOMDocument
  
  /** parent of the node */
  val parentNode: IXMLDOMNode
  
  /** has sub-tree been completely parsed */
  val parsed: Boolean
  
  /** the prefix for the namespace applying to the node */
  val prefix: String
  
  /** left sibling of the node */
  val previousSibling: IXMLDOMNode
  
  /** remove a child node */
  def removeChild(childNode: IXMLDOMNode): IXMLDOMNode
  
  /** replace a child node */
  def replaceChild(newChild: IXMLDOMNode, oldChild: IXMLDOMNode): IXMLDOMNode
  
  /** replace string within the value */
  def replaceData(offset: Double, count: Double, data: String): Unit
  
  /** execute query on the subtree */
  def selectNodes(queryString: String): IXMLDOMNodeList
  
  /** execute query on the subtree */
  def selectSingleNode(queryString: String): IXMLDOMNode
  
  /** indicates whether node is a default value */
  val specified: Boolean
  
  /** split the text node into two text nodes at the position specified */
  def splitText(offset: Double): IXMLDOMText
  
  /** retrieve substring of value */
  def substringData(offset: Double, count: Double): String
  
  /** text content of the node and subtree */
  var text: String
  
  /** apply the stylesheet to the subtree */
  def transformNode(stylesheet: IXMLDOMNode): String
  
  /** apply the stylesheet to the subtree, returning the result through a document or a stream */
  def transformNodeToObject(stylesheet: IXMLDOMNode, outputObject: Any): Unit
  
  /** return the XML source for the node and each of its descendants */
  val xml: String
}
object IXMLDOMCDATASection {
  
  inline def apply(
    MSXML2DotIXMLDOMCDATASection_typekey: IXMLDOMCDATASection,
    appendChild: IXMLDOMNode => IXMLDOMNode,
    appendData: String => Unit,
    attributes: IXMLDOMNamedNodeMap,
    baseName: String,
    childNodes: IXMLDOMNodeList,
    cloneNode: Boolean => IXMLDOMNode,
    data: String,
    dataType: Any,
    definition: IXMLDOMNode,
    deleteData: (Double, Double) => Unit,
    firstChild: IXMLDOMNode,
    hasChildNodes: () => Boolean,
    insertBefore: (IXMLDOMNode, Any) => IXMLDOMNode,
    insertData: (Double, String) => Unit,
    lastChild: IXMLDOMNode,
    length: Double,
    namespaceURI: String,
    nextSibling: IXMLDOMNode,
    nodeName: String,
    nodeType: DOMNodeType,
    nodeTypeString: String,
    nodeTypedValue: Any,
    nodeValue: Any,
    ownerDocument: IXMLDOMDocument,
    parentNode: IXMLDOMNode,
    parsed: Boolean,
    prefix: String,
    previousSibling: IXMLDOMNode,
    removeChild: IXMLDOMNode => IXMLDOMNode,
    replaceChild: (IXMLDOMNode, IXMLDOMNode) => IXMLDOMNode,
    replaceData: (Double, Double, String) => Unit,
    selectNodes: String => IXMLDOMNodeList,
    selectSingleNode: String => IXMLDOMNode,
    specified: Boolean,
    splitText: Double => IXMLDOMText,
    substringData: (Double, Double) => String,
    text: String,
    transformNode: IXMLDOMNode => String,
    transformNodeToObject: (IXMLDOMNode, Any) => Unit,
    xml: String
  ): IXMLDOMCDATASection = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1(appendData), attributes = attributes.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], deleteData = js.Any.fromFunction2(deleteData), firstChild = firstChild.asInstanceOf[js.Any], hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2(insertData), lastChild = lastChild.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeTypeString = nodeTypeString.asInstanceOf[js.Any], nodeTypedValue = nodeTypedValue.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3(replaceData), selectNodes = js.Any.fromFunction1(selectNodes), selectSingleNode = js.Any.fromFunction1(selectSingleNode), specified = specified.asInstanceOf[js.Any], splitText = js.Any.fromFunction1(splitText), substringData = js.Any.fromFunction2(substringData), text = text.asInstanceOf[js.Any], transformNode = js.Any.fromFunction1(transformNode), transformNodeToObject = js.Any.fromFunction2(transformNodeToObject), xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.IXMLDOMCDATASection_typekey")(MSXML2DotIXMLDOMCDATASection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLDOMCDATASection]
  }
  
  extension [Self <: IXMLDOMCDATASection](x: Self) {
    
    inline def setAppendChild(value: IXMLDOMNode => IXMLDOMNode): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setAppendData(value: String => Unit): Self = StObject.set(x, "appendData", js.Any.fromFunction1(value))
    
    inline def setAttributes(value: IXMLDOMNamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setBaseName(value: String): Self = StObject.set(x, "baseName", value.asInstanceOf[js.Any])
    
    inline def setChildNodes(value: IXMLDOMNodeList): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setCloneNode(value: Boolean => IXMLDOMNode): Self = StObject.set(x, "cloneNode", js.Any.fromFunction1(value))
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: Any): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: IXMLDOMNode): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDeleteData(value: (Double, Double) => Unit): Self = StObject.set(x, "deleteData", js.Any.fromFunction2(value))
    
    inline def setFirstChild(value: IXMLDOMNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    inline def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
    
    inline def setInsertBefore(value: (IXMLDOMNode, Any) => IXMLDOMNode): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    inline def setInsertData(value: (Double, String) => Unit): Self = StObject.set(x, "insertData", js.Any.fromFunction2(value))
    
    inline def setLastChild(value: IXMLDOMNode): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMSXML2DotIXMLDOMCDATASection_typekey(value: IXMLDOMCDATASection): Self = StObject.set(x, "MSXML2.IXMLDOMCDATASection_typekey", value.asInstanceOf[js.Any])
    
    inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    inline def setNextSibling(value: IXMLDOMNode): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeType(value: DOMNodeType): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeString(value: String): Self = StObject.set(x, "nodeTypeString", value.asInstanceOf[js.Any])
    
    inline def setNodeTypedValue(value: Any): Self = StObject.set(x, "nodeTypedValue", value.asInstanceOf[js.Any])
    
    inline def setNodeValue(value: Any): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocument(value: IXMLDOMDocument): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setParentNode(value: IXMLDOMNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParsed(value: Boolean): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPreviousSibling(value: IXMLDOMNode): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    inline def setRemoveChild(value: IXMLDOMNode => IXMLDOMNode): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    inline def setReplaceChild(value: (IXMLDOMNode, IXMLDOMNode) => IXMLDOMNode): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    inline def setReplaceData(value: (Double, Double, String) => Unit): Self = StObject.set(x, "replaceData", js.Any.fromFunction3(value))
    
    inline def setSelectNodes(value: String => IXMLDOMNodeList): Self = StObject.set(x, "selectNodes", js.Any.fromFunction1(value))
    
    inline def setSelectSingleNode(value: String => IXMLDOMNode): Self = StObject.set(x, "selectSingleNode", js.Any.fromFunction1(value))
    
    inline def setSpecified(value: Boolean): Self = StObject.set(x, "specified", value.asInstanceOf[js.Any])
    
    inline def setSplitText(value: Double => IXMLDOMText): Self = StObject.set(x, "splitText", js.Any.fromFunction1(value))
    
    inline def setSubstringData(value: (Double, Double) => String): Self = StObject.set(x, "substringData", js.Any.fromFunction2(value))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTransformNode(value: IXMLDOMNode => String): Self = StObject.set(x, "transformNode", js.Any.fromFunction1(value))
    
    inline def setTransformNodeToObject(value: (IXMLDOMNode, Any) => Unit): Self = StObject.set(x, "transformNodeToObject", js.Any.fromFunction2(value))
    
    inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
