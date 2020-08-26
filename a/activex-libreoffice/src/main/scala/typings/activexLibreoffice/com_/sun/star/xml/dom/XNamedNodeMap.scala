package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XNamedNodeMap extends XInterface {
  /** The number of nodes in this map. */
  val Length: Double = js.native
  /** The number of nodes in this map. */
  def getLength(): Double = js.native
  /** Retrieves a node specified by local name. */
  def getNamedItem(name: String): XNode = js.native
  /** Retrieves a node specified by local name and namespace URI. */
  def getNamedItemNS(namespaceURI: String, localName: String): XNode = js.native
  /** Returns a node specified by index. */
  def item(index: Double): XNode = js.native
  /**
    * Removes a node specified by name. Throws: {@link DOMException} - NOT_FOUND_ERR: Raised if there is no node named name in this map.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly.
    */
  def removeNamedItem(name: String): XNode = js.native
  /**
    * Removes a node specified by local name and namespace URI. Throws: {@link DOMException} - NOT_FOUND_ERR: Raised if there is no node with the specified
    * namespaceURI and localName in this map. NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly.
    */
  def removeNamedItemNS(namespaceURI: String, localName: String): XNode = js.native
  /**
    * Adds a node using its nodeName attribute. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if arg was created from a different document than
    * the one that created this map. NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. INUSE_ATTRIBUTE_ERR: Raised if arg is an Attr that is
    * already an attribute of another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements. HIERARCHY_REQUEST_ERR:
    * Raised if an attempt is made to add a node doesn't belong in this NamedNodeMap. Examples would include trying to insert something other than an Attr
    * node into an Element's map of attributes, or a non-Entity node into the DocumentType's map of Entities.
    */
  def setNamedItem(arg: XNode): XNode = js.native
  /**
    * Adds a node using its namespaceURI and localName. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if arg was created from a different
    * document than the one that created this map. NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. INUSE_ATTRIBUTE_ERR: Raised if arg is an
    * Attr that is already an attribute of another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements.
    * HIERARCHY_REQUEST_ERR: Raised if an attempt is made to add a node doesn't belong in this NamedNodeMap. Examples would include trying to insert
    * something other than an Attr node into an Element's map of attributes, or a non-Entity node into the DocumentType's map of Entities.
    * NOT_SUPPORTED_ERR: Always thrown if the current document does not support the "XML" feature, since namespaces were defined by XML.
    */
  def setNamedItemNS(arg: XNode): XNode = js.native
}

object XNamedNodeMap {
  @scala.inline
  def apply(
    Length: Double,
    acquire: () => Unit,
    getLength: () => Double,
    getNamedItem: String => XNode,
    getNamedItemNS: (String, String) => XNode,
    item: Double => XNode,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeNamedItem: String => XNode,
    removeNamedItemNS: (String, String) => XNode,
    setNamedItem: XNode => XNode,
    setNamedItemNS: XNode => XNode
  ): XNamedNodeMap = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLength = js.Any.fromFunction0(getLength), getNamedItem = js.Any.fromFunction1(getNamedItem), getNamedItemNS = js.Any.fromFunction2(getNamedItemNS), item = js.Any.fromFunction1(item), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeNamedItem = js.Any.fromFunction1(removeNamedItem), removeNamedItemNS = js.Any.fromFunction2(removeNamedItemNS), setNamedItem = js.Any.fromFunction1(setNamedItem), setNamedItemNS = js.Any.fromFunction1(setNamedItemNS))
    __obj.asInstanceOf[XNamedNodeMap]
  }
  @scala.inline
  implicit class XNamedNodeMapOps[Self <: XNamedNodeMap] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("Length", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNamedItem(value: String => XNode): Self = this.set("getNamedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNamedItemNS(value: (String, String) => XNode): Self = this.set("getNamedItemNS", js.Any.fromFunction2(value))
    @scala.inline
    def setItem(value: Double => XNode): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveNamedItem(value: String => XNode): Self = this.set("removeNamedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveNamedItemNS(value: (String, String) => XNode): Self = this.set("removeNamedItemNS", js.Any.fromFunction2(value))
    @scala.inline
    def setSetNamedItem(value: XNode => XNode): Self = this.set("setNamedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNamedItemNS(value: XNode => XNode): Self = this.set("setNamedItemNS", js.Any.fromFunction1(value))
  }
  
}

