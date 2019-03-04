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
    acquire: js.Function0[scala.Unit],
    appendChild: js.Function1[XNode, XNode],
    cloneNode: js.Function1[scala.Boolean, XNode],
    getAttributes: js.Function0[XNamedNodeMap],
    getChildNodes: js.Function0[XNodeList],
    getEntities: js.Function0[XNamedNodeMap],
    getFirstChild: js.Function0[XNode],
    getInternalSubset: js.Function0[java.lang.String],
    getLastChild: js.Function0[XNode],
    getLocalName: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getNamespaceURI: js.Function0[java.lang.String],
    getNextSibling: js.Function0[XNode],
    getNodeName: js.Function0[java.lang.String],
    getNodeType: js.Function0[NodeType],
    getNodeValue: js.Function0[java.lang.String],
    getNotations: js.Function0[XNamedNodeMap],
    getOwnerDocument: js.Function0[XDocument],
    getParentNode: js.Function0[XNode],
    getPrefix: js.Function0[java.lang.String],
    getPreviousSibling: js.Function0[XNode],
    getPublicId: js.Function0[java.lang.String],
    getSystemId: js.Function0[java.lang.String],
    hasAttributes: js.Function0[scala.Boolean],
    hasChildNodes: js.Function0[scala.Boolean],
    insertBefore: js.Function2[XNode, XNode, XNode],
    isSupported: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    normalize: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChild: js.Function1[XNode, XNode],
    replaceChild: js.Function2[XNode, XNode, XNode],
    setNodeValue: js.Function1[java.lang.String, scala.Unit],
    setPrefix: js.Function1[java.lang.String, scala.Unit]
  ): XDocumentType = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, Entities = Entities, FirstChild = FirstChild, InternalSubset = InternalSubset, LastChild = LastChild, LocalName = LocalName, Name = Name, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, Notations = Notations, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, PublicId = PublicId, SystemId = SystemId, acquire = acquire, appendChild = appendChild, cloneNode = cloneNode, getAttributes = getAttributes, getChildNodes = getChildNodes, getEntities = getEntities, getFirstChild = getFirstChild, getInternalSubset = getInternalSubset, getLastChild = getLastChild, getLocalName = getLocalName, getName = getName, getNamespaceURI = getNamespaceURI, getNextSibling = getNextSibling, getNodeName = getNodeName, getNodeType = getNodeType, getNodeValue = getNodeValue, getNotations = getNotations, getOwnerDocument = getOwnerDocument, getParentNode = getParentNode, getPrefix = getPrefix, getPreviousSibling = getPreviousSibling, getPublicId = getPublicId, getSystemId = getSystemId, hasAttributes = hasAttributes, hasChildNodes = hasChildNodes, insertBefore = insertBefore, isSupported = isSupported, normalize = normalize, queryInterface = queryInterface, release = release, removeChild = removeChild, replaceChild = replaceChild, setNodeValue = setNodeValue, setPrefix = setPrefix)
  
    __obj.asInstanceOf[XDocumentType]
  }
}

