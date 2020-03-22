package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & { readonly response  :@algolia/requester-common.@algolia/requester-common.Response} */
trait DeserializationError extends js.Object {
  var message: String
  var name: String
  /**
    * The raw response from the server.
    */
  val response: Response
  var stack: js.UndefOr[String] = js.undefined
}

object DeserializationError {
  @scala.inline
  def apply(message: String, name: String, response: Response, stack: String = null): DeserializationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializationError]
  }
}

