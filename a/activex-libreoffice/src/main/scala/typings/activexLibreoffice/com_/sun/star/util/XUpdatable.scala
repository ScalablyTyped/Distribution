package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects with data that can be updated from a data source. */
trait XUpdatable
  extends StObject
     with XInterface {
  
  /** refreshes the data of the object from the connected data source. */
  def update(): Unit
}
object XUpdatable {
  
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, update: () => Unit): XUpdatable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[XUpdatable]
  }
  
  @scala.inline
  implicit class XUpdatableMutableBuilder[Self <: XUpdatable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
