package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs.backendNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic exception thrown when setting up a connection to an underlying backend fails.
  *
  * Indicates an error that originates in the underlying access layer.
  * @since OOo 1.1.2
  */
trait BackendSetupException extends Exception {
  /**
    * The exception that is raised by the underlying backend implementation.
    *
    * May be a numeric error code, a message `string` or `VOID` , if the original exception is not represented as a {@link com.sun.star.uno.Exception} .
    */
  var BackendException: js.Any
}

object BackendSetupException {
  @scala.inline
  def apply(BackendException: js.Any, Context: XInterface, Message: String): BackendSetupException = {
    val __obj = js.Dynamic.literal(BackendException = BackendException, Context = Context, Message = Message)
  
    __obj.asInstanceOf[BackendSetupException]
  }
}

