package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction request handler.
  *
  * This interface extends the interface {@link XInteractionHandler} the way that a caller can determine whether an interaction request was actually
  * handled by the interaction handler.
  * @since OOo 3.2
  */
trait XInteractionHandler2
  extends StObject
     with XInteractionHandler {
  
  /**
    * Handle an interaction request.
    * @param Request the inteaction request to handle.
    * @returns `TRUE` , if the handler handled the request, `FALSE` otherwise.
    */
  def handleInteractionRequest(Request: XInteractionRequest): Boolean
}
object XInteractionHandler2 {
  
  inline def apply(
    acquire: () => Unit,
    handle: XInteractionRequest => Unit,
    handleInteractionRequest: XInteractionRequest => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XInteractionHandler2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handle = js.Any.fromFunction1(handle), handleInteractionRequest = js.Any.fromFunction1(handleInteractionRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionHandler2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XInteractionHandler2] (val x: Self) extends AnyVal {
    
    inline def setHandleInteractionRequest(value: XInteractionRequest => Boolean): Self = StObject.set(x, "handleInteractionRequest", js.Any.fromFunction1(value))
  }
}
