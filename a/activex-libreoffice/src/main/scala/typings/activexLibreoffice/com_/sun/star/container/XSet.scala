package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the insertion and removal of elements.
  * @see XContainer
  */
trait XSet
  extends StObject
     with XEnumerationAccess {
  
  /** @returns `TRUE` if the given element is a member of this container, otherwise `FALSE` . */
  def has(aElement: Any): Boolean
  
  /** inserts the given element into this container. */
  def insert(aElement: Any): Unit
  
  /** removes the given element from this container. */
  def remove(aElement: Any): Unit
}
object XSet {
  
  inline def apply(
    ElementType: `type`,
    acquire: () => Unit,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    has: Any => Boolean,
    hasElements: () => Boolean,
    insert: Any => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    remove: Any => Unit
  ): XSet = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), has = js.Any.fromFunction1(has), hasElements = js.Any.fromFunction0(hasElements), insert = js.Any.fromFunction1(insert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[XSet]
  }
  
  extension [Self <: XSet](x: Self) {
    
    inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setInsert(value: Any => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Any => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
