package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGlobalTablesInput extends js.Object {
  /**
    * The first global table name that this operation will evaluate.
    */
  var ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.undefined
  /**
    * The maximum number of table names to return.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  /**
    * Lists the global tables in a specific Region.
    */
  var RegionName: js.UndefOr[RegionName] = js.undefined
}

object ListGlobalTablesInput {
  @scala.inline
  def apply(
    ExclusiveStartGlobalTableName: TableName = null,
    Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
    RegionName: RegionName = null
  ): ListGlobalTablesInput = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartGlobalTableName != null) __obj.updateDynamic("ExclusiveStartGlobalTableName")(ExclusiveStartGlobalTableName)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName)
    __obj.asInstanceOf[ListGlobalTablesInput]
  }
}

