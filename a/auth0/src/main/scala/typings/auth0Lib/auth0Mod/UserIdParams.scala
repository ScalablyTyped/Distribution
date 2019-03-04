package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdParams extends js.Object {
  var user_id: java.lang.String
}

object UserIdParams {
  @scala.inline
  def apply(user_id: java.lang.String): UserIdParams = {
    val __obj = js.Dynamic.literal(user_id = user_id)
  
    __obj.asInstanceOf[UserIdParams]
  }
}

