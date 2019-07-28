package typings.arangodb.atArangodbFoxxAuthMod

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
    val __obj = js.Dynamic.literal(hash = hash, method = method, salt = salt)
  
    __obj.asInstanceOf[AuthData]
  }
}

