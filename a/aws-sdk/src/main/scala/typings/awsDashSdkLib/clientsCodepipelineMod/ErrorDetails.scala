package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetails extends js.Object {
  /**
    * The system ID or error number code of the error.
    */
  var code: js.UndefOr[Code] = js.undefined
  /**
    * The text of the error message.
    */
  var message: js.UndefOr[Message] = js.undefined
}

object ErrorDetails {
  @scala.inline
  def apply(code: Code = null, message: Message = null): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ErrorDetails]
  }
}

