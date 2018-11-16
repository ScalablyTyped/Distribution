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
       * Lists the global tables in a specific region.
       */
  var RegionName: js.UndefOr[RegionName] = js.undefined
}

