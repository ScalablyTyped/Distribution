package typings.awsDashSdk.clientsComputeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationError extends js.Object {
  /**
    * The error code.
    */
  var code: js.UndefOr[Code] = js.native
  /**
    * The ID of the error.
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * The message, or reason, for the error.
    */
  var message: js.UndefOr[Message] = js.native
}

object GetRecommendationError {
  @scala.inline
  def apply(code: Code = null, identifier: Identifier = null, message: Message = null): GetRecommendationError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationError]
  }
}

