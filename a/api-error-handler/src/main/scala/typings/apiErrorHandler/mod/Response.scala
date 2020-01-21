package typings.apiErrorHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Body response: the JSON returned by api-error-handler
// See https://github.com/expressjs/api-error-handler/blob/1.0.0/index.js
trait Response extends js.Object {
  // Client errors
  var code: js.UndefOr[js.Any] = js.undefined
  var message: String
  var name: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var status: Double
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    message: String,
    status: Double,
    code: js.Any = null,
    name: String = null,
    stack: String = null,
    `type`: js.Any = null
  ): Response = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

