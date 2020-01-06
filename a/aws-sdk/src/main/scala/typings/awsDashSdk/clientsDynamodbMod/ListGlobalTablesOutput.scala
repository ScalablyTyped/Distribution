package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGlobalTablesOutput extends js.Object {
  /**
    * List of global table names.
    */
  var GlobalTables: js.UndefOr[GlobalTableList] = js.native
  /**
    * Last evaluated global table name.
    */
  var LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.native
}

object ListGlobalTablesOutput {
  @scala.inline
  def apply(GlobalTables: GlobalTableList = null, LastEvaluatedGlobalTableName: TableName = null): ListGlobalTablesOutput = {
    val __obj = js.Dynamic.literal()
    if (GlobalTables != null) __obj.updateDynamic("GlobalTables")(GlobalTables.asInstanceOf[js.Any])
    if (LastEvaluatedGlobalTableName != null) __obj.updateDynamic("LastEvaluatedGlobalTableName")(LastEvaluatedGlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGlobalTablesOutput]
  }
}

