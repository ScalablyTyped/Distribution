package typings.apolloLinkHttpCommon.mod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  response  :std.Response,   statusCode  :number,   bodyText  :string} */
trait ServerParseError extends js.Object {
  var bodyText: String
  var message: String
  var name: String
  var response: Response
  var stack: js.UndefOr[String] = js.undefined
  var statusCode: Double
}

object ServerParseError {
  @scala.inline
  def apply(
    bodyText: String,
    message: String,
    name: String,
    response: Response,
    statusCode: Double,
    stack: String = null
  ): ServerParseError = {
    val __obj = js.Dynamic.literal(bodyText = bodyText.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerParseError]
  }
}

