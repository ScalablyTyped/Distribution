package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait UnsupportedOpenModeException extends Exception {
  /** contains the {@link OpenMode} that is not supported. */
  var Mode: Double
}

object UnsupportedOpenModeException {
  @scala.inline
  def apply(Context: XInterface, Message: String, Mode: Double): UnsupportedOpenModeException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, Mode = Mode)
  
    __obj.asInstanceOf[UnsupportedOpenModeException]
  }
}

