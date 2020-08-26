package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegationOptions extends js.Object {
  var api_type: js.UndefOr[String] = js.native
  var client_id: js.UndefOr[String] = js.native
  var grant_type: String = js.native
  var id_token: js.UndefOr[String] = js.native
  var refresh_token: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var target: js.UndefOr[String] = js.native
}

object DelegationOptions {
  @scala.inline
  def apply(grant_type: String): DelegationOptions = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationOptions]
  }
  @scala.inline
  implicit class DelegationOptionsOps[Self <: DelegationOptions] (val x: Self) extends AnyVal {
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
    def setGrant_type(value: String): Self = this.set("grant_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_type(value: String): Self = this.set("api_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_type: Self = this.set("api_type", js.undefined)
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_token: Self = this.set("id_token", js.undefined)
    @scala.inline
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh_token: Self = this.set("refresh_token", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

