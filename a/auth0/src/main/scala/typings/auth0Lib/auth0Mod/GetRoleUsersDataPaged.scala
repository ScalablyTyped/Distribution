package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoleUsersDataPaged extends GetRoleUsersData {
  var include_totals: scala.Boolean
}

object GetRoleUsersDataPaged {
  @scala.inline
  def apply(
    id: java.lang.String,
    include_totals: scala.Boolean,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): GetRoleUsersDataPaged = {
    val __obj = js.Dynamic.literal(id = id, include_totals = include_totals)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleUsersDataPaged]
  }
}

