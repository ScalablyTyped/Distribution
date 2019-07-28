package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolePage extends Page {
  var roles: js.Array[Role]
}

object RolePage {
  @scala.inline
  def apply(length: Double, limit: Double, roles: js.Array[Role], start: Double, total: Double): RolePage = {
    val __obj = js.Dynamic.literal(length = length, limit = limit, roles = roles, start = start, total = total)
  
    __obj.asInstanceOf[RolePage]
  }
}

