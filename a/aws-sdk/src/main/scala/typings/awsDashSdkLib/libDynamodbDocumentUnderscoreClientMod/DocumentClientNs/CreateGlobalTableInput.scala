package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateGlobalTableInput extends js.Object {
  /**
       * The global table name.
       */
  var GlobalTableName: TableName
  /**
       * The regions where the global table needs to be created.
       */
  var ReplicationGroup: ReplicaList
}

