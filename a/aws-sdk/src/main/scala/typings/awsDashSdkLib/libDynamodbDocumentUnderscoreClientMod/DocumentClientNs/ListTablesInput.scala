package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListTablesInput extends js.Object {
  /**
       * The first table name that this operation will evaluate. Use the value that was returned for LastEvaluatedTableName in a previous operation, so that you can obtain the next page of results.
       */
  var ExclusiveStartTableName: js.UndefOr[TableName] = js.undefined
  /**
       * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
       */
  var Limit: js.UndefOr[ListTablesInputLimit] = js.undefined
}

