package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseClientOptions extends js.Object {
  var baseUrl: java.lang.String
  var clientId: js.UndefOr[java.lang.String] = js.undefined
}

object BaseClientOptions {
  @scala.inline
  def apply(baseUrl: java.lang.String, clientId: java.lang.String = null): BaseClientOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    __obj.asInstanceOf[BaseClientOptions]
  }
}

