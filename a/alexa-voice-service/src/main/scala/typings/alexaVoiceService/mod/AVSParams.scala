package typings.alexaVoiceService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AVSParams extends js.Object {
  var clientId: String = js.native
  var clientSecret: String = js.native
  var debug: Boolean = js.native
  var deviceId: String = js.native
  var refreshToken: String = js.native
}

object AVSParams {
  @scala.inline
  def apply(clientId: String, clientSecret: String, debug: Boolean, deviceId: String, refreshToken: String): AVSParams = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVSParams]
  }
  @scala.inline
  implicit class AVSParamsOps[Self <: AVSParams] (val x: Self) extends AnyVal {
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
  }
  
}

