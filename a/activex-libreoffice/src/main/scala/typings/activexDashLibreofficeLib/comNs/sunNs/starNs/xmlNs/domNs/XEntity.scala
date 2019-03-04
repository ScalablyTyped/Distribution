package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEntity extends XNode {
  /** For unparsed entities, the name of the notation for the entity. */
  val NotationName: java.lang.String
  /** The public identifier associated with the entity, if specified. */
  val PublicId: java.lang.String
  /** The system identifier associated with the entity, if specified. */
  val SystemId: java.lang.String
  /** For unparsed entities, the name of the notation for the entity. */
  def getNotationName(): java.lang.String
  /** The public identifier associated with the entity, if specified. */
  def getPublicId(): java.lang.String
  /** The system identifier associated with the entity, if specified. */
  def getSystemId(): java.lang.String
}

object XEntity {
  @scala.inline
  def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    FirstChild: XNode,
    LastChild: XNode,
    LocalName: java.lang.String,
    NamespaceURI: java.lang.String,
    NextSibling: XNode,
    NodeName: java.lang.String,
    NodeType: NodeType,
    NodeValue: java.lang.String,
    NotationName: java.lang.String,
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
    getFirstChild: js.Function0[XNode],
    getLastChild: js.Function0[XNode],
    getLocalName: js.Function0[java.lang.String],
    getNamespaceURI: js.Function0[java.lang.String],
    getNextSibling: js.Function0[XNode],
    getNodeName: js.Function0[java.lang.String],
    getNodeType: js.Function0[NodeType],
    getNodeValue: js.Function0[java.lang.String],
    getNotationName: js.Function0[java.lang.String],
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
  ): XEntity = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, FirstChild = FirstChild, LastChild = LastChild, LocalName = LocalName, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, NotationName = NotationName, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, PublicId = PublicId, SystemId = SystemId, acquire = acquire, appendChild = appendChild, cloneNode = cloneNode, getAttributes = getAttributes, getChildNodes = getChildNodes, getFirstChild = getFirstChild, getLastChild = getLastChild, getLocalName = getLocalName, getNamespaceURI = getNamespaceURI, getNextSibling = getNextSibling, getNodeName = getNodeName, getNodeType = getNodeType, getNodeValue = getNodeValue, getNotationName = getNotationName, getOwnerDocument = getOwnerDocument, getParentNode = getParentNode, getPrefix = getPrefix, getPreviousSibling = getPreviousSibling, getPublicId = getPublicId, getSystemId = getSystemId, hasAttributes = hasAttributes, hasChildNodes = hasChildNodes, insertBefore = insertBefore, isSupported = isSupported, normalize = normalize, queryInterface = queryInterface, release = release, removeChild = removeChild, replaceChild = replaceChild, setNodeValue = setNodeValue, setPrefix = setPrefix)
  
    __obj.asInstanceOf[XEntity]
  }
}

