package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTablesOutput extends js.Object {
  /**
    * The name of the last table in the current page of results. Use this value as the ExclusiveStartTableName in a new request to obtain the next page of results, until all the table names are returned. If you do not receive a LastEvaluatedTableName value in the response, this means that there are no more table names to be retrieved.
    */
  var LastEvaluatedTableName: js.UndefOr[TableName] = js.undefined
  /**
    * The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100. If LastEvaluatedTableName also appears in the output, you can use this value as the ExclusiveStartTableName parameter in a subsequent ListTables request and obtain the next page of results.
    */
  var TableNames: js.UndefOr[TableNameList] = js.undefined
}

object ListTablesOutput {
  @scala.inline
  def apply(LastEvaluatedTableName: TableName = null, TableNames: TableNameList = null): ListTablesOutput = {
    val __obj = js.Dynamic.literal()
    if (LastEvaluatedTableName != null) __obj.updateDynamic("LastEvaluatedTableName")(LastEvaluatedTableName)
    if (TableNames != null) __obj.updateDynamic("TableNames")(TableNames)
    __obj.asInstanceOf[ListTablesOutput]
  }
}

