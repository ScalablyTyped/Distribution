package typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a checked exception that wraps an exception thrown by the original target.
  *
  * Normally this exception is declared for generic methods.
  * @see com.sun.star.container.XIndexAccess
  * @see com.sun.star.container.XNameAccess
  * @see com.sun.star.beans.XPropertySet
  */
trait WrappedTargetException extends Exception {
  /** The exception is thrown by the target. */
  var TargetException: js.Any
}

object WrappedTargetException {
  @scala.inline
  def apply(Context: XInterface, Message: String, TargetException: js.Any): WrappedTargetException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, TargetException = TargetException)
  
    __obj.asInstanceOf[WrappedTargetException]
  }
}

