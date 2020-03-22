package typings.apolloLinkHttpCommon.mod

import typings.std.Record
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  response  :std.Response,   result  :std.Record<string, any>,   statusCode  :number} */
trait ServerError extends js.Object {
  var message: String
  var name: String
  var response: Response
  var result: Record[String, _]
  var stack: js.UndefOr[String] = js.undefined
  var statusCode: Double
}

object ServerError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    response: Response,
    result: Record[String, _],
    statusCode: Double,
    stack: String = null
  ): ServerError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerError]
  }
}

