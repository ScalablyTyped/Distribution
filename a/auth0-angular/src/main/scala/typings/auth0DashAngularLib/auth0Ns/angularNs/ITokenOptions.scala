package typings
package auth0DashAngularLib.auth0Ns.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenOptions extends js.Object {
  var api: js.UndefOr[java.lang.String] = js.undefined
  var targetClientId: js.UndefOr[java.lang.String] = js.undefined
}

object ITokenOptions {
  @scala.inline
  def apply(api: java.lang.String = null, targetClientId: java.lang.String = null): ITokenOptions = {
    val __obj = js.Dynamic.literal()
    if (api != null) __obj.updateDynamic("api")(api)
    if (targetClientId != null) __obj.updateDynamic("targetClientId")(targetClientId)
    __obj.asInstanceOf[ITokenOptions]
  }
}

