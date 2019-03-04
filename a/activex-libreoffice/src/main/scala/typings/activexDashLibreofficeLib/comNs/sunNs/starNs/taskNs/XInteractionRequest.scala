package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The description of an interaction request. */
trait XInteractionRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  val Continuations: activexDashInteropLib.SafeArray[XInteractionContinuation]
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  val Request: js.Any
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  def getContinuations(): activexDashInteropLib.SafeArray[XInteractionContinuation]
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  def getRequest(): js.Any
}

object XInteractionRequest {
  @scala.inline
  def apply(
    Continuations: activexDashInteropLib.SafeArray[XInteractionContinuation],
    Request: js.Any,
    acquire: js.Function0[scala.Unit],
    getContinuations: js.Function0[activexDashInteropLib.SafeArray[XInteractionContinuation]],
    getRequest: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInteractionRequest = {
    val __obj = js.Dynamic.literal(Continuations = Continuations, Request = Request, acquire = acquire, getContinuations = getContinuations, getRequest = getRequest, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInteractionRequest]
  }
}

