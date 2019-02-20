package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is used to indicate that the requested type of data sink is not supported.
  *
  * For example, each {@link OpenCommandArgument} supplied as argument of the command "open" contains such a data sink.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
trait UnsupportedDataSinkException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains the data sink that is not supported. */
  var Sink: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

