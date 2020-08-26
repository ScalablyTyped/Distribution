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
  implicit class DeploymentExceptionOps[Self <: DeploymentException] (val x: Self) extends AnyVal {
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
    def setCause(value: js.Any): Self = this.set("Cause", value.asInstanceOf[js.Any])
  }
  
}

