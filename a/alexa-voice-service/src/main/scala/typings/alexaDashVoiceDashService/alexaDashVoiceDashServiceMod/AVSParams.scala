package typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod

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
    val __obj = js.Dynamic.literal(clientId = clientId, clientSecret = clientSecret, debug = debug, deviceId = deviceId, refreshToken = refreshToken)
  
    __obj.asInstanceOf[AVSParams]
  }
}

