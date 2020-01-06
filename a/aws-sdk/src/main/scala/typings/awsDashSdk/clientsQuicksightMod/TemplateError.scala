package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateError extends js.Object {
  /**
    * Description of the error type.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
  /**
    * Type of error.
    */
  var Type: js.UndefOr[TemplateErrorType] = js.native
}

object TemplateError {
  @scala.inline
  def apply(Message: NonEmptyString = null, Type: TemplateErrorType = null): TemplateError = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateError]
  }
}

