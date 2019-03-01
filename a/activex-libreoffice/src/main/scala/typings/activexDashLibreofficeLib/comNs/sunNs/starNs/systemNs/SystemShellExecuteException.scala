package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * May be thrown in cases of errors executing a command using the {@link SystemShellExecute} service. {@link com.sun.star.uno.Exception.Message} may
  * contain a system error message, but it is not mandatory. The member PosixError specifies a POSIX conforming error code or -1 for unknown errors.
  */
trait SystemShellExecuteException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** A POSIX conforming error code or -1 for unknown errors. */
  var PosixError: scala.Double
}

object SystemShellExecuteException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    PosixError: scala.Double
  ): SystemShellExecuteException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("PosixError")(PosixError)
    __obj.asInstanceOf[SystemShellExecuteException]
  }
}

