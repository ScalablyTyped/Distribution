package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDocumentType extends XNode {
  
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  val Entities: XNamedNodeMap = js.native
  
  /** The internal subset as a string, or null if there is none. */
  val InternalSubset: String = js.native
  
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  val Name: String = js.native
  
  /** A NamedNodeMap containing the notations declared in the DTD. */
  val Notations: XNamedNodeMap = js.native
  
  /** The public identifier of the external subset. */
  val PublicId: String = js.native
  
  /** The system identifier of the external subset. */
  val SystemId: String = js.native
  
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  def getEntities(): XNamedNodeMap = js.native
  
  /** The internal subset as a string, or null if there is none. */
  def getInternalSubset(): String = js.native
  
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  def getName(): String = js.native
  
  /** A NamedNodeMap containing the notations declared in the DTD. */
  def getNotations(): XNamedNodeMap = js.native
  
  /** The public identifier of the external subset. */
  def getPublicId(): String = js.native
  
  /** The system identifier of the external subset. */
  def getSystemId(): String = js.native
}
object XDocumentType {
  
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Entities: XNamedNodeMap,
    FirstChild: XNode,
    InternalSubset: String,
    LastChild: XNode,
    LocalName: String,
    Name: String,
    NamespaceURI: String,
    NextSibling: XNode,
    NodeName: String,
    NodeType: NodeType,
    NodeValue: String,
    Notations: XNamedNodeMap,
    OwnerDocument: XDocument,
    ParentNode: XNode,
    Prefix: String,
    PreviousSibling: XNode,
    PublicId: String,
    SystemId: String,
    acquire: () => Unit,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getEntities: () => XNamedNodeMap,
    getFirstChild: () => XNode,
    getInternalSubset: () => String,
    getLastChild: () => XNode,
    getLocalName: () => String,
    getName: () => String,
    getNamespaceURI: () => String,
    getNextSibling: () => XNode,
    getNodeName: () => String,
    getNodeType: () => NodeType,
    getNodeValue: () => String,
    getNotations: () => XNamedNodeMap,
    getOwnerDocument: () => XDocument,
    getParentNode: () => XNode,
    getPrefix: () => String,
    getPreviousSibling: () => XNode,
    getPublicId: () => String,
    getSystemId: () => String,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setNodeValue: String => Unit,
    setPrefix: String => Unit
  ): XDocumentType = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], Entities = Entities.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], InternalSubset = InternalSubset.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], Notations = Notations.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], PublicId = PublicId.asInstanceOf[js.Any], SystemId = SystemId.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getEntities = js.Any.fromFunction0(getEntities), getFirstChild = js.Any.fromFunction0(getFirstChild), getInternalSubset = js.Any.fromFunction0(getInternalSubset), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getName = js.Any.fromFunction0(getName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getNotations = js.Any.fromFunction0(getNotations), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix))
    __obj.asInstanceOf[XDocumentType]
  }
  
  @scala.inline
  implicit class XDocumentTypeOps[Self <: XDocumentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntities(value: XNamedNodeMap): Self = this.set("Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalSubset(value: String): Self = this.set("InternalSubset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotations(value: XNamedNodeMap): Self = this.set("Notations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicId(value: String): Self = this.set("PublicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemId(value: String): Self = this.set("SystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEntities(value: () => XNamedNodeMap): Self = this.set("getEntities", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalSubset(value: () => String): Self = this.set("getInternalSubset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNotations(value: () => XNamedNodeMap): Self = this.set("getNotations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPublicId(value: () => String): Self = this.set("getPublicId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSystemId(value: () => String): Self = this.set("getSystemId", js.Any.fromFunction0(value))
  }
}
