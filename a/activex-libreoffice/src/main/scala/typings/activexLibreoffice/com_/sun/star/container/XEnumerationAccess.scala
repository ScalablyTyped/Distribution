package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to enumerate objects in a container which contains objects. */
trait XEnumerationAccess
  extends StObject
     with XElementAccess {
  
  /** @returns a new enumeration object for this container. It returns NULL if there are no objects in this container. */
  def createEnumeration(): XEnumeration
}
object XEnumerationAccess {
  
  inline def apply(
    ElementType: `type`,
    acquire: () => Unit,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEnumerationAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEnumerationAccess]
  }
  
  extension [Self <: XEnumerationAccess](x: Self) {
    
    inline def setCreateEnumeration(value: () => XEnumeration): Self = StObject.set(x, "createEnumeration", js.Any.fromFunction0(value))
  }
}
