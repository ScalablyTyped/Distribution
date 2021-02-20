package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link DeploymentException} reflects a deployment error.
  * @since OOo 2.0
  */
@js.native
trait DeploymentException extends Exception {
  
  /** reflects the cause of the error. Commonly an exception. */
  var Cause: js.Any = js.native
}
object DeploymentException {
  
  @scala.inline
  def apply(Cause: js.Any, Context: XInterface, Message: String): DeploymentException = {
    val __obj = js.Dynamic.literal(Cause = Cause.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentException]
  }
  
  @scala.inline
  implicit class DeploymentExceptionMutableBuilder[Self <: DeploymentException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: js.Any): Self = StObject.set(x, "Cause", value.asInstanceOf[js.Any])
  }
}
