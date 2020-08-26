package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultLoginOptions extends LoginOptions {
  var audience: js.UndefOr[String] = js.native
  var realm: String = js.native
}

object DefaultLoginOptions {
  @scala.inline
  def apply(password: String, realm: String, username: String): DefaultLoginOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLoginOptions]
  }
  @scala.inline
  implicit class DefaultLoginOptionsOps[Self <: DefaultLoginOptions] (val x: Self) extends AnyVal {
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
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
  }
  
}

