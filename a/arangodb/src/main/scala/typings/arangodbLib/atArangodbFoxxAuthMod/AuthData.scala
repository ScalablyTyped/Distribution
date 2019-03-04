package typings
package arangodbLib.atArangodbFoxxAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthData extends js.Object {
  var hash: java.lang.String
  var method: java.lang.String
  var salt: java.lang.String
}

object AuthData {
  @scala.inline
  def apply(hash: java.lang.String, method: java.lang.String, salt: java.lang.String): AuthData = {
    val __obj = js.Dynamic.literal(hash = hash, method = method, salt = salt)
  
    __obj.asInstanceOf[AuthData]
  }
}

