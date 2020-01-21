package typings.alexaVoiceService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenResponse extends js.Object {
  var refreshToken: String
  var token: String
}

object TokenResponse {
  @scala.inline
  def apply(refreshToken: String, token: String): TokenResponse = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenResponse]
  }
}

