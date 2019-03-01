package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUsersData extends js.Object {
  var connection: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var include_fields: js.UndefOr[scala.Boolean] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var search_engine: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
}

object GetUsersData {
  @scala.inline
  def apply(
    connection: java.lang.String = null,
    fields: java.lang.String = null,
    include_fields: js.UndefOr[scala.Boolean] = js.undefined,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    q: java.lang.String = null,
    search_engine: java.lang.String = null,
    sort: java.lang.String = null
  ): GetUsersData = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(include_fields)) __obj.updateDynamic("include_fields")(include_fields)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q)
    if (search_engine != null) __obj.updateDynamic("search_engine")(search_engine)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[GetUsersData]
  }
}

