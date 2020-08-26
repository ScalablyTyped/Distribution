package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0Identity extends js.Object {
  var connection: String = js.native
  var isSocial: Boolean = js.native
  var provider: String = js.native
  var user_id: String = js.native
}

object Auth0Identity {
  @scala.inline
  def apply(connection: String, isSocial: Boolean, provider: String, user_id: String): Auth0Identity = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSocial = isSocial.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Identity]
  }
  @scala.inline
  implicit class Auth0IdentityOps[Self <: Auth0Identity] (val x: Self) extends AnyVal {
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
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSocial(value: Boolean): Self = this.set("isSocial", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
  }
  
}

