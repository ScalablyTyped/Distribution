package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic exception thrown when setting up a connection to an underlying backend fails.
  *
  * Indicates an error that originates in the underlying access layer.
  * @since OOo 1.1.2
  */
trait BackendSetupException
  extends StObject
     with Exception {
  
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
    val __obj = js.Dynamic.literal(BackendException = BackendException.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendSetupException]
  }
  
  @scala.inline
  implicit class BackendSetupExceptionMutableBuilder[Self <: BackendSetupException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendException(value: js.Any): Self = StObject.set(x, "BackendException", value.asInstanceOf[js.Any])
  }
}
