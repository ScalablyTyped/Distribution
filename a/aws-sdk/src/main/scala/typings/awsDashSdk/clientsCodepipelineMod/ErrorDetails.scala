package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetails extends js.Object {
  /**
    * The system ID or number code of the error.
    */
  var code: js.UndefOr[Code] = js.native
  /**
    * The text of the error message.
    */
  var message: js.UndefOr[Message] = js.native
}

object ErrorDetails {
  @scala.inline
  def apply(code: Code = null, message: Message = null): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
}

