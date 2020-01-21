package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUsersData extends js.Object {
  var connection: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var include_fields: js.UndefOr[Boolean] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var search_engine: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
}

object GetUsersData {
  @scala.inline
  def apply(
    connection: String = null,
    fields: String = null,
    include_fields: js.UndefOr[Boolean] = js.undefined,
    page: Int | Double = null,
    per_page: Int | Double = null,
    q: String = null,
    search_engine: String = null,
    sort: String = null
  ): GetUsersData = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(include_fields)) __obj.updateDynamic("include_fields")(include_fields.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (search_engine != null) __obj.updateDynamic("search_engine")(search_engine.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsersData]
  }
}

