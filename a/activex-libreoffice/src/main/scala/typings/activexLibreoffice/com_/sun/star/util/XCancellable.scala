package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * offers the possibility of canceling a job.
  *
  * This is supported by objects which represent a job.
  */
@js.native
trait XCancellable extends XInterface {
  
  /** cancels the current job of the object. */
  def cancel(): Unit = js.native
}
object XCancellable {
  
  @scala.inline
  def apply(acquire: () => Unit, cancel: () => Unit, queryInterface: `type` => js.Any, release: () => Unit): XCancellable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCancellable]
  }
  
  @scala.inline
  implicit class XCancellableMutableBuilder[Self <: XCancellable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
