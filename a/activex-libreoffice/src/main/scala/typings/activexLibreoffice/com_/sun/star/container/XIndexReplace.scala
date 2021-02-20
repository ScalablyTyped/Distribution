package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the replacement of indexed elements.
  * @see XContainer
  */
@js.native
trait XIndexReplace extends XIndexAccess {
  
  /** replaces the element at the specified index with the given element. */
  def replaceByIndex(Index: Double, Element: js.Any): Unit = js.native
}
object XIndexReplace {
  
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
    release: () => Unit,
    replaceByIndex: (Double, js.Any) => Unit
  ): XIndexReplace = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByIndex = js.Any.fromFunction2(replaceByIndex))
    __obj.asInstanceOf[XIndexReplace]
  }
  
  @scala.inline
  implicit class XIndexReplaceMutableBuilder[Self <: XIndexReplace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplaceByIndex(value: (Double, js.Any) => Unit): Self = StObject.set(x, "replaceByIndex", js.Any.fromFunction2(value))
  }
}
