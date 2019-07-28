package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentType extends XNode {
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  val Entities: XNamedNodeMap
  /** The internal subset as a string, or null if there is none. */
  val InternalSubset: String
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  val Name: String
  /** A NamedNodeMap containing the notations declared in the DTD. */
  val Notations: XNamedNodeMap
  /** The public identifier of the external subset. */
  val PublicId: String
  /** The system identifier of the external subset. */
  val SystemId: String
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  def getEntities(): XNamedNodeMap
  /** The internal subset as a string, or null if there is none. */
  def getInternalSubset(): String
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  def getName(): String
  /** A NamedNodeMap containing the notations declared in the DTD. */
  def getNotations(): XNamedNodeMap
  /** The public identifier of the external subset. */
  def getPublicId(): String
  /** The system identifier of the external subset. */
  def getSystemId(): String
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
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, Entities = Entities, FirstChild = FirstChild, InternalSubset = InternalSubset, LastChild = LastChild, LocalName = LocalName, Name = Name, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, Notations = Notations, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, PublicId = PublicId, SystemId = SystemId, acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getEntities = js.Any.fromFunction0(getEntities), getFirstChild = js.Any.fromFunction0(getFirstChild), getInternalSubset = js.Any.fromFunction0(getInternalSubset), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getName = js.Any.fromFunction0(getName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getNotations = js.Any.fromFunction0(getNotations), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix))
  
    __obj.asInstanceOf[XDocumentType]
  }
}

