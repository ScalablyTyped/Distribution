package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The description of an interaction request. */
trait XInteractionRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  val Continuations: stdLib.SafeArray[XInteractionContinuation]
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  val Request: js.Any
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  def getContinuations(): stdLib.SafeArray[XInteractionContinuation]
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  def getRequest(): js.Any
}

object XInteractionRequest {
  @scala.inline
  def apply(
    Continuations: stdLib.SafeArray[XInteractionContinuation],
    Request: js.Any,
    acquire: () => scala.Unit,
    getContinuations: () => stdLib.SafeArray[XInteractionContinuation],
    getRequest: () => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XInteractionRequest = {
    val __obj = js.Dynamic.literal(Continuations = Continuations, Request = Request, acquire = js.Any.fromFunction0(acquire), getContinuations = js.Any.fromFunction0(getContinuations), getRequest = js.Any.fromFunction0(getRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInteractionRequest]
  }
}

