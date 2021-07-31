package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the elements of a collection through an index.
  *
  * This interface should only be used if the data structure, itself, is indexed.
  */
trait XIndexAccess
  extends StObject
     with XElementAccess {
  
  /** @returns the number of elements in this container. */
  val Count: Double
  
  /**
    * @param Index specifies the position in the array. The first index is 0.
    * @returns the element at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByIndex(Index: Double): js.Any
  
  /** @returns the number of elements in this container. */
  def getCount(): Double
}
object XIndexAccess {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIndexAccess = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIndexAccess]
  }
  
  @scala.inline
  implicit class XIndexAccessMutableBuilder[Self <: XIndexAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetByIndex(value: Double => js.Any): Self = StObject.set(x, "getByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
  }
}
