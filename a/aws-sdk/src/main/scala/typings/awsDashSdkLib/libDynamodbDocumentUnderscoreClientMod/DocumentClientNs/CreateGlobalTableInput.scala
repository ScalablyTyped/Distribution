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

object CreateGlobalTableInput {
  @scala.inline
  def apply(GlobalTableName: TableName, ReplicationGroup: ReplicaList): CreateGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName, ReplicationGroup = ReplicationGroup)
  
    __obj.asInstanceOf[CreateGlobalTableInput]
  }
}

