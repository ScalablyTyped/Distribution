package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XNamedNodeMap
  extends StObject
     with XInterface {
  
  /** The number of nodes in this map. */
  val Length: Double
  
  /** The number of nodes in this map. */
  def getLength(): Double
  
  /** Retrieves a node specified by local name. */
  def getNamedItem(name: String): XNode
  
  /** Retrieves a node specified by local name and namespace URI. */
  def getNamedItemNS(namespaceURI: String, localName: String): XNode
  
  /** Returns a node specified by index. */
  def item(index: Double): XNode
  
  /**
    * Removes a node specified by name. Throws: {@link DOMException} - NOT_FOUND_ERR: Raised if there is no node named name in this map.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly.
    */
  def removeNamedItem(name: String): XNode
  
  /**
    * Removes a node specified by local name and namespace URI. Throws: {@link DOMException} - NOT_FOUND_ERR: Raised if there is no node with the specified
    * namespaceURI and localName in this map. NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly.
    */
  def removeNamedItemNS(namespaceURI: String, localName: String): XNode
  
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
  
  inline def apply(
    Length: Double,
    acquire: () => Unit,
    getLength: () => Double,
    getNamedItem: String => XNode,
    getNamedItemNS: (String, String) => XNode,
    item: Double => XNode,
    queryInterface: `type` => Any,
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
  implicit open class MutableBuilder[Self <: XNamedNodeMap] (val x: Self) extends AnyVal {
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    inline def setGetNamedItem(value: String => XNode): Self = StObject.set(x, "getNamedItem", js.Any.fromFunction1(value))
    
    inline def setGetNamedItemNS(value: (String, String) => XNode): Self = StObject.set(x, "getNamedItemNS", js.Any.fromFunction2(value))
    
    inline def setItem(value: Double => XNode): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setRemoveNamedItem(value: String => XNode): Self = StObject.set(x, "removeNamedItem", js.Any.fromFunction1(value))
    
    inline def setRemoveNamedItemNS(value: (String, String) => XNode): Self = StObject.set(x, "removeNamedItemNS", js.Any.fromFunction2(value))
    
    inline def setSetNamedItem(value: XNode => XNode): Self = StObject.set(x, "setNamedItem", js.Any.fromFunction1(value))
    
    inline def setSetNamedItemNS(value: XNode => XNode): Self = StObject.set(x, "setNamedItemNS", js.Any.fromFunction1(value))
  }
}
