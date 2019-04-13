package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteSqlResponse extends js.Object {
  /**
    * Results returned by executing the sql statement(s)
    */
  var sqlStatementResults: SqlStatementResults
}

object ExecuteSqlResponse {
  @scala.inline
  def apply(sqlStatementResults: SqlStatementResults): ExecuteSqlResponse = {
    val __obj = js.Dynamic.literal(sqlStatementResults = sqlStatementResults)
  
    __obj.asInstanceOf[ExecuteSqlResponse]
  }
}

