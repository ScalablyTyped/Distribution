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

