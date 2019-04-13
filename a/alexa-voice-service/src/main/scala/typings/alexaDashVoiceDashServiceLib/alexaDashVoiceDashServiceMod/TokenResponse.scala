package typings
package alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenResponse extends js.Object {
  var refreshToken: java.lang.String
  var token: java.lang.String
}

object TokenResponse {
  @scala.inline
  def apply(refreshToken: java.lang.String, token: java.lang.String): TokenResponse = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken, token = token)
  
    __obj.asInstanceOf[TokenResponse]
  }
}

