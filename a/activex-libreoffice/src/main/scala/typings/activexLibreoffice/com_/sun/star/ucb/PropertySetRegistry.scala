package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service contains the interfaces to implement by objects returned by XPropertySetRegistryFactory::createRegistry(). */
trait PropertySetRegistry
  extends StObject
     with XPropertySetRegistry
     with XNameAccess
object PropertySetRegistry {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    openPropertySet: (String, Boolean) => XPersistentPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertySet: String => Unit
  ): PropertySetRegistry = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), openPropertySet = js.Any.fromFunction2(openPropertySet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertySet = js.Any.fromFunction1(removePropertySet))
    __obj.asInstanceOf[PropertySetRegistry]
  }
}
