package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionPage extends Page {
  var permissions: js.Array[Permission]
}

object PermissionPage {
  @scala.inline
  def apply(length: Double, limit: Double, permissions: js.Array[Permission], start: Double, total: Double): PermissionPage = {
    val __obj = js.Dynamic.literal(length = length, limit = limit, permissions = permissions, start = start, total = total)
  
    __obj.asInstanceOf[PermissionPage]
  }
}

