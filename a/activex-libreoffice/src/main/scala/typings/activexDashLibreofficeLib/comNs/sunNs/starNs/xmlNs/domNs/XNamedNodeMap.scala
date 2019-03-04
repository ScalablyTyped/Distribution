package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XNamedNodeMap
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** The number of nodes in this map. */
  val Length: scala.Double
  /** The number of nodes in this map. */
  def getLength(): scala.Double
  /** Retrieves a node specified by local name. */
  def getNamedItem(name: java.lang.String): XNode
  /** Retrieves a node specified by local name and namespace URI. */
  def getNamedItemNS(namespaceURI: java.lang.String, localName: java.lang.String): XNode
  /** Returns a node specified by index. */
  def item(index: scala.Double): XNode
  /**
    * Removes a node specified by name. Throws: {@link DOMException} - NOT_FOUND_ERR: Raised if there is no node named name in this map.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly.
    */
  def removeNamedItem(name: java.lang.String): XNode
  /**
    * Removes a node specified by local name and namespace URI. Throws: {@link DOMException} - NOT_FOUND_ERR: Raised if there is no node with the specified
    * namespaceURI and localName in this map. NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly.
    */
  def removeNamedItemNS(namespaceURI: java.lang.String, localName: java.lang.String): XNode
  /**
    * Adds a node using its nodeName attribute. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if arg was created from a different document than
    * the one that created this map. NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. INUSE_ATTRIBUTE_ERR: Raised if arg is an Attr that is
    * already an attribute of another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements. HIERARCHY_REQUEST_ERR:
    * Raised if an attempt is made to add a node doesn't belong in this NamedNodeMap. Examples would include trying to insert something other than an Attr
    * node into an Element's map of attributes, or a non-Entity node into the DocumentType's map of Entities.
    */
  def setNamedItem(arg: XNode): XNode
  /**
    * Adds a node using its namespaceURI and localName. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if arg was created from a different
    * document than the one that created this map. NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. INUSE_ATTRIBUTE_ERR: Raised if arg is an
    * Attr that is already an attribute of another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements.
    * HIERARCHY_REQUEST_ERR: Raised if an attempt is made to add a node doesn't belong in this NamedNodeMap. Examples would include trying to insert
    * something other than an Attr node into an Element's map of attributes, or a non-Entity node into the DocumentType's map of Entities.
    * NOT_SUPPORTED_ERR: Always thrown if the current document does not support the "XML" feature, since namespaces were defined by XML.
    */
  def setNamedItemNS(arg: XNode): XNode
}

object XNamedNodeMap {
  @scala.inline
  def apply(
    Length: scala.Double,
    acquire: js.Function0[scala.Unit],
    getLength: js.Function0[scala.Double],
    getNamedItem: js.Function1[java.lang.String, XNode],
    getNamedItemNS: js.Function2[java.lang.String, java.lang.String, XNode],
    item: js.Function1[scala.Double, XNode],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeNamedItem: js.Function1[java.lang.String, XNode],
    removeNamedItemNS: js.Function2[java.lang.String, java.lang.String, XNode],
    setNamedItem: js.Function1[XNode, XNode],
    setNamedItemNS: js.Function1[XNode, XNode]
  ): XNamedNodeMap = {
    val __obj = js.Dynamic.literal(Length = Length, acquire = acquire, getLength = getLength, getNamedItem = getNamedItem, getNamedItemNS = getNamedItemNS, item = item, queryInterface = queryInterface, release = release, removeNamedItem = removeNamedItem, removeNamedItemNS = removeNamedItemNS, setNamedItem = setNamedItem, setNamedItemNS = setNamedItemNS)
  
    __obj.asInstanceOf[XNamedNodeMap]
  }
}

