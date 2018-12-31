package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

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

