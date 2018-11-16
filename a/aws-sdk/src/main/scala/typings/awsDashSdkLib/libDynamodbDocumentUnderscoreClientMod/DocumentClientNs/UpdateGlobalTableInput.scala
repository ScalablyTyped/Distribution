package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateGlobalTableInput extends js.Object {
  /**
       * The global table name.
       */
  var GlobalTableName: TableName
  /**
       * A list of regions that should be added or removed from the global table.
       */
  var ReplicaUpdates: ReplicaUpdateList
}

