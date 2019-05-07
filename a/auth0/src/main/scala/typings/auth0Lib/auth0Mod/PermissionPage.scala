package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionPage extends Page {
  var permissions: js.Array[Permission]
}

object PermissionPage {
  @scala.inline
  def apply(
    length: scala.Double,
    limit: scala.Double,
    permissions: js.Array[Permission],
    start: scala.Double,
    total: scala.Double
  ): PermissionPage = {
    val __obj = js.Dynamic.literal(length = length, limit = limit, permissions = permissions, start = start, total = total)
  
    __obj.asInstanceOf[PermissionPage]
  }
}

