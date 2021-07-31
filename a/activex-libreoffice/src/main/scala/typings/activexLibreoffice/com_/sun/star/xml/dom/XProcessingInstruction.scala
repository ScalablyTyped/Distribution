package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XProcessingInstruction
  extends StObject
     with XNode {
  
  /** The content of this processing instruction. */
  var Data: String
  
  /** The target of this processing instruction. */
  val Target: String
  
  /** The content of this processing instruction. */
  def getData(): String
  
  /** The target of this processing instruction. */
  def getTarget(): String
  
  /** The content of this processing instruction. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. */
  def setData(data: String): Unit
}
object XProcessingInstruction {
  
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Data: String,
    FirstChild: XNode,
    LastChild: XNode,
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
    Target: String,
    acquire: () => Unit,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getData: () => String,
    getFirstChild: () => XNode,
    getLastChild: () => XNode,
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
    getTarget: () => String,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setData: String => Unit,
    setNodeValue: String => Unit,
    setPrefix: String => Unit
  ): XProcessingInstruction = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getData = js.Any.fromFunction0(getData), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getTarget = js.Any.fromFunction0(getTarget), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setData = js.Any.fromFunction1(setData), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix))
    __obj.asInstanceOf[XProcessingInstruction]
  }
  
  @scala.inline
  implicit class XProcessingInstructionMutableBuilder[Self <: XProcessingInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetData(value: () => String): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTarget(value: () => String): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetData(value: String => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
