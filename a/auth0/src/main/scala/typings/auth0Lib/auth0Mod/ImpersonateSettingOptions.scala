package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImpersonateSettingOptions extends js.Object {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var impersonator_id: java.lang.String
  var protocol: java.lang.String
  var token: java.lang.String
}

object ImpersonateSettingOptions {
  @scala.inline
  def apply(
    impersonator_id: java.lang.String,
    protocol: java.lang.String,
    token: java.lang.String,
    clientId: java.lang.String = null
  ): ImpersonateSettingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("impersonator_id")(impersonator_id)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("token")(token)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    __obj.asInstanceOf[ImpersonateSettingOptions]
  }
}

