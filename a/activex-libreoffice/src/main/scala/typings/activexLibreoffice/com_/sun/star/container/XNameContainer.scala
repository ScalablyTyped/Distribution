package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the insertion and removal of named elements.
  * @see XContainer
  */
trait XNameContainer
  extends StObject
     with XNameReplace {
  
  /** inserts the given element at the specified name. */
  def insertByName(aName: String, aElement: Any): Unit
  
  /** removes the element with the specified name. */
  def removeByName(Name: String): Unit
}
object XNameContainer {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    getByName: String => Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertByName: (String, Any) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByName: String => Unit,
    replaceByName: (String, Any) => Unit
  ): XNameContainer = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), replaceByName = js.Any.fromFunction2(replaceByName))
    __obj.asInstanceOf[XNameContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XNameContainer] (val x: Self) extends AnyVal {
    
    inline def setInsertByName(value: (String, Any) => Unit): Self = StObject.set(x, "insertByName", js.Any.fromFunction2(value))
    
    inline def setRemoveByName(value: String => Unit): Self = StObject.set(x, "removeByName", js.Any.fromFunction1(value))
  }
}
