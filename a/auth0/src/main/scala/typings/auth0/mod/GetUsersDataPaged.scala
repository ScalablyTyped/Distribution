package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUsersDataPaged extends GetUsersData {
  var include_totals: Boolean
}

object GetUsersDataPaged {
  @scala.inline
  def apply(
    include_totals: Boolean,
    connection: String = null,
    fields: String = null,
    include_fields: js.UndefOr[Boolean] = js.undefined,
    page: Int | Double = null,
    per_page: Int | Double = null,
    q: String = null,
    search_engine: String = null,
    sort: String = null
  ): GetUsersDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(include_fields)) __obj.updateDynamic("include_fields")(include_fields.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (search_engine != null) __obj.updateDynamic("search_engine")(search_engine.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsersDataPaged]
  }
}

