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

object UnsupportedOpenModeException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    Mode: scala.Double
  ): UnsupportedOpenModeException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, Mode = Mode)
  
    __obj.asInstanceOf[UnsupportedOpenModeException]
  }
}

