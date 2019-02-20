package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request specifies the mode in which the password should be asked
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a password. Continuations for using with the mentioned service
  * are Abort and Approve.
  */
trait PasswordRequest extends ClassifiedInteractionRequest {
  /**
    * the mode in which password should be asked
    * @see com.sun.star.task.PasswordRequestMode
    */
  var Mode: PasswordRequestMode
}

