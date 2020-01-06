package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGlobalTablesInput extends js.Object {
  /**
    * The first global table name that this operation will evaluate.
    */
  var ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.native
  /**
    * The maximum number of table names to return.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * Lists the global tables in a specific Region.
    */
  var RegionName: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.RegionName
  ] = js.native
}

object ListGlobalTablesInput {
  @scala.inline
  def apply(
    ExclusiveStartGlobalTableName: TableName = null,
    Limit: Int | scala.Double = null,
    RegionName: RegionName = null
  ): ListGlobalTablesInput = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartGlobalTableName != null) __obj.updateDynamic("ExclusiveStartGlobalTableName")(ExclusiveStartGlobalTableName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGlobalTablesInput]
  }
}

