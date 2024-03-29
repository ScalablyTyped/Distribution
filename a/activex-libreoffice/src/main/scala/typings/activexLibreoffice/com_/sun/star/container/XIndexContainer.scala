package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the insertion and removal of indexed elements.
  * @see XContainer
  */
trait XIndexContainer
  extends StObject
     with XIndexReplace {
  
  /**
    * inserts the given element at the specified index.
    *
    * To append an element, use the index "last index +1".
    */
  def insertByIndex(Index: Double, Element: Any): Unit
  
  /** removes the element at the specified index. */
  def removeByIndex(Index: Double): Unit
}
object XIndexContainer {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertByIndex: (Double, Any) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByIndex: Double => Unit,
    replaceByIndex: (Double, Any) => Unit
  ): XIndexContainer = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), replaceByIndex = js.Any.fromFunction2(replaceByIndex))
    __obj.asInstanceOf[XIndexContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XIndexContainer] (val x: Self) extends AnyVal {
    
    inline def setInsertByIndex(value: (Double, Any) => Unit): Self = StObject.set(x, "insertByIndex", js.Any.fromFunction2(value))
    
    inline def setRemoveByIndex(value: Double => Unit): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1(value))
  }
}
