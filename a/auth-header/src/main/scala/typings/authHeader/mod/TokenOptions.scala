package typings.authHeader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOptions extends js.Object {
  var params: js.UndefOr[Params] = js.undefined
  var scheme: String
  var token: js.UndefOr[String] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(scheme: String, params: Params = null, token: String = null): TokenOptions = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenOptions]
  }
}

