package typings.activexLibreoffice.com_.sun.star.system

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], PosixError = PosixError.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemShellExecuteException]
  }
}

