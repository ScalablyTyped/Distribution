package typings
package alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AVSParams extends js.Object {
  var clientId: java.lang.String
  var clientSecret: java.lang.String
  var debug: scala.Boolean
  var deviceId: java.lang.String
  var refreshToken: java.lang.String
}

object AVSParams {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    clientSecret: java.lang.String,
    debug: scala.Boolean,
    deviceId: java.lang.String,
    refreshToken: java.lang.String
  ): AVSParams = {
    val __obj = js.Dynamic.literal(clientId = clientId, clientSecret = clientSecret, debug = debug, deviceId = deviceId, refreshToken = refreshToken)
  
    __obj.asInstanceOf[AVSParams]
  }
}

