package typings.authmosphere.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshToken extends js.Object {
  var refreshToken: String
}

object RefreshToken {
  @scala.inline
  def apply(refreshToken: String): RefreshToken = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
}

