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
@js.native
trait AuthenticationFallbackRequest extends ClassifiedInteractionRequest {
  /** Instructions to be followed by the user */
  var instructions: String = js.native
  /** url to be opened in browser */
  var url: String = js.native
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
  @scala.inline
  implicit class AuthenticationFallbackRequestOps[Self <: AuthenticationFallbackRequest] (val x: Self) extends AnyVal {
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
    def setInstructions(value: String): Self = this.set("instructions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

