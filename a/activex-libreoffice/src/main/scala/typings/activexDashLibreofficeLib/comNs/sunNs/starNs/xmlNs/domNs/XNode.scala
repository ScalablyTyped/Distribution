package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The primary dom datatype
  *
  * The Node interface is the primary datatype for the entire Document Object Model. It represents a single node in the document tree. While all objects
  * implementing the Node interface expose methods for dealing with children, not all objects implementing the Node interface may have children. For
  * example, Text nodes may not have children, and adding children to such nodes results in a {@link DOMException} being raised.
  *
  * The attributes nodeName, nodeValue and attributes are included as a mechanism to get at node information without casting down to the specific derived
  * interface. In cases where there is no obvious mapping of these attributes for a specific nodeType (e.g., nodeValue for an Element or attributes for a
  * Comment ), this returns null. Note that the specialized interfaces may contain additional and more convenient mechanisms to get and set the relevant
  * information.
  *
  * The values of nodeName, nodeValue, and attributes vary according to the node type as follows: {{table here, see documentation}}
  * @see Document Object Model (DOM) Level 2 Core Specification
  * @since OOo 2.0
  */
trait XNode
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** A NamedNodeMap containing the attributes of this node (if it is an Element) or null otherwise. */
  val Attributes: XNamedNodeMap
  /** A NodeList that contains all children of this node. */
  val ChildNodes: XNodeList
  /** The first child of this node. */
  val FirstChild: XNode
  /** The last child of this node. */
  val LastChild: XNode
  /** Returns the local part of the qualified name of this node. */
  val LocalName: java.lang.String
  /** The namespace URI of this node, or null if it is unspecified. */
  val NamespaceURI: java.lang.String
  /** The node immediately following this node. */
  val NextSibling: XNode
  /** The name of this node, depending on its type; see the table above. */
  val NodeName: java.lang.String
  /** A code representing the type of the underlying object, as defined above. */
  val NodeType: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.NodeType
  /**
    * The value of this node, depending on its type; see the table above.
    * @throws com::sun::star::xml::dom::DOMException  DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the i
    */
  var NodeValue: java.lang.String
  /** The Document object associated with this node. */
  val OwnerDocument: XDocument
  /** The parent of this node. */
  val ParentNode: XNode
  /** The namespace prefix of this node, or null if it is unspecified. */
  var Prefix: java.lang.String
  /** The node immediately preceding this node. */
  val PreviousSibling: XNode
  /**
    * Adds the node newChild to the end of the list of children of this node.
    * @param newChild the new child node
    * @throws com::sun::star::xml::dom::DOMException  HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not allow children of the type of the n
    */
  def appendChild(newChild: XNode): XNode
  /**
    * Returns a duplicate of this node, i.e., serves as a generic copy constructor for nodes.
    * @param deep `TRUE` : clone node together with any children ; `FALSE` : clone without children
    * @returns the cloned node
    */
  def cloneNode(deep: scala.Boolean): XNode
  /** A NamedNodeMap containing the attributes of this node (if it is an Element) or null otherwise. */
  def getAttributes(): XNamedNodeMap
  /** A NodeList that contains all children of this node. */
  def getChildNodes(): XNodeList
  /** The first child of this node. */
  def getFirstChild(): XNode
  /** The last child of this node. */
  def getLastChild(): XNode
  /** Returns the local part of the qualified name of this node. */
  def getLocalName(): java.lang.String
  /** The namespace URI of this node, or null if it is unspecified. */
  def getNamespaceURI(): java.lang.String
  /** The node immediately following this node. */
  def getNextSibling(): XNode
  /** The name of this node, depending on its type; see the table above. */
  def getNodeName(): java.lang.String
  /** A code representing the type of the underlying object, as defined above. */
  def getNodeType(): NodeType
  /**
    * The value of this node, depending on its type; see the table above.
    * @throws com::sun::star::xml::dom::DOMException  DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the i
    */
  def getNodeValue(): java.lang.String
  /** The Document object associated with this node. */
  def getOwnerDocument(): XDocument
  /** The parent of this node. */
  def getParentNode(): XNode
  /** The namespace prefix of this node, or null if it is unspecified. */
  def getPrefix(): java.lang.String
  /** The node immediately preceding this node. */
  def getPreviousSibling(): XNode
  /** Returns whether this node (if it is an element) has any attributes. */
  def hasAttributes(): scala.Boolean
  /** Returns whether this node has any children. */
  def hasChildNodes(): scala.Boolean
  /**
    * Inserts the node newChild before the existing child node refChild.
    * @throws DOMException  HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not allow children of the type of the newChild node, or if the no
    */
  def insertBefore(newChild: XNode, refChild: XNode): XNode
  /** Tests whether the DOM implementation implements a specific feature and that feature is supported by this node. */
  def isSupported(feature: java.lang.String, ver: java.lang.String): scala.Boolean
  /**
    * Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure
    * (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text
    * nodes nor empty Text nodes.
    */
  def normalize(): scala.Unit
  /**
    * Removes the child node indicated by oldChild from the list of children, and returns it.
    * @throws DOMException  NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.  NOT_FOUND_ERR: Raised if oldChild is not a child of this node.
    */
  def removeChild(oldChild: XNode): XNode
  /**
    * Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node.
    * @throws DOMException  HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not allow children of the type of the newChild node, or if the no
    */
  def replaceChild(newChild: XNode, oldChild: XNode): XNode
  /**
    * The value of this node, depending on its type; see the table above.
    * @throws DOMException  NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.  DOMSTRING_SIZE_ERR: Raised when it would return more characters tha
    */
  def setNodeValue(nodeValue: java.lang.String): scala.Unit
  /**
    * The namespace prefix of this node, or null if it is unspecified.
    * @throws DOMException  INVALID_CHARACTER_ERR: Raised if the specified prefix contains an illegal character, per the XML 1.0 specification .  NO_MODIFICATI
    */
  def setPrefix(prefix: java.lang.String): scala.Unit
}

