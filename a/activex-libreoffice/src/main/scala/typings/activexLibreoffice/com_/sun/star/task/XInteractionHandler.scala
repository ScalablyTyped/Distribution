package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interaction request handler. */
trait XInteractionHandler
  extends StObject
     with XInterface {
  
  /** Handle an interaction request. */
  def handle(Request: XInteractionRequest): Unit
}
object XInteractionHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    handle: XInteractionRequest => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handle = js.Any.fromFunction1(handle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionHandler]
  }
  
  @scala.inline
  implicit class XInteractionHandlerMutableBuilder[Self <: XInteractionHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: XInteractionRequest => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
  }
}
