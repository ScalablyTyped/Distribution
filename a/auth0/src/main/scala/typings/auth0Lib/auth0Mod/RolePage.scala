package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolePage extends Page {
  var roles: js.Array[Role]
}

object RolePage {
  @scala.inline
  def apply(
    length: scala.Double,
    limit: scala.Double,
    roles: js.Array[Role],
    start: scala.Double,
    total: scala.Double
  ): RolePage = {
    val __obj = js.Dynamic.literal(length = length, limit = limit, roles = roles, start = start, total = total)
  
    __obj.asInstanceOf[RolePage]
  }
}

