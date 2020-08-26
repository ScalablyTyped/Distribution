package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown if an exception situation occurred during the processing of a command and an {@link com.sun.star.task.XInteractionHandler}
  * was able to handle the request for the error condition and the requesting code decided to abort the command execution according to the selection made
  * by the interaction handler.
  * @author Kai Sommerfeld
  * @see XCommandProcessor
  * @version 1.0
  */
@js.native
trait CommandFailedException extends Exception {
  /** contains the exception that was passed to the {@link com.sun.star.task.XInteractionHandler} . */
  var Reason: js.Any = js.native
}

object CommandFailedException {
  @scala.inline
  def apply(Context: XInterface, Message: String, Reason: js.Any): CommandFailedException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandFailedException]
  }
  @scala.inline
  implicit class CommandFailedExceptionOps[Self <: CommandFailedException] (val x: Self) extends AnyVal {
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
    def setReason(value: js.Any): Self = this.set("Reason", value.asInstanceOf[js.Any])
  }
  
}

