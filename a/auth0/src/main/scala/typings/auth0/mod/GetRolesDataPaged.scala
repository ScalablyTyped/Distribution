package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRolesDataPaged extends GetRolesData {
  var include_totals: Boolean
}

object GetRolesDataPaged {
  @scala.inline
  def apply(
    include_totals: Boolean,
    name_filter: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): GetRolesDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals.asInstanceOf[js.Any])
    if (name_filter != null) __obj.updateDynamic("name_filter")(name_filter.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolesDataPaged]
  }
}

