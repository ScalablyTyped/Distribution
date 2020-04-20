package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialSignInOptions extends js.Object {
  var access_token: String
  var connection: String
}

object SocialSignInOptions {
  @scala.inline
  def apply(access_token: String, connection: String): SocialSignInOptions = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialSignInOptions]
  }
}

