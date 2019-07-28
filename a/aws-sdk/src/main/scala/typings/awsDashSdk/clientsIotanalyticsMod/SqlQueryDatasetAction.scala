package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlQueryDatasetAction extends js.Object {
  /**
    * Pre-filters applied to message data.
    */
  var filters: js.UndefOr[QueryFilters] = js.undefined
  /**
    * A SQL query string.
    */
  var sqlQuery: SqlQuery
}

object SqlQueryDatasetAction {
  @scala.inline
  def apply(sqlQuery: SqlQuery, filters: QueryFilters = null): SqlQueryDatasetAction = {
    val __obj = js.Dynamic.literal(sqlQuery = sqlQuery)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[SqlQueryDatasetAction]
  }
}

