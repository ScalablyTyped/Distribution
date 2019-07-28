package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDatabasesResponse extends js.Object {
  /**
    * A list of Database objects from the specified catalog.
    */
  var DatabaseList: typings.awsDashSdk.clientsGlueMod.DatabaseList
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetDatabasesResponse {
  @scala.inline
  def apply(DatabaseList: DatabaseList, NextToken: Token = null): GetDatabasesResponse = {
    val __obj = js.Dynamic.literal(DatabaseList = DatabaseList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetDatabasesResponse]
  }
}

