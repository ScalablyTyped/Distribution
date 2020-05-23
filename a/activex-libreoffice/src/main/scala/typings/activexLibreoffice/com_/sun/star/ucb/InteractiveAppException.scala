package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An application error.
  * @since OOo 1.1.2
  */
trait InteractiveAppException extends ClassifiedInteractionRequest {
  /** The type of application error. */
  var Code: Double
}

object InteractiveAppException {
  @scala.inline
  def apply(Classification: InteractionClassification, Code: Double, Context: XInterface, Message: String): InteractiveAppException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveAppException]
  }
}

