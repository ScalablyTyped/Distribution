package typings
package angularDashOauth2Lib.angularMod.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object Data {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Data]
  }
}

