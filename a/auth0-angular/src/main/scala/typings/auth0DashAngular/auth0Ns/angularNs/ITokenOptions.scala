package typings.auth0DashAngular.auth0Ns.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenOptions extends js.Object {
  var api: js.UndefOr[String] = js.undefined
  var targetClientId: js.UndefOr[String] = js.undefined
}

object ITokenOptions {
  @scala.inline
  def apply(api: String = null, targetClientId: String = null): ITokenOptions = {
    val __obj = js.Dynamic.literal()
    if (api != null) __obj.updateDynamic("api")(api)
    if (targetClientId != null) __obj.updateDynamic("targetClientId")(targetClientId)
    __obj.asInstanceOf[ITokenOptions]
  }
}

