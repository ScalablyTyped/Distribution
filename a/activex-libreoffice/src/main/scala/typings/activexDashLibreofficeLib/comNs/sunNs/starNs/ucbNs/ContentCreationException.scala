package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown to indicate that the creation of a UCB content failed.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait ContentCreationException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** An error code. */
  var eError: ContentCreationError
}

object ContentCreationException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    eError: ContentCreationError
  ): ContentCreationException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("eError")(eError)
    __obj.asInstanceOf[ContentCreationException]
  }
}