object XNode {
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
    OwnerDocument: XDocument,
    ParentNode: XNode,
    Prefix: java.lang.String,
    PreviousSibling: XNode,
    acquire: () => scala.Unit,
    appendChild: XNode => XNode,
    cloneNode: scala.Boolean => XNode,
    getAttributes: () => XNamedNodeMap,
    getChildNodes: () => XNodeList,
    getFirstChild: () => XNode,
    getLastChild: () => XNode,
    getLocalName: () => java.lang.String,
    getNamespaceURI: () => java.lang.String,
    getNextSibling: () => XNode,
    getNodeName: () => java.lang.String,
    getNodeType: () => NodeType,
    getNodeValue: () => java.lang.String,
    getOwnerDocument: () => XDocument,
    getParentNode: () => XNode,
    getPrefix: () => java.lang.String,
    getPreviousSibling: () => XNode,
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
  ): XNode = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, ChildNodes = ChildNodes, FirstChild = FirstChild, LastChild = LastChild, LocalName = LocalName, NamespaceURI = NamespaceURI, NextSibling = NextSibling, NodeName = NodeName, NodeType = NodeType, NodeValue = NodeValue, OwnerDocument = OwnerDocument, ParentNode = ParentNode, Prefix = Prefix, PreviousSibling = PreviousSibling, acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = js.Any.fromFunction0(getAttributes), getChildNodes = js.Any.fromFunction0(getChildNodes), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getLocalName = js.Any.fromFunction0(getLocalName), getNamespaceURI = js.Any.fromFunction0(getNamespaceURI), getNextSibling = js.Any.fromFunction0(getNextSibling), getNodeName = js.Any.fromFunction0(getNodeName), getNodeType = js.Any.fromFunction0(getNodeType), getNodeValue = js.Any.fromFunction0(getNodeValue), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPrefix = js.Any.fromFunction0(getPrefix), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = js.Any.fromFunction0(normalize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1(setNodeValue), setPrefix = js.Any.fromFunction1(setPrefix))
  
    __obj.asInstanceOf[XNode]
  }
}

