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
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): GetRolesDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals.asInstanceOf[js.Any])
    if (name_filter != null) __obj.updateDynamic("name_filter")(name_filter.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolesDataPaged]
  }
}

