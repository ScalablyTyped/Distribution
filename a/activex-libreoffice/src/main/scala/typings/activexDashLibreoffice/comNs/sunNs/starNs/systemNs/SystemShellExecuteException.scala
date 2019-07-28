package typings.activexDashLibreoffice.comNs.sunNs.starNs.systemNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * May be thrown in cases of errors executing a command using the {@link SystemShellExecute} service. {@link com.sun.star.uno.Exception.Message} may
  * contain a system error message, but it is not mandatory. The member PosixError specifies a POSIX conforming error code or -1 for unknown errors.
  */
trait SystemShellExecuteException extends Exception {
  /** A POSIX conforming error code or -1 for unknown errors. */
  var PosixError: Double
}

object SystemShellExecuteException {
  @scala.inline
  def apply(Context: XInterface, Message: String, PosixError: Double): SystemShellExecuteException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, PosixError = PosixError)
  
    __obj.asInstanceOf[SystemShellExecuteException]
  }
}

