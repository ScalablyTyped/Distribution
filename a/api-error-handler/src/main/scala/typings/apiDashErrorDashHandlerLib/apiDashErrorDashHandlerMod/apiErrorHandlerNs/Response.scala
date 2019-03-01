package typings
package apiDashErrorDashHandlerLib.apiDashErrorDashHandlerMod.apiErrorHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Body response: the JSON returned by api-error-handler
// See https://github.com/expressjs/api-error-handler/blob/1.0.0/index.js
trait Response extends js.Object {
  // Client errors
  var code: js.UndefOr[js.Any] = js.undefined
  var message: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var status: scala.Double
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    message: java.lang.String,
    status: scala.Double,
    code: js.Any = null,
    name: java.lang.String = null,
    stack: java.lang.String = null,
    `type`: js.Any = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("status")(status)
    if (code != null) __obj.updateDynamic("code")(code)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Response]
  }
}

