package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

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
  def handleInteractionRequest(Request: XInteractionRequest): scala.Boolean
}

object XInteractionHandler2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    handle: js.Function1[XInteractionRequest, scala.Unit],
    handleInteractionRequest: js.Function1[XInteractionRequest, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInteractionHandler2 = {
    val __obj = js.Dynamic.literal(acquire = acquire, handle = handle, handleInteractionRequest = handleInteractionRequest, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInteractionHandler2]
  }
}

