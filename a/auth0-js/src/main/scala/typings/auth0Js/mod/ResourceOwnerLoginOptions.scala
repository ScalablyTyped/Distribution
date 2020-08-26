package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceOwnerLoginOptions extends LoginOptions {
  var connection: String = js.native
  var device: js.UndefOr[String] = js.native
}

object ResourceOwnerLoginOptions {
  @scala.inline
  def apply(connection: String, password: String, username: String): ResourceOwnerLoginOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOwnerLoginOptions]
  }
  @scala.inline
  implicit class ResourceOwnerLoginOptionsOps[Self <: ResourceOwnerLoginOptions] (val x: Self) extends AnyVal {
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
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
  }
  
}

