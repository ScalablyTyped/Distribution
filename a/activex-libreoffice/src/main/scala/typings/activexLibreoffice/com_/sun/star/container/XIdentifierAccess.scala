package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the elements of a collection through a unique identifier. */
trait XIdentifierAccess
  extends StObject
     with XElementAccess {
  
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  val Identifiers: SafeArray[Double]
  
  /**
    * @param Identifier specifies the identifier of the element that should be retrieved.
    * @returns the element with the specified identifier
    * @throws com::sun::star::lang::NoSuchElementException If the identifier is not existing.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByIdentifier(Identifier: Double): Any
  
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  def getIdentifiers(): SafeArray[Double]
}
object XIdentifierAccess {
  
  inline def apply(
    ElementType: `type`,
    Identifiers: SafeArray[Double],
    acquire: () => Unit,
    getByIdentifier: Double => Any,
    getElementType: () => `type`,
    getIdentifiers: () => SafeArray[Double],
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XIdentifierAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], Identifiers = Identifiers.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = js.Any.fromFunction0(getElementType), getIdentifiers = js.Any.fromFunction0(getIdentifiers), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIdentifierAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XIdentifierAccess] (val x: Self) extends AnyVal {
    
    inline def setGetByIdentifier(value: Double => Any): Self = StObject.set(x, "getByIdentifier", js.Any.fromFunction1(value))
    
    inline def setGetIdentifiers(value: () => SafeArray[Double]): Self = StObject.set(x, "getIdentifiers", js.Any.fromFunction0(value))
    
    inline def setIdentifiers(value: SafeArray[Double]): Self = StObject.set(x, "Identifiers", value.asInstanceOf[js.Any])
  }
}
