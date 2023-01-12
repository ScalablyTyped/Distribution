package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the replacement of named elements.
  * @see XContainer
  */
trait XNameReplace
  extends StObject
     with XNameAccess {
  
  /** replaces the element with the specified name with the given element. */
  def replaceByName(aName: String, aElement: Any): Unit
}
object XNameReplace {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    getByName: String => Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    replaceByName: (String, Any) => Unit
  ): XNameReplace = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByName = js.Any.fromFunction2(replaceByName))
    __obj.asInstanceOf[XNameReplace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XNameReplace] (val x: Self) extends AnyVal {
    
    inline def setReplaceByName(value: (String, Any) => Unit): Self = StObject.set(x, "replaceByName", js.Any.fromFunction2(value))
  }
}
