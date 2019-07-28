package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGlobalTablesOutput extends js.Object {
  /**
    * List of global table names.
    */
  var GlobalTables: js.UndefOr[GlobalTableList] = js.undefined
  /**
    * Last evaluated global table name.
    */
  var LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.undefined
}

object ListGlobalTablesOutput {
  @scala.inline
  def apply(GlobalTables: GlobalTableList = null, LastEvaluatedGlobalTableName: TableName = null): ListGlobalTablesOutput = {
    val __obj = js.Dynamic.literal()
    if (GlobalTables != null) __obj.updateDynamic("GlobalTables")(GlobalTables)
    if (LastEvaluatedGlobalTableName != null) __obj.updateDynamic("LastEvaluatedGlobalTableName")(LastEvaluatedGlobalTableName)
    __obj.asInstanceOf[ListGlobalTablesOutput]
  }
}

