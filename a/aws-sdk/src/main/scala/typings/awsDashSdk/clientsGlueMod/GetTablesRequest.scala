package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTablesRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the tables reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The database in the catalog whose tables to list. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  /**
    * A regular expression pattern. If present, only those tables whose names match the pattern are returned.
    */
  var Expression: js.UndefOr[FilterString] = js.undefined
  /**
    * The maximum number of tables to return in a single response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, included if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetTablesRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    CatalogId: CatalogIdString = null,
    Expression: FilterString = null,
    MaxResults: Int | Double = null,
    NextToken: Token = null
  ): GetTablesRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (Expression != null) __obj.updateDynamic("Expression")(Expression)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetTablesRequest]
  }
}

