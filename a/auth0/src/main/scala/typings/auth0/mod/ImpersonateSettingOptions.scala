package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImpersonateSettingOptions extends js.Object {
  var clientId: js.UndefOr[String] = js.native
  var impersonator_id: String = js.native
  var protocol: String = js.native
  var token: String = js.native
}

object ImpersonateSettingOptions {
  @scala.inline
  def apply(impersonator_id: String, protocol: String, token: String): ImpersonateSettingOptions = {
    val __obj = js.Dynamic.literal(impersonator_id = impersonator_id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpersonateSettingOptions]
  }
  @scala.inline
  implicit class ImpersonateSettingOptionsOps[Self <: ImpersonateSettingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImpersonator_id(value: String): Self = this.set("impersonator_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
  }
  
}

