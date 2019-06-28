package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGlobalTableInput extends js.Object {
  /**
    * The global table name.
    */
  var GlobalTableName: TableName
  /**
    * A list of Regions that should be added or removed from the global table.
    */
  var ReplicaUpdates: ReplicaUpdateList
}

object UpdateGlobalTableInput {
  @scala.inline
  def apply(GlobalTableName: TableName, ReplicaUpdates: ReplicaUpdateList): UpdateGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName, ReplicaUpdates = ReplicaUpdates)
  
    __obj.asInstanceOf[UpdateGlobalTableInput]
  }
}

