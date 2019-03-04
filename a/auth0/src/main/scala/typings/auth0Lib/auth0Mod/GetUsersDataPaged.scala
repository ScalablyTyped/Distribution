package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUsersDataPaged extends GetUsersData {
  var include_totals: scala.Boolean
}

object GetUsersDataPaged {
  @scala.inline
  def apply(
    include_totals: scala.Boolean,
    connection: java.lang.String = null,
    fields: java.lang.String = null,
    include_fields: js.UndefOr[scala.Boolean] = js.undefined,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    q: java.lang.String = null,
    search_engine: java.lang.String = null,
    sort: java.lang.String = null
  ): GetUsersDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(include_fields)) __obj.updateDynamic("include_fields")(include_fields)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q)
    if (search_engine != null) __obj.updateDynamic("search_engine")(search_engine)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[GetUsersDataPaged]
  }
}

