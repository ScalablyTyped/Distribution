package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionPage extends Page {
  var permissions: js.Array[Permission]
}

object PermissionPage {
  @scala.inline
  def apply(length: Double, limit: Double, permissions: js.Array[Permission], start: Double, total: Double): PermissionPage = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionPage]
  }
}

