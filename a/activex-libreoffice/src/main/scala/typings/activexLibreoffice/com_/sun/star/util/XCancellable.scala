package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * offers the possibility of canceling a job.
  *
  * This is supported by objects which represent a job.
  */
trait XCancellable
  extends StObject
     with XInterface {
  
  /** cancels the current job of the object. */
  def cancel(): Unit
}
object XCancellable {
  
  inline def apply(acquire: () => Unit, cancel: () => Unit, queryInterface: `type` => Any, release: () => Unit): XCancellable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCancellable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCancellable] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
