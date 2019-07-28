package typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a runtime exception that wraps any other exception thrown by the original target.
  *
  * This exception should not be declared at interfaces, use {@link WrappedTargetException} instead. It was defined to transport an exception via
  * interface-methods, that do not specify the appropriate exceptions (so using this exception should in general be avoided).
  */
trait WrappedTargetRuntimeException extends Exception {
  /** The exception is thrown by the target. */
  var TargetException: js.Any
}

object WrappedTargetRuntimeException {
  @scala.inline
  def apply(Context: XInterface, Message: String, TargetException: js.Any): WrappedTargetRuntimeException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, TargetException = TargetException)
  
    __obj.asInstanceOf[WrappedTargetRuntimeException]
  }
}

