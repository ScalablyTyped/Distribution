package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait System extends js.Object {
  var apiAccessToken: String = js.native
  var apiEndpoint: String = js.native
  var application: Application = js.native
  var device: js.Any = js.native
  var user: SessionUser = js.native
}

object System {
  @scala.inline
  def apply(
    apiAccessToken: String,
    apiEndpoint: String,
    application: Application,
    device: js.Any,
    user: SessionUser
  ): System = {
    val __obj = js.Dynamic.literal(apiAccessToken = apiAccessToken.asInstanceOf[js.Any], apiEndpoint = apiEndpoint.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
  @scala.inline
  implicit class SystemOps[Self <: System] (val x: Self) extends AnyVal {
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
    def setApiAccessToken(value: String): Self = this.set("apiAccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiEndpoint(value: String): Self = this.set("apiEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice(value: js.Any): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: SessionUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

