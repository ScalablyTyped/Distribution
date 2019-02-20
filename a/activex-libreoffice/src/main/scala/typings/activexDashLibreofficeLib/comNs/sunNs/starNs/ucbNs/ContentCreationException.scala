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

