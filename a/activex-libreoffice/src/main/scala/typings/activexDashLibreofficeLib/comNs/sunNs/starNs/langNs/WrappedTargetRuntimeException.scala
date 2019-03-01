package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a runtime exception that wraps any other exception thrown by the original target.
  *
  * This exception should not be declared at interfaces, use {@link WrappedTargetException} instead. It was defined to transport an exception via
  * interface-methods, that do not specify the appropriate exceptions (so using this exception should in general be avoided).
  */
trait WrappedTargetRuntimeException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The exception is thrown by the target. */
  var TargetException: js.Any
}

object WrappedTargetRuntimeException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    TargetException: js.Any
  ): WrappedTargetRuntimeException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("TargetException")(TargetException)
    __obj.asInstanceOf[WrappedTargetRuntimeException]
  }
}

