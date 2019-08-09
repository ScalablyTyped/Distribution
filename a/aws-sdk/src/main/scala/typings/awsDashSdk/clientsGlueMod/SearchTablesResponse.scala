package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTablesResponse extends js.Object {
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * A list of the requested Table objects. The SearchTables response returns only the tables that you have access to.
    */
  var TableList: js.UndefOr[typings.awsDashSdk.clientsGlueMod.TableList] = js.undefined
}

object SearchTablesResponse {
  @scala.inline
  def apply(NextToken: Token = null, TableList: TableList = null): SearchTablesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TableList != null) __obj.updateDynamic("TableList")(TableList)
    __obj.asInstanceOf[SearchTablesResponse]
  }
}

