package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImpersonateSettingOptions extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var impersonator_id: String
  var protocol: String
  var token: String
}

object ImpersonateSettingOptions {
  @scala.inline
  def apply(impersonator_id: String, protocol: String, token: String, clientId: String = null): ImpersonateSettingOptions = {
    val __obj = js.Dynamic.literal(impersonator_id = impersonator_id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpersonateSettingOptions]
  }
}

