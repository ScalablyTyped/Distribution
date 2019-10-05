package typings.angularDashOauth2.angularMod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var password: String
  var username: String
}

object Data {
  @scala.inline
  def apply(password: String, username: String): Data = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[Data]
  }
}

