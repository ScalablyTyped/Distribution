package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultDirectoryLoginOptions extends LoginOptions {
  var audience: js.UndefOr[String] = js.native
}

object DefaultDirectoryLoginOptions {
  @scala.inline
  def apply(password: String, username: String): DefaultDirectoryLoginOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDirectoryLoginOptions]
  }
  @scala.inline
  implicit class DefaultDirectoryLoginOptionsOps[Self <: DefaultDirectoryLoginOptions] (val x: Self) extends AnyVal {
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
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
  }
  
}

