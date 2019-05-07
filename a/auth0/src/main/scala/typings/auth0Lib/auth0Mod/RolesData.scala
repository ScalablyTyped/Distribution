package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolesData extends js.Object {
  var roles: js.Array[java.lang.String]
}

object RolesData {
  @scala.inline
  def apply(roles: js.Array[java.lang.String]): RolesData = {
    val __obj = js.Dynamic.literal(roles = roles)
  
    __obj.asInstanceOf[RolesData]
  }
}

