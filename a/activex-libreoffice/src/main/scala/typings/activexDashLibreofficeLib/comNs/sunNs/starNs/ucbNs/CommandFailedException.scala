package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown if an exception situation occurred during the processing of a command and an {@link com.sun.star.task.XInteractionHandler}
  * was able to handle the request for the error condition and the requesting code decided to abort the command execution according to the selection made
  * by the interaction handler.
  * @author Kai Sommerfeld
  * @see XCommandProcessor
  * @version 1.0
  */
trait CommandFailedException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains the exception that was passed to the {@link com.sun.star.task.XInteractionHandler} . */
  var Reason: js.Any
}

