package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link DeploymentException} reflects a deployment error.
  * @since OOo 2.0
  */
trait DeploymentException extends Exception {
  /** reflects the cause of the error. Commonly an exception. */
  var Cause: js.Any
}

object DeploymentException {
  @scala.inline
  def apply(Cause: js.Any, Context: XInterface, Message: String): DeploymentException = {
    val __obj = js.Dynamic.literal(Cause = Cause.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentException]
  }
}

