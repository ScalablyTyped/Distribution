package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to enumerate the contents of a container.
  *
  * An object that implements the {@link XEnumeration} interface generates a series of elements, one at a time. Successive calls to the
  * `XEnumeration::nextElement` method return successive elements of the series.
  *
  * For example (Java), to print all elements of a vector **aVect** :
  *
  * {{program example here, see documentation}}
  *
  *
  *
  * If the object changed, the behavior of the enumeration is not specified. This is not a remote interface.
  */
@js.native
trait XEnumeration extends XInterface {
  
  /** tests whether this enumeration contains more elements. */
  def hasMoreElements(): Boolean = js.native
  
  /**
    * @returns the next element of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def nextElement(): js.Any = js.native
}
object XEnumeration {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    hasMoreElements: () => Boolean,
    nextElement: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEnumeration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEnumeration]
  }
  
  @scala.inline
  implicit class XEnumerationMutableBuilder[Self <: XEnumeration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasMoreElements(value: () => Boolean): Self = StObject.set(x, "hasMoreElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextElement(value: () => js.Any): Self = StObject.set(x, "nextElement", js.Any.fromFunction0(value))
  }
}
