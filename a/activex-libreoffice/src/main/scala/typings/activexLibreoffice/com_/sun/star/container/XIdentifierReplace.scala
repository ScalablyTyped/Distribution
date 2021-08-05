package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is the generic interface for supporting the replacement of elements with unique identifiers. */
trait XIdentifierReplace
  extends StObject
     with XIdentifierAccess {
  
  /**
    * replaces the element with the specified identifier.
    * @param Identifier specifies the identifier of the element that should be retrieved.
    * @param aElement the new element that replaces the old element for the specified identifier.
    * @throws com::sun::star::lang::IllegalArgumentException If the argument is not valid for this container.
    * @throws com::sun::star::lang::NoSuchElementException If the identifier is not existing.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def replaceByIdentifer(Identifier: Double, aElement: js.Any): Unit
}
object XIdentifierReplace {
  
  inline def apply(
    ElementType: `type`,
    Identifiers: SafeArray[Double],
    acquire: () => Unit,
    getByIdentifier: Double => js.Any,
    getElementType: () => `type`,
    getIdentifiers: () => SafeArray[Double],
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceByIdentifer: (Double, js.Any) => Unit
  ): XIdentifierReplace = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], Identifiers = Identifiers.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = js.Any.fromFunction0(getElementType), getIdentifiers = js.Any.fromFunction0(getIdentifiers), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByIdentifer = js.Any.fromFunction2(replaceByIdentifer))
    __obj.asInstanceOf[XIdentifierReplace]
  }
  
  extension [Self <: XIdentifierReplace](x: Self) {
    
    inline def setReplaceByIdentifer(value: (Double, js.Any) => Unit): Self = StObject.set(x, "replaceByIdentifer", js.Any.fromFunction2(value))
  }
}
