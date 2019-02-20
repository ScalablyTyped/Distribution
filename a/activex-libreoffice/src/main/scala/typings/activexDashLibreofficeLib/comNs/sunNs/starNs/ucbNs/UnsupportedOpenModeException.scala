package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is used to indicate that the requested {@link OpenMode} is not supported.
  *
  * For example, each {@link OpenCommandArgument} supplied as argument of the command "open" contains such an open mode.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
trait UnsupportedOpenModeException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains the {@link OpenMode} that is not supported. */
  var Mode: scala.Double
}

