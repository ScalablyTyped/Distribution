package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTable extends js.Object {
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.undefined
  /**
    * The regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaList] = js.undefined
}

object GlobalTable {
  @scala.inline
  def apply(GlobalTableName: TableName = null, ReplicationGroup: ReplicaList = null): GlobalTable = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName)
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup)
    __obj.asInstanceOf[GlobalTable]
  }
}

