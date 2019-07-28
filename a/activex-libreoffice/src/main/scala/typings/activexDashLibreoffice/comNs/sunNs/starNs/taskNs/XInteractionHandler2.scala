package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction request handler.
  *
  * This interface extends the interface {@link XInteractionHandler} the way that a caller can determine whether an interaction request was actually
  * handled by the interaction handler.
  * @since OOo 3.2
  */
trait XInteractionHandler2 extends XInteractionHandler {
  /**
    * Handle an interaction request.
    * @param Request the inteaction request to handle.
    * @returns `TRUE` , if the handler handled the request, `FALSE` otherwise.
    */
  def handleInteractionRequest(Request: XInteractionRequest): Boolean
}

object XInteractionHandler2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    handle: XInteractionRequest => Unit,
    handleInteractionRequest: XInteractionRequest => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionHandler2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handle = js.Any.fromFunction1(handle), handleInteractionRequest = js.Any.fromFunction1(handleInteractionRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInteractionHandler2]
  }
}

