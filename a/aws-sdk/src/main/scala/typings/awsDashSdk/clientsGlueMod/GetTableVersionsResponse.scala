package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableVersionsResponse extends js.Object {
  /**
    * A continuation token, if the list of available versions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * A list of strings identifying available versions of the specified table.
    */
  var TableVersions: js.UndefOr[GetTableVersionsList] = js.undefined
}

object GetTableVersionsResponse {
  @scala.inline
  def apply(NextToken: Token = null, TableVersions: GetTableVersionsList = null): GetTableVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TableVersions != null) __obj.updateDynamic("TableVersions")(TableVersions)
    __obj.asInstanceOf[GetTableVersionsResponse]
  }
}

