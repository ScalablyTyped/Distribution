package typings.arangodb.authMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthData extends js.Object {
  var hash: String
  var method: String
  var salt: String
}

object AuthData {
  @scala.inline
  def apply(hash: String, method: String, salt: String): AuthData = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthData]
  }
}

