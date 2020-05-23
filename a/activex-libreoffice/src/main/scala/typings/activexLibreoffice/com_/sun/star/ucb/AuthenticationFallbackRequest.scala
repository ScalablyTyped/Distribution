package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back some authentication data
  * @since LibreOffice 4.4
  */
trait AuthenticationFallbackRequest extends ClassifiedInteractionRequest {
  /** Instructions to be followed by the user */
  var instructions: String
  /** url to be opened in browser */
  var url: String
}

object AuthenticationFallbackRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    instructions: String,
    url: String
  ): AuthenticationFallbackRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationFallbackRequest]
  }
}

