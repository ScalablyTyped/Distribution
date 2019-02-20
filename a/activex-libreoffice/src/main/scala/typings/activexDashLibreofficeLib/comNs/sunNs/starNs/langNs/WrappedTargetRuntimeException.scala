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

