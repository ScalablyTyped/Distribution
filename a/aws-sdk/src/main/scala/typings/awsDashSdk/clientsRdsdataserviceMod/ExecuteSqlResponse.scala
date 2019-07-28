package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteSqlResponse extends js.Object {
  /**
    * The results of the SQL statement or statements.
    */
  var sqlStatementResults: js.UndefOr[SqlStatementResults] = js.undefined
}

object ExecuteSqlResponse {
  @scala.inline
  def apply(sqlStatementResults: SqlStatementResults = null): ExecuteSqlResponse = {
    val __obj = js.Dynamic.literal()
    if (sqlStatementResults != null) __obj.updateDynamic("sqlStatementResults")(sqlStatementResults)
    __obj.asInstanceOf[ExecuteSqlResponse]
  }
}

