package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An exception used to notify a name clash. */
trait NameClashException extends ClassifiedInteractionRequest {
  /** contains the clashing name. */
  var Name: String
}

object NameClashException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Name: String): NameClashException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameClashException]
  }
}

