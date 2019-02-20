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

