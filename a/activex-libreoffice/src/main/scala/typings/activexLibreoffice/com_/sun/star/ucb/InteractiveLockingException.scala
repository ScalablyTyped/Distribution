package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error related to locking operations.
  *
  * Various meaningful errors are derived from this exception.
  * @since OOo 3.3
  */
trait InteractiveLockingException extends ClassifiedInteractionRequest {
  /** The Url of the resource this exception is related to. */
  var Url: String
}

object InteractiveLockingException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Url: String): InteractiveLockingException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveLockingException]
  }
}

