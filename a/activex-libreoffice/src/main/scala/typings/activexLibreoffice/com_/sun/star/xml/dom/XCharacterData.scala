package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCharacterData
  extends StObject
     with XNode {
  
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  var Data: String
  
  /** The number of 16-bit units that are available through data and the substringData method below. */
  val Length: Double
  
  /**
    * Append the string to the end of the character data of the node. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is
    * readonly.
    */
  def appendData(arg: String): Unit
  
  /**
    * Remove a range of 16-bit units from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater
    * than the number of 16-bit units in data, or if the specified count is negative. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def deleteData(offset: Double, count: Double): Unit
  
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def getData(): String
  
  /** The number of 16-bit units that are available through data and the substringData method below. */
  def getLength(): Double
  
  /**
    * Insert a string at the specified 16-bit unit offset. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or
    * greater than the number of 16-bit units in data. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def insertData(offset: Double, arg: String): Unit
  
  /**
    * Replace the characters starting at the specified 16-bit unit offset with the specified string. Throws; {@link DOMException} - INDEX_SIZE_ERR: Raised
    * if the specified offset is negative or greater than the number of 16-bit units in data, or if the specified count is negative.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def replaceData(offset: Double, count: Double, arg: String): Unit
  
  /**
    * Set the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is
    * readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def setData(data: String): Unit
  
  /**
    * Extracts a range of data from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater than the
    * number of 16-bit units in data, or if the specified count is negative. DOMSTRING_SIZE_ERR: Raised if the specified range of text does not fit into a
    * DOMString.
    */
  def subStringData(offset: Double, count: Double): String
}
object XCharacterData {
  
  inline def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Data: String,
    FirstChild: XNode,
    LastChild: XNode,
    Length: Double,
    LocalName: String,
    NamespaceURI: String,
    NextSibling: XNode,
    NodeName: String,
    NodeType: NodeType,
    NodeValue: String,
    OwnerDocument: XDocument,
    ParentNode: XNode,
    Prefix: String,
    PreviousSibling: XNode,
    acquire: () => Unit,
    appendChild: XNode => XNode,
    appendData: String => Unit,
    cloneNode: Boolean => XNode,
    deleteData: (Double, Double) => Unit,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getData: () => String,
    getFirstChild: () => XNode,
    getLastChild: () => XNode,
    getLength: () => Double,
    getLocalName: () => String,
    getNamespaceURI: () => String,
    getNextSibling: () => XNode,
    getNodeName: () => String,
    getNodeType: () => NodeType,
    getNodeValue: () => String,
    getOwnerDocument: () => XDocument,
    getParentNode: () => XNode,
    getPrefix: () => String,
    getPreviousSibling: () => XNode,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    insertBefore: (XNode, XNode) => XNode,
    insertData: (Double, String) => Unit,
    isSupported: (String, String) => Boolean,
    normalize: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    replaceData: (Double, Double, String) => Unit,
    setData: String => Unit,
    setNodeValue: String => Unit,
    setPrefix: String => Unit,
    subStringData: (Double, Double) => String
  ): XCharacterData = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1(appendData), cloneNode = js.Any.fromFunction1(cloneNode), deleteData = js.Any.fromFunction2(deleteData), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getData = js.Any.fromFunction0(getData), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLength = js.Any.fromFunction0(getLength), getLocalName = js.Any.fromFunction0(getLocalName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2(insertData), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3(replaceData), setData = js.Any.fromFunction1(setData), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix), subStringData = js.Any.fromFunction2(subStringData))
    __obj.asInstanceOf[XCharacterData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCharacterData] (val x: Self) extends AnyVal {
    
    inline def setAppendData(value: String => Unit): Self = StObject.set(x, "appendData", js.Any.fromFunction1(value))
    
    inline def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDeleteData(value: (Double, Double) => Unit): Self = StObject.set(x, "deleteData", js.Any.fromFunction2(value))
    
    inline def setGetData(value: () => String): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    inline def setInsertData(value: (Double, String) => Unit): Self = StObject.set(x, "insertData", js.Any.fromFunction2(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setReplaceData(value: (Double, Double, String) => Unit): Self = StObject.set(x, "replaceData", js.Any.fromFunction3(value))
    
    inline def setSetData(value: String => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    inline def setSubStringData(value: (Double, Double) => String): Self = StObject.set(x, "subStringData", js.Any.fromFunction2(value))
  }
}
