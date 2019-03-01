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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attributes")(Attributes)
    __obj.updateDynamic("ChildNodes")(ChildNodes)
    __obj.updateDynamic("FirstChild")(FirstChild)
    __obj.updateDynamic("LastChild")(LastChild)
    __obj.updateDynamic("LocalName")(LocalName)
    __obj.updateDynamic("NamespaceURI")(NamespaceURI)
    __obj.updateDynamic("NextSibling")(NextSibling)
    __obj.updateDynamic("NodeName")(NodeName)
    __obj.updateDynamic("NodeType")(NodeType)
    __obj.updateDynamic("NodeValue")(NodeValue)
    __obj.updateDynamic("NotationName")(NotationName)
    __obj.updateDynamic("OwnerDocument")(OwnerDocument)
    __obj.updateDynamic("ParentNode")(ParentNode)
    __obj.updateDynamic("Prefix")(Prefix)
    __obj.updateDynamic("PreviousSibling")(PreviousSibling)
    __obj.updateDynamic("PublicId")(PublicId)
    __obj.updateDynamic("SystemId")(SystemId)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("appendChild")(appendChild)
    __obj.updateDynamic("cloneNode")(cloneNode)
    __obj.updateDynamic("getAttributes")(getAttributes)
    __obj.updateDynamic("getChildNodes")(getChildNodes)
    __obj.updateDynamic("getFirstChild")(getFirstChild)
    __obj.updateDynamic("getLastChild")(getLastChild)
    __obj.updateDynamic("getLocalName")(getLocalName)
    __obj.updateDynamic("getNamespaceURI")(getNamespaceURI)
    __obj.updateDynamic("getNextSibling")(getNextSibling)
    __obj.updateDynamic("getNodeName")(getNodeName)
    __obj.updateDynamic("getNodeType")(getNodeType)
    __obj.updateDynamic("getNodeValue")(getNodeValue)
    __obj.updateDynamic("getNotationName")(getNotationName)
    __obj.updateDynamic("getOwnerDocument")(getOwnerDocument)
    __obj.updateDynamic("getParentNode")(getParentNode)
    __obj.updateDynamic("getPrefix")(getPrefix)
    __obj.updateDynamic("getPreviousSibling")(getPreviousSibling)
    __obj.updateDynamic("getPublicId")(getPublicId)
    __obj.updateDynamic("getSystemId")(getSystemId)
    __obj.updateDynamic("hasAttributes")(hasAttributes)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes)
    __obj.updateDynamic("insertBefore")(insertBefore)
    __obj.updateDynamic("isSupported")(isSupported)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChild")(removeChild)
    __obj.updateDynamic("replaceChild")(replaceChild)
    __obj.updateDynamic("setNodeValue")(setNodeValue)
    __obj.updateDynamic("setPrefix")(setPrefix)
    __obj.asInstanceOf[XEntity]
  }
}

