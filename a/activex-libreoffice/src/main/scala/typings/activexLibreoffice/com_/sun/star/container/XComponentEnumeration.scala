package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a typified enumeration through components. */
@js.native
trait XComponentEnumeration extends XEnumeration {
  
  /**
    * @returns the next component of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    */
  def nextComponent(): XComponent = js.native
}
object XComponentEnumeration {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    hasMoreElements: () => Boolean,
    nextComponent: () => XComponent,
    nextElement: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentEnumeration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextComponent = js.Any.fromFunction0(nextComponent), nextElement = js.Any.fromFunction0(nextElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentEnumeration]
  }
  
  @scala.inline
  implicit class XComponentEnumerationMutableBuilder[Self <: XComponentEnumeration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextComponent(value: () => XComponent): Self = StObject.set(x, "nextComponent", js.Any.fromFunction0(value))
  }
}
