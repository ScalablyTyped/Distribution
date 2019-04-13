package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTablesResponse extends js.Object {
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * A list of the requested Table objects.
    */
  var TableList: js.UndefOr[TableList] = js.undefined
}

object GetTablesResponse {
  @scala.inline
  def apply(NextToken: Token = null, TableList: TableList = null): GetTablesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TableList != null) __obj.updateDynamic("TableList")(TableList)
    __obj.asInstanceOf[GetTablesResponse]
  }
}

