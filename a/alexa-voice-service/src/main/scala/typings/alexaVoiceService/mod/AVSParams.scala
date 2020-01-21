package typings.alexaVoiceService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AVSParams extends js.Object {
  var clientId: String
  var clientSecret: String
  var debug: Boolean
  var deviceId: String
  var refreshToken: String
}

object AVSParams {
  @scala.inline
  def apply(clientId: String, clientSecret: String, debug: Boolean, deviceId: String, refreshToken: String): AVSParams = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AVSParams]
  }
}

