package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableVersionsRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  /**
    * The maximum number of table versions to return in one response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is not the first call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The name of the table. For Hive compatibility, this name is entirely lowercase.
    */
  var TableName: NameString
}

object GetTableVersionsRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    TableName: NameString,
    CatalogId: CatalogIdString = null,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: Token = null
  ): GetTableVersionsRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, TableName = TableName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetTableVersionsRequest]
  }
}

