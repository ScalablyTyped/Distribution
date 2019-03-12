package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentType extends XNode {
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  val Entities: XNamedNodeMap
  /** The internal subset as a string, or null if there is none. */
  val InternalSubset: java.lang.String
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  val Name: java.lang.String
  /** A NamedNodeMap containing the notations declared in the DTD. */
  val Notations: XNamedNodeMap
  /** The public identifier of the external subset. */
  val PublicId: java.lang.String
  /** The system identifier of the external subset. */
  val SystemId: java.lang.String
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  def getEntities(): XNamedNodeMap
  /** The internal subset as a string, or null if there is none. */
  def getInternalSubset(): java.lang.String
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  def getName(): java.lang.String
  /** A NamedNodeMap containing the notations declared in the DTD. */
  def getNotations(): XNamedNodeMap
  /** The public identifier of the external subset. */
  def getPublicId(): java.lang.String
  /** The system identifier of the external subset. */
  def getSystemId(): java.lang.String
}

object XDocumentType {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Entities: XNamedNodeMap,
    FirstChild: XNode,
    InternalSubset: java.lang.String,
    LastChild: XNode,
    LocalName: java.lang.String,
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NextSibling: XNode,
    NodeName: java.lang.String,
    NodeType: NodeType,
    NodeValue: java.lang.String,
    Notations: XNamedNodeMap,
    OwnerDocument: XDocument,
    ParentNode: XNode,
    Prefix: java.lang.String,
    PreviousSibling: XNode,
    PublicId: java.lang.String,
    SystemId: java.lang.String,
    acquire: () => scala.Unit,
    appendChild: XNode => XNode,
    cloneNode: scala.Boolean => XNode,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getEntities: () => XNamedNodeMap,
    getFirstChild: () => XNode,
    getInternalSubset: () => java.lang.String,
    getLastChild: () => XNode,
    getLocalName: () => java.lang.String,
    getName: () => java.lang.String,
    getNamespaceURI: () => java.lang.String,
    getNextSibling: () => XNode,
    getNodeName: () => java.lang.String,
    getNodeType: () => NodeType,
    getNodeValue: () => java.lang.String,
    getNotations: () => XNamedNodeMap,
    getOwnerDocument: () => XDocument,
    getParentNode: () => XNode,
    getPrefix: () => java.lang.String,
    getPreviousSibling: () => XNode,
    getPublicId: () => java.lang.String,
    getSystemId: () => java.lang.String,
    hasAttributes: () => scala.Boolean,
    hasChildNodes: () => scala.Boolean,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (java.lang.String, java.lang.String) => scala.Boolean,
    normalize: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setNodeValue: java.lang.String => scala.Unit,
    setPrefix: java.lang.String => scala.Unit
  ): XDocumentType = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, Entities = Entities, FirstChild = FirstChild, InternalSubset = InternalSubset, LastChild = LastChild, LocalName = LocalName, Name = Name, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, Notations = Notations, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, PublicId = PublicId, SystemId = SystemId, acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getEntities = js.Any.fromFunction0(getEntities), getFirstChild = js.Any.fromFunction0(getFirstChild), getInternalSubset = js.Any.fromFunction0(getInternalSubset), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getName = js.Any.fromFunction0(getName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getNotations = js.Any.fromFunction0(getNotations), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix))
  
    __obj.asInstanceOf[XDocumentType]
  }
}

