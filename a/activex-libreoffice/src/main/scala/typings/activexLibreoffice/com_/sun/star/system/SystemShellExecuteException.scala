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
@js.native
trait SystemShellExecuteException extends Exception {
  /** A POSIX conforming error code or -1 for unknown errors. */
  var PosixError: Double = js.native
}

object SystemShellExecuteException {
  @scala.inline
  def apply(Context: XInterface, Message: String, PosixError: Double): SystemShellExecuteException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], PosixError = PosixError.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemShellExecuteException]
  }
  @scala.inline
  implicit class SystemShellExecuteExceptionOps[Self <: SystemShellExecuteException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPosixError(value: Double): Self = this.set("PosixError", value.asInstanceOf[js.Any])
  }
  
}

