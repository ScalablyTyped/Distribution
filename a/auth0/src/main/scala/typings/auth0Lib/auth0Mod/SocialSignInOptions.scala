package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialSignInOptions extends js.Object {
  var access_token: java.lang.String
  var connection: java.lang.String
}

object SocialSignInOptions {
  @scala.inline
  def apply(access_token: java.lang.String, connection: java.lang.String): SocialSignInOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("connection")(connection)
    __obj.asInstanceOf[SocialSignInOptions]
  }
}

