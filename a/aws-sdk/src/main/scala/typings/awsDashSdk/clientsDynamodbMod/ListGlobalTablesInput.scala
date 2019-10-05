package typings.awsDashSdk.clientsDynamodbMod

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
  var RegionName: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.RegionName] = js.undefined
}

object ListGlobalTablesInput {
  @scala.inline
  def apply(
    ExclusiveStartGlobalTableName: TableName = null,
    Limit: Int | scala.Double = null,
    RegionName: RegionName = null
  ): ListGlobalTablesInput = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartGlobalTableName != null) __obj.updateDynamic("ExclusiveStartGlobalTableName")(ExclusiveStartGlobalTableName)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName)
    __obj.asInstanceOf[ListGlobalTablesInput]
  }
}

