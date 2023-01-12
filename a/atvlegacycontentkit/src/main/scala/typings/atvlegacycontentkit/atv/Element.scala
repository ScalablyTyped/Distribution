package typings.atvlegacycontentkit.atv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type used for Apple TV elements, equivalent to Element in the normal DOM.
  */
trait Element
  extends StObject
     with Node {
  
  /**
    * Append a child to this element.
    * @param element The element to append.
    */
  def appendChild(element: Element): Unit
  
  /**
    * Get the child elements of this element.
    */
  val childElements: js.Array[Element]
  
  /**
    * Get an attribute from an element by the name of the attribute.
    * @param attributeName The name of the attribute to retrieve.
    */
  def getAttribute(attributeName: String): String
  
  /**
    * Get the first direct child element with the tag name specified.
    * @param name The tag name of the element to find.
    */
  def getElementByName(name: String): Element
  
  /**
    * Get all child elements with the tag name specified. This seems to include closing tags.
    * @param name The tag name of the element to find.
    */
  def getElementsByName(name: String): js.Array[Element]
  
  /**
    * Insert a child element after a specified element.
    * @param elementToInsert The element you wish to insert.
    * @param insertAfter The element you wish to insert the other element after.
    */
  def insertChildAfter(elementToInsert: Element, insertAfter: Element): Unit
  
  /**
    * Insert a child element before the specified element.
    * @param elementToInsert The element you wish to insert.
    * @param insertBefore The element you wish to insert the other element before.
    */
  def insertChildBefore(elementToInsert: Element, insertBefore: Element): Unit
  
  /**
    * Get the parent element of this element.
    */
  val parent: Element
  
  /**
    * Remove a specific attribute by its name.
    * @param attributeName The name of the attribute to remove.
    */
  def removeAttribute(attributeName: String): Unit
  
  /**
    * Remove the element from its parent.
    */
  def removeFromParent(): Unit
  
  /**
    * Replace a child element with a different element.
    * @param elementToBeReplaced The element that is going to be replaced.
    * @param elementToReplaceWith The element that has been replaced.
    */
  def replaceChild(elementToBeReplaced: Element, elementToReplaceWith: Element): Unit
  
  /**
    * Set an attribute on the element.
    * @param key The key of the attribute.
    * @param value The value of the attribute.
    */
  def setAttribute(key: String, value: String): Unit
  
  /**
    * The tag name of this element.
    */
  val tagName: String
  
  /**
    * The content of the text of this element.
    */
  val textContent: String
}
object Element {
  
  inline def apply(
    appendChild: Element => Unit,
    childElements: js.Array[Element],
    getAttribute: String => String,
    getElementByName: String => Element,
    getElementsByName: String => js.Array[Element],
    insertChildAfter: (Element, Element) => Unit,
    insertChildBefore: (Element, Element) => Unit,
    ownerDocument: Document,
    parent: Element,
    removeAttribute: String => Unit,
    removeFromParent: () => Unit,
    replaceChild: (Element, Element) => Unit,
    setAttribute: (String, String) => Unit,
    tagName: String,
    textContent: String
  ): Element = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), childElements = childElements.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getElementByName = js.Any.fromFunction1(getElementByName), getElementsByName = js.Any.fromFunction1(getElementsByName), insertChildAfter = js.Any.fromFunction2(insertChildAfter), insertChildBefore = js.Any.fromFunction2(insertChildBefore), ownerDocument = ownerDocument.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], removeAttribute = js.Any.fromFunction1(removeAttribute), removeFromParent = js.Any.fromFunction0(removeFromParent), replaceChild = js.Any.fromFunction2(replaceChild), setAttribute = js.Any.fromFunction2(setAttribute), tagName = tagName.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setAppendChild(value: Element => Unit): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setChildElements(value: js.Array[Element]): Self = StObject.set(x, "childElements", value.asInstanceOf[js.Any])
    
    inline def setChildElementsVarargs(value: Element*): Self = StObject.set(x, "childElements", js.Array(value*))
    
    inline def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetElementByName(value: String => Element): Self = StObject.set(x, "getElementByName", js.Any.fromFunction1(value))
    
    inline def setGetElementsByName(value: String => js.Array[Element]): Self = StObject.set(x, "getElementsByName", js.Any.fromFunction1(value))
    
    inline def setInsertChildAfter(value: (Element, Element) => Unit): Self = StObject.set(x, "insertChildAfter", js.Any.fromFunction2(value))
    
    inline def setInsertChildBefore(value: (Element, Element) => Unit): Self = StObject.set(x, "insertChildBefore", js.Any.fromFunction2(value))
    
    inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRemoveAttribute(value: String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
    
    inline def setRemoveFromParent(value: () => Unit): Self = StObject.set(x, "removeFromParent", js.Any.fromFunction0(value))
    
    inline def setReplaceChild(value: (Element, Element) => Unit): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    inline def setSetAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
  }
}
