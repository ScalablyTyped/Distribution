package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRolesDataPaged extends GetRolesData {
  var include_totals: scala.Boolean
}

object GetRolesDataPaged {
  @scala.inline
  def apply(
    id: java.lang.String,
    include_totals: scala.Boolean,
    name_filter: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): GetRolesDataPaged = {
    val __obj = js.Dynamic.literal(id = id, include_totals = include_totals)
    if (name_filter != null) __obj.updateDynamic("name_filter")(name_filter)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolesDataPaged]
  }
}

