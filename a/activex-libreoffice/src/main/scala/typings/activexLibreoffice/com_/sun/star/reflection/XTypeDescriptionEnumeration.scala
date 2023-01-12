package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an enumeration for type descriptions.
  * @since OOo 1.1.2
  */
trait XTypeDescriptionEnumeration
  extends StObject
     with XEnumeration {
  
  /**
    * Returns the next element of the enumeration.
    * @returns the next element of this enumeration.
    * @throws com::sun::star::container::NoSuchElementException if no more elements exist.
    */
  def nextTypeDescription(): XTypeDescription
}
object XTypeDescriptionEnumeration {
  
  inline def apply(
    acquire: () => Unit,
    hasMoreElements: () => Boolean,
    nextElement: () => Any,
    nextTypeDescription: () => XTypeDescription,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XTypeDescriptionEnumeration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement), nextTypeDescription = js.Any.fromFunction0(nextTypeDescription), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTypeDescriptionEnumeration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTypeDescriptionEnumeration] (val x: Self) extends AnyVal {
    
    inline def setNextTypeDescription(value: () => XTypeDescription): Self = StObject.set(x, "nextTypeDescription", js.Any.fromFunction0(value))
  }
}
