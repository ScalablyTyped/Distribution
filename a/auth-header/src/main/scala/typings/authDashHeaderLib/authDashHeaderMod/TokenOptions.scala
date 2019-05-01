package typings
package authDashHeaderLib.authDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOptions extends js.Object {
  var params: js.UndefOr[Params] = js.undefined
  var scheme: java.lang.String
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(scheme: java.lang.String, params: Params = null, token: java.lang.String = null): TokenOptions = {
    val __obj = js.Dynamic.literal(scheme = scheme)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[TokenOptions]
  }
}

