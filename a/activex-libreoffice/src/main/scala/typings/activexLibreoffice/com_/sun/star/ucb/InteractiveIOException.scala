package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An input/output error. */
trait InteractiveIOException extends ClassifiedInteractionRequest {
  /** The type of input/output error. */
  var Code: IOErrorCode
}

object InteractiveIOException {
  @scala.inline
  def apply(Classification: InteractionClassification, Code: IOErrorCode, Context: XInterface, Message: String): InteractiveIOException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveIOException]
  }
}

