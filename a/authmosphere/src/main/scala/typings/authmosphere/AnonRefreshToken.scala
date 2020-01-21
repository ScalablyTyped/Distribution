package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefreshToken extends js.Object {
  var refreshToken: String
}

object AnonRefreshToken {
  @scala.inline
  def apply(refreshToken: String): AnonRefreshToken = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRefreshToken]
  }
}

