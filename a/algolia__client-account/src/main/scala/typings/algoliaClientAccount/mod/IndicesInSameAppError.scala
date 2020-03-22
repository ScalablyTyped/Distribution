package typings.algoliaClientAccount.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & { readonly appId  :string} */
trait IndicesInSameAppError extends js.Object {
  /**
    * The app id.
    */
  val appId: String
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
}

object IndicesInSameAppError {
  @scala.inline
  def apply(appId: String, message: String, name: String, stack: String = null): IndicesInSameAppError = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesInSameAppError]
  }
}

