package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & { readonly status  :number,  readonly transporterStackTrace  :std.Array<@algolia/transporter.@algolia/transporter.StackFrame>} */
trait ApiError extends js.Object {
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
  /**
    * The http status code.
    */
  val status: Double
  /**
    * Contains report of stack frames of the
    * execution of a certain request.
    */
  val transporterStackTrace: js.Array[StackFrame]
}

object ApiError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    status: Double,
    transporterStackTrace: js.Array[StackFrame],
    stack: String = null
  ): ApiError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transporterStackTrace = transporterStackTrace.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
}

